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
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.HammerFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.CurrentFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.FragmentType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.tools.CurrentHandState
import com.pregnantunicorn.merchantofgoldlakehorizon.models.tools.HandState
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*
import kotlin.random.Random

class HammerFragment : Fragment() {

    private lateinit var binding: HammerFragmentBinding
    private var job: Job? = null
    private var timer = 20
    private var demandedAction = -1
    private var started = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = HammerFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.ACTION_FRAGMENT)
        }

        setupLiftButton()
        setupDigButton()
        setupSmashButton()
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

            Player.stone().addAmount(1)
            updateMerchantStatus()

            CurrentMessage.changeMessage(
                "Stone acquired",
                R.drawable.stone64,
                "You have acquired stone."
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
            "You have failed."
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

    private fun setupLiftButton() {

        binding.controller.liftButton.setOnClickListener {

            if(started) { checkWinningCondition(R.drawable.lift128) }
        }
    }


    private fun setupDigButton() {

        binding.controller.digButton.setOnClickListener {

            if(started) { checkWinningCondition(R.drawable.dig128) }
        }
    }

    private fun setupSmashButton() {

        binding.controller.smashButton.setOnClickListener {

            if(started) { checkWinningCondition(R.drawable.smash128) }
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

            0 -> R.drawable.lift128
            1 -> R.drawable.smash128
            else -> R.drawable.dig128
        }
    }

    private fun setupActionButton() {

        binding.controller.actionButton.setOnClickListener {

            if(job == null) {

                if(CurrentHandState.handState() == HandState.HAMMER) {

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

                                delay(800)
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

                else {

                    CurrentMessage.changeMessage(
                        "No Hammer",
                        R.drawable.hammer64,
                        "Equip a hammer."
                    )

                    showMessage()
                }

            }
        }
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateAgility()
        status.updateStone()
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