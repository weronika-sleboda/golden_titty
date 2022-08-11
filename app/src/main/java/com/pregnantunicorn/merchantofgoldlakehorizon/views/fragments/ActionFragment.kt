package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ActionFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*
import kotlin.random.Random

class ActionFragment : Fragment() {

    private lateinit var binding: ActionFragmentBinding
    private var job: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = ActionFragmentBinding.inflate(inflater, container, false)

        setupRunButton()
        setupJumpButton()
        setupClimbButton()
        setupActionButton()
        setupLeaveButton()

        binding.info.timeLeft.text = timer.toString()
        return binding.root
    }

    private var demandedAction = -2
    private var playerAction = -1

    private fun setupRunButton() {

        binding.controller.runButton.setOnClickListener {

            playerAction = 0

            if(playerAction == demandedAction) {

                binding.info.successProgressBar.progress += 10

                if(binding.info.successProgressBar.progress == 100) {

                    job?.cancel()
                    job = null

                    activity?.supportFragmentManager?.commit {

                        replace<PearlTittyFragment>(R.id.world_container)
                    }
                }
            }

            else {

                binding.info.successProgressBar.progress -= 10

                if(binding.info.successProgressBar.progress == 0) {

                    failed = true
                }
            }

            binding.icon.setImageResource(actionIcon)
        }
    }


    private fun setupJumpButton() {

        binding.controller.jumpButton.setOnClickListener {

            playerAction = 1

            if(playerAction == demandedAction) {

                binding.info.successProgressBar.progress += 10

                if (binding.info.successProgressBar.progress == 100) {

                    job?.cancel()
                    job = null

                    activity?.supportFragmentManager?.commit {

                        replace<PearlTittyFragment>(R.id.world_container)
                    }
                }
            }

            else {

                binding.info.successProgressBar.progress -= 10

                if(binding.info.successProgressBar.progress == 0) {

                    failed = true
                }
            }

            binding.icon.setImageResource(actionIcon)
        }
    }


    private var started = false

    private fun setupClimbButton() {

        binding.controller.climbButton.setOnClickListener {

            playerAction = 2

            if(playerAction == demandedAction) {

                binding.info.successProgressBar.progress += 10

                if(binding.info.successProgressBar.progress == 100) {

                    job?.cancel()
                    job = null

                    activity?.supportFragmentManager?.commit {

                        replace<PearlTittyFragment>(R.id.world_container)
                    }
                }
            }

            else {

                binding.info.successProgressBar.progress -= 10

                if(binding.info.successProgressBar.progress == 0) {

                    failed = true
                }
            }

            binding.icon.setImageResource(actionIcon)
        }
    }

    private var actionIcon = R.drawable.run128

    private var timer = 30

    private fun updateTimer() {

        binding.info.timeLeft.text = timer.toString()


        if(timer == 0) {

            job?.cancel()
            job = null

            demandedAction = -2
            playerAction = -1

            CurrentMessage.changeMessage(
                "You Failed",
                R.drawable.seagull64,
                "You failed to enter the building."
            )

            showMessage()

            started = false
            binding.info.successProgressBar.progress = 0
        }
    }

    private var failed = false

    private fun setupActionButton() {

        binding.controller.actionButton.setOnClickListener {

            if(job == null) {

                failed = false
                timer = 30
                demandedAction = -2
                playerAction = -1
                val courage = 1

                if(Merchant.faith().hasAmount(courage)) {

                    Merchant.faith().loseAmount(courage)
                    updateMerchantStatus()
                    started = true

                    job = CoroutineScope(Dispatchers.IO).launch {

                        while(timer > 0) {

                            actionIcon = when(Random.nextInt(3)) {

                                0 -> {

                                    demandedAction = 0
                                    R.drawable.run128
                                }

                                1 -> {

                                    demandedAction = 1
                                    R.drawable.jump128
                                }

                                else -> {

                                    demandedAction = 2
                                    R.drawable.climb128
                                }
                            }

                            timer--
                            updateTimer()

                            withContext(Dispatchers.Main) {

                                binding.icon.setImageResource(actionIcon)

                                if(failed) {

                                    job?.cancel()
                                    job = null

                                    demandedAction = -2
                                    playerAction = -1

                                    CurrentMessage.changeMessage(
                                        "You failed!",
                                        R.drawable.seagull64,
                                        "     You failed.    "
                                    )

                                    showMessage()
                                }
                            }

                            delay(700)
                        }
                    }
                }

                else {

                    CurrentMessage.changeMessage(
                        "No Faith",
                        R.drawable.charisma64,
                        "You don't have enough faith to perform this action."
                    )

                    showMessage()
                }
            }
        }
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as MerchantStatusUpdate
        status.updateFaith()
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
}