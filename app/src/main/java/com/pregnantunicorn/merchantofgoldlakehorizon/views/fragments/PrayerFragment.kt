package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.PrayerFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.prayer.Creator
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.YesOrNoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PrayerFragment : Fragment() {

    private lateinit var binding: PrayerFragmentBinding
    private val creator = Creator()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = PrayerFragmentBinding.inflate(inflater, container, false)

        updateInfo()
        updateButtonText()
        setupMissionInfoButton()
        setupGiveUpButton()

        return binding.root
    }

    private fun updateInfo() {

        binding.missionInfo.text = creator.info()
    }

    private fun updateButtonText() {

        binding.missionInfoButton.text = creator.buttonText()
    }

    private fun setupMissionInfoButton() {

        binding.missionInfoButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                creator.giveMeDetails()

                withContext(Dispatchers.Main) {

                    updateInfo()
                    updateButtonText()
                }
            }
        }
    }

    private fun setupGiveUpButton() {

        binding.giveUpButton.setOnClickListener {

            showYesOrNoDialogFragment(
                creator.areYouSureMessage().title,
                creator.areYouSureMessage().icon,
                creator.areYouSureMessage().message
            )
            {

                creator.giveUp()

                if(creator.hasGivenUp()) {

                    activity?.supportFragmentManager?.commit {

                        replace<ExplorationFragment>(R.id.world_container)
                    }
                }
            }
        }
    }

    private fun showYesOrNoDialogFragment(
        title: String, icon: Int,
        message: String,
        yesAlgorithm: () -> Unit
    )
    {

        YesOrNoDialogFragment(
            title,
            icon,
            message,
        )
        { yesAlgorithm.invoke() }.show(parentFragmentManager, YesOrNoDialogFragment.YES_OR_NO_TAG)
    }
}