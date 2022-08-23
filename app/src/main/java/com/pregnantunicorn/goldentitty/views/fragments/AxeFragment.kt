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
import com.pregnantunicorn.goldentitty.models.player.Player
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.tools.*
import com.pregnantunicorn.goldentitty.views.callbacks.PlayerStatusUpdate
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

    private fun updatePlayerStatus() {

        val status = requireActivity() as PlayerStatusUpdate
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

            binding.successProgressBar.progress += 40

            if (binding.successProgressBar.progress == 120) {

                binding.successProgressBar.progress = 0

                Player.wood().addAmount(axe?.hitAmount()!!)
                updatePlayerStatus()

                CurrentMessage.changeMessage(
                    "Wood Acquired",
                    R.drawable.wood64,
                    "You have acquired wood."
                )

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

                    if(Player.energy().hasAmount(energy)) {

                        Player.energy().loseAmount(energy)
                        updatePlayerStatus()

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
                            "No Stealth",
                            R.drawable.stealth64,
                            "You don't have enough stealth to perform this action."
                        )

                        showMessage()
                    }
                }

                else {

                    CurrentMessage.changeMessage(
                        "No Axe",
                        R.drawable.chieftain_axe64,
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
                "1. Press hide button to see the noise meter moving.\n" +
                        "2. Press sneak button when you see the noise being minimal.\n" +
                        "3. The noise meter has the value of 100 and the noise you are making should be below 40.\n" +
                        "4. When your sneak is successful the success progress bar will move by 20.\n" +
                        "5. Sneak until the success progress reaches its maximum value."
            )

            showMessage()
        }
    }
}