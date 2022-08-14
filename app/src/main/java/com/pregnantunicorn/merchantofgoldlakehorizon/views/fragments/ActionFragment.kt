package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ActionFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.CurrentFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.FragmentType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*
import kotlin.random.Random

class ActionFragment : Fragment() {

    private lateinit var binding: ActionFragmentBinding
    private var job: Job? = null
    private var timer = 20
    private var demandedAction = -1
    private var started = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = ActionFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.ACTION_FRAGMENT)
        }

        setupRunButton()
        setupJumpButton()
        setupClimbButton()
        setupActionButton()
        setupLeaveButton()
        setupInfoButton()
        setupFab()

        binding.info.timeLeft.text = timer.toString()
        return binding.root
    }

    private fun stillHasTime(): Boolean {

        return timer >= 0
    }

    private fun makeProgress() {

        binding.info.successProgressBar.progress += 10

        if(binding.info.successProgressBar.progress == 100) {

            job?.cancel()
            job = null
            started = false

            CurrentMessage.changeMessage(
                "Congratulations!",
                R.drawable.stars64,
                "You have managed to enter the building."
            )

            showMessage()
        }
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun fail() {

        job?.cancel()
        job = null
        started = false

        binding.info.successProgressBar.progress = 0

        CurrentMessage.changeMessage(
            "You Failed",
            R.drawable.fail64,
            "Your stunt has been unsuccessful."
        )

        showMessage()
    }

    private fun showOutOfTimeMessage() {

        CurrentMessage.changeMessage(
            "Out Of Time",
            R.drawable.hourglass64,
            "You run out of time."
        )

        showMessage()
    }

    private fun checkWinningCondition(icon: Int) {

        if(stillHasTime()) {

            if(demandedAction == icon) { makeProgress() }

            else { fail() }
        }

        else { showOutOfTimeMessage() }
    }

    private fun setupRunButton() {

        binding.controller.runButton.setOnClickListener {

            if(started) { checkWinningCondition(R.drawable.run128) }
        }
    }


    private fun setupJumpButton() {

        binding.controller.jumpButton.setOnClickListener {

            if(started) { checkWinningCondition(R.drawable.jump128) }
        }
    }

    private fun setupClimbButton() {

        binding.controller.climbButton.setOnClickListener {

            if(started) { checkWinningCondition(R.drawable.climb128) }
        }
    }

    private fun updateTimer() {

        timer--
        binding.info.timeLeft.text = timer.toString()
    }

    private fun startOver()  {

        binding.info.successProgressBar.progress = 0
        timer = 20
        demandedAction = -1
    }

    private fun changeIcon() {

        demandedAction = when(Random.nextInt(3)) {

            0 -> R.drawable.run128
            1 -> R.drawable.jump128
            else -> R.drawable.climb128
        }
    }

    private fun setupActionButton() {

        binding.controller.actionButton.setOnClickListener {

            if(job == null) {

                startOver()

                val agility = 1

                if(Player.agility().hasAmount(agility)) {

                    started = true
                    Player.agility().loseAmount(agility)
                    updateMerchantStatus()

                    job = CoroutineScope(Dispatchers.IO).launch {

                        while(timer > 0) {

                            changeIcon()
                            updateTimer()

                            withContext(Dispatchers.Main) {

                                binding.icon.setImageResource(demandedAction)
                            }

                            delay(700)
                        }
                    }
                }

                else {

                    CurrentMessage.changeMessage(
                        "No Agility",
                        R.drawable.agility64,
                        "You don't have enough agility to perform this action."
                    )

                    showMessage()
                }
            }
        }
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateAgility()
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    private fun goToWorldMap() {

        activity?.supportFragmentManager?.commit {

            replace<EntranceFragment>(R.id.world_container)
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            goToWorldMap()
        }
    }

    private fun setupInfoButton() {

        binding.infoButton.setOnClickListener {

            CurrentMessage.changeMessage(
                "Instructions",
                R.drawable.info64,
                "1. Press the start button.\n" +
                        "2. Follow the icons on the main screen and press the corresponding button.\n" +
                        "3. If you click on an icon that isn't matching the one on the main screen you fail and have to start over.\n" +
                        "4. Watch the hourglass on the left above the main screen. If you run out of time you fail.\n" +
                        "5. When the success progress bar reaches its maximum, you will enter the building."
            )

            showMessage()
        }
    }

    override fun onDestroy() {

        super.onDestroy()
        job?.cancel()
        job = null
    }

}