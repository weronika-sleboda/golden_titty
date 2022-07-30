package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.SkillManagerFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.StatusUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.skill_upgrade.CurrentSkillManager
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SkillManagerFragment: Fragment() {

    private lateinit var binding: SkillManagerFragmentBinding
    private val skillManager = CurrentSkillManager.skillManager()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = SkillManagerFragmentBinding.inflate(inflater, container, false)

        setupPriceInfo()
        setupName()
        setupIcon()
        setupInfo()
        setupUpgradeButton()
        setupLeaveButton()

        return binding.root
    }

    private fun setupPriceInfo() {

        binding.requirement.requiredGold.text = skillManager.priceToString()
    }

    private fun setupIcon() {

        binding.icon.setImageResource(skillManager.icon)
    }

    private fun setupName() {

        binding.name.text = skillManager.name
    }

    private fun setupInfo() {

        binding.info.text = skillManager.info
    }

    private fun updateMerchantStatus() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate

        when(skillManager.statusUpdateType) {

            StatusUpdateType.ENERGY -> statusUpdate.updateEnergy()
            StatusUpdateType.PERSUASION -> statusUpdate.updatePersuasion()
            StatusUpdateType.CHARISMA -> statusUpdate.updateCharisma()
            StatusUpdateType.INTELLIGENCE -> statusUpdate.updateIntelligence()
        }

        statusUpdate.updateGoldenCoins()
    }

    private fun setupUpgradeButton() {

        binding.upgradeButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(skillManager.buy()) {

                    withContext(Dispatchers.Main) {

                        updateMerchantStatus()
                        showMessage()
                    }
                }

                else {  showMessage() }

            }
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }
}