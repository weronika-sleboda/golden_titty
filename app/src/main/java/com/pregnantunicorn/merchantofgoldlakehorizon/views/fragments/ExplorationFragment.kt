package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ExplorationFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.exploration.Cave
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.GemUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ExplorationFragment : Fragment() {

    private lateinit var binding: ExplorationFragmentBinding
    private val location = Cave()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = ExplorationFragmentBinding.inflate(inflater, container, false)

        setupName()
        setupIcon()
        setupInfo()
        setupRequiredEnergyInfo()
        setupExploreButton()
        setupLeaveButton()
        return binding.root
    }

    private fun setupName() {

        binding.locationName.text = location.name
    }

    private fun setupIcon() {

        binding.locationIcon.setImageResource(location.icon())
    }

    private fun setupInfo() {

        binding.locationInfo.text = location.info
    }

    private fun setupRequiredEnergyInfo() {

        binding.requirement.requiredEnergy.text = location.requiredEnergyToString()
    }

    private fun updateStatus() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateEnergy()

        when(location.treasure().gemUpdateType) {

            GemUpdateType.EMERALD -> statusUpdate.updateEmerald()
            GemUpdateType.SAPPHIRE -> statusUpdate.updateSapphire()
            GemUpdateType.RUBY -> statusUpdate.updateRuby()

            GemUpdateType.NONE -> {}
        }
    }

    private fun setupExploreButton() {

        binding.exploreButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(location.explore()) {

                    withContext(Dispatchers.Main) {

                        showInfoDialogFragment(
                            location.treasure().name,
                            location.treasure().icon,
                            location.treasure().message
                        )

                        updateStatus()
                        location.generateNewTreasure()
                    }
                }

                else {

                    showInfoDialogFragment(
                        "No energy",
                        R.drawable.energy64,
                        "You don't have enough energy."
                    )
                }

            }
        }
    }

    private fun showInfoDialogFragment(title: String, icon: Int, message: String) {

        InfoDialogFragment(
            title,
            icon,
            message,
            "OK"
        ).show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<WorldMapFragment>(R.id.world_container)
            }
        }
    }
}