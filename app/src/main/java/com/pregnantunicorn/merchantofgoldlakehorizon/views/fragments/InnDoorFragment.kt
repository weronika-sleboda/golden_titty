package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.InnDoorFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentInnDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class InnDoorFragment : Fragment() {

    private lateinit var binding: InnDoorFragmentBinding
    private val door = CurrentInnDoor.paidDoor()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = InnDoorFragmentBinding.inflate(inflater, container, false)

        setupBuildingIcon()
        setupBuildingName()
        setupInfo()
        setupPriceInfo()
        setupEnterButton()
        setupLeaveButton()
        setupOpeningInfo()
        return binding.root
    }

    private fun setupBuildingName() {

        binding.buildingName.text = door.buildingName
    }

    private fun setupBuildingIcon() {

        binding.buildingIcon.setImageResource(door.doorIcon.invoke())
    }

    private fun setupInfo() {

        binding.buildingInfo.text = door.buildingInfo
    }

    private fun setupOpeningInfo() {

        binding.requirement.closingTime.text = door.closingInfo
    }

    private fun setupPriceInfo() {

        binding.requirement.requiredGold.text = door.priceToString()
    }

    private fun updateMerchantGold() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateGoldenCoins()
    }

    private fun setupEnterButton() {

        binding.enterButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                door.open()

                if(door.allowedToEnter()) {

                    withContext(Dispatchers.Main) {

                        updateMerchantGold()

                        activity?.supportFragmentManager?.commit {

                            replace<BedFragment>(R.id.world_container)

                        }
                    }

                }

                else {

                    showInfoDialogFragment(
                        "Too Expensive",
                        R.drawable.golden_coin_64,
                        "You don't have enough golden coins to rent the bedroom."
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