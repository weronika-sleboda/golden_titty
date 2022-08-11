package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.BedFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.inn.CurrentBed
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.activities.GameOverActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BedFragment : Fragment() {

    private lateinit var binding: BedFragmentBinding
    private val bed = CurrentBed.bed()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = BedFragmentBinding.inflate(inflater, container, false)

        setupIcon()
        setupSleepButton()
        setupLeaveButton()
        setupHealthCostToString()

        return binding.root
    }

    private fun setupIcon() {

        binding.icon.setImageResource(bed.icon())
    }

    private fun setupHealthCostToString() {

        binding.requirement.healthCost.text = bed.healthCostToString()
    }

    private fun updateMerchantStatus() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateEnergy()
        statusUpdate.updateFaith()
        statusUpdate.updateHealth()
        statusUpdate.updateIntelligence()
    }

    private fun setupSleepButton() {

        binding.sleepButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                bed.sleep()

                withContext(Dispatchers.Main) {

                    if(Merchant.isDead()) {

                        endTheGame()
                    }

                    else {

                        updateMerchantStatus()
                        showMessage()
                        goToWorldMap()
                    }
                }
            }
        }
    }

    private fun endTheGame() {

        val intent = Intent(context, GameOverActivity::class.java)
        startActivity(intent)
    }

    private fun goToWorldMap() {

        activity?.supportFragmentManager?.commit {

            replace<LocationFragment>(R.id.world_container)
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            goToWorldMap()
        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }
}