package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.InvestigationFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class InvestigationFragment : Fragment() {

    private lateinit var binding: InvestigationFragmentBinding
    private val investigation = CurrentInvestigation.investigationObject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = InvestigationFragmentBinding.inflate(inflater, container, false)

        hideRequirement()
        hideInvestigateButton()
        updateIcon()
        updateInfo()
        updateButtonText()
        updateName()
        setupInvestigateButton()
        setupLeaveButton()
        setupRequirementInfo()

        return binding.root
    }

    private fun hideInvestigateButton() {
        
        if(investigation.isEmpty()) {

            binding.investigateButton.isVisible = false
        }
    }
    private fun updateName() {

        binding.name.text = investigation.name()
    }

    private fun updateIcon() {

        binding.icon.setImageResource(investigation.icon())
    }

    private fun updateInfo() {

        binding.info.text = investigation.info()
    }

    private fun updateButtonText() {

        binding.investigateButton.text = investigation.buttonText()
    }
    private fun setupRequirementInfo() {

        binding.requirement.requiredIntelligence.text = investigation.requiredIntelligenceToString()
    }

    private fun hideRequirement() {

        if(investigation.isInvestigated()) {

            binding.requirement.root.isVisible = false
        }
    }

    private fun updateMerchantStatus() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateIntelligence()
        statusUpdate.updateGoldenCoins()
    }

    private fun setupInvestigateButton() {

        binding.investigateButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(investigation.investigate()) {

                    withContext(Dispatchers.Main) {

                        updateMerchantStatus()
                        updateInfo()
                        updateName()
                        updateIcon()
                        updateButtonText()
                        hideInvestigateButton()
                        hideRequirement()
                    }
                }

                else {

                    withContext(Dispatchers.Main) {

                        showInfoDialogFragment(
                            investigation.dialogMessage().title,
                            investigation.dialogMessage().icon,
                            investigation.dialogMessage().message
                        )
                    }
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

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }
}