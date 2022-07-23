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
import kotlinx.coroutines.*

class InvestigationFragment : Fragment() {

    private lateinit var binding: InvestigationFragmentBinding
    private val investigation = CurrentInvestigation.investigationObject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = InvestigationFragmentBinding.inflate(inflater, container, false)

        hideInvestigateButton()
        setupIcon()
        setupInfo()
        setupName()
        setupInvestigateButton()
        setupLeaveButton()
        setupRequirementInfo()

        return binding.root
    }

    private fun hideInvestigateButton() {
        
        if(investigation.isInvestigated()) {

            binding.investigateButton.isVisible = false
        }
    }
    private fun setupName() {

        binding.name.text = investigation.name
    }

    private fun setupIcon() {

        binding.icon.setImageResource(investigation.icon.invoke())
    }

    private fun setupInfo() {

        binding.info.text = investigation.info()
    }

    private fun setupRequirementInfo() {

        binding.requirement.requiredIntelligence.text = investigation.requiredIntelligenceToString()
    }

    private fun updateMerchantIntelligence() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateIntelligence()
    }

    private fun setupInvestigateButton() {

        binding.investigateButton.setOnClickListener {

            if(!investigation.investigate(requireContext(), requireActivity())) {

                showInfoDialogFragment(
                    investigation.dialogMessage().title,
                    investigation.dialogMessage().icon,
                    investigation.dialogMessage().message
                )
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