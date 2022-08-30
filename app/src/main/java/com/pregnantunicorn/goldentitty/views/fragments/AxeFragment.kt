package com.pregnantunicorn.goldentitty.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.AxeFragmentBinding
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.meteor.Meteor
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.resources.Resources
import com.pregnantunicorn.goldentitty.models.tools.*
import com.pregnantunicorn.goldentitty.views.callbacks.WorldActivityUiUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class AxeFragment : Fragment() {

    private lateinit var binding: AxeFragmentBinding
    private var job: Job? = null
    private var noise = 0
    private var axe: Tool? = CurrentAxe.axe()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = AxeFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.SNEAK_FRAGMENT)
        }

        setupIcon()
        setupCutButton()
        setupLeaveButton()
        setupInfoButton()
        defineMaxProgress()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun defineMaxProgress() {

        binding.successProgressBar.max = 120
    }

    private fun setupIcon() {

        binding.icon.setImageResource(IconFactory().woodPalm128())
    }

    private fun updateWorldActivityUi() {

        val status = requireActivity() as WorldActivityUiUpdate
        status.updateEnergy()
        status.updateWood()
    }

    private fun updateNoise() {

        noise += 5

        if(noise == 100) {

            noise = 0
        }
    }

    private fun checkWinningCondition() {

        if(binding.axeProgressBar.progress <= 45) {

            binding.successProgressBar.progress = 0

            if(binding.successProgressBar.progress == 0) {

                CurrentMessage.changeMessage(
                    "You failed",
                    R.drawable.fail64,
                    "You failed."
                )

                showMessage()
            }
        }

        else {

            binding.successProgressBar.progress += 60

            if (binding.successProgressBar.progress == 120) {

                binding.successProgressBar.progress = 0

                Resources.wood().addAmount(axe?.hitAmount()!!)
                updateWorldActivityUi()

                CurrentMessage.changeMessage(
                    "Wood Acquired",
                    R.drawable.wood64,
                    "You have acquired wood."
                )

                if(Resources.wood().amountIsMaxed()) {

                    CurrentMessage.changeMessage(
                        "Max Value Reached",
                        R.drawable.wood64,
                        "Max value has been reached."
                    )
                }

                showMessage()
            }
        }
    }

    private fun updateCutButtonText(text: Int) {

        binding.cutButton.text = resources.getString(text)
    }

    private fun setupCutButton() {

        updateCutButtonText(R.string.take_a_swing)
        binding.cutButton.setOnClickListener {

            if(job == null) {

                if(CurrentHandState.handState() == HandState.AXE) {

                    val energy = 1

                    if(Meteor.energy().hasAmount(energy)) {

                        Meteor.energy().loseAmount(energy)
                        updateWorldActivityUi()

                        updateCutButtonText(R.string.cut)

                        job = CoroutineScope(Dispatchers.IO).launch {

                            while(true) {

                                updateNoise()

                                delay(10)

                                withContext(Dispatchers.Main) {

                                    binding.axeProgressBar.progress = noise
                                }
                            }
                        }
                    }

                    else {

                        CurrentMessage.changeMessage(
                            "No Energy",
                            IconFactory().energy64(),
                            "You don't have enough energy to perform this action."
                        )

                        showMessage()
                    }
                }

                else {

                    CurrentMessage.changeMessage(
                        "No Axe",
                        IconFactory().info64(),
                        "Equip an axe."
                    )

                    showMessage()
                }
            }

            else {

                job?.cancel()
                job = null
                updateCutButtonText(R.string.take_a_swing)
                checkWinningCondition()
            }
        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
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

    override fun onDestroy() {
        super.onDestroy()

        job?.cancel()
        job = null
    }

    private fun setupInfoButton() {

        binding.info.infoButton.setOnClickListener {

            CurrentMessage.changeMessage(
                "Instructions",
                R.drawable.info64,
                "1. Press hide button to see the power meter moving.\n" +
                        "2. Press cut button when you see the power meter being above 45% . The power meter has the max value of 100.\n" +
                        "3. When your cut is successful the success progress bar will move by 20.\n" +
                        "4. Cut until the success progress bar reaches its maximum value."
            )

            showMessage()
        }
    }
}