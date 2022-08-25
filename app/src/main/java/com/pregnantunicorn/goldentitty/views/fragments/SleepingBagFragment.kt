package com.pregnantunicorn.goldentitty.views.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.SleepingBagFragmentBinding
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.death.DeathReason
import com.pregnantunicorn.goldentitty.models.death.GameOverCause
import com.pregnantunicorn.goldentitty.models.player.Player
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.npcs.CurrentNpc
import com.pregnantunicorn.goldentitty.models.tent.SleepingBag
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.views.activities.GameOverActivity
import com.pregnantunicorn.goldentitty.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SleepingBagFragment : Fragment() {

    private lateinit var binding: SleepingBagFragmentBinding
    private var sleepingBag: SleepingBag? = SleepingBag()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = SleepingBagFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.SLEEPING_BAG_FRAGMENT)
        }

        setupIcon()
        setupSleepButton()
        setupLeaveButton()
        setupHealthCostToString()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {

            CurrentHandState.changeHandState(HandState.EMPTY)
            fab.setImageResource(CurrentHandState.fabIcon())
        }
    }

    private fun setupIcon() {

        binding.icon.setImageResource(sleepingBag?.icon()!!)
    }

    private fun setupHealthCostToString() {

        binding.requirement.healthCost.text = sleepingBag?.healthCostToString()
    }

    private fun updatePlayerStatus() {

        val statusUpdate = requireActivity() as PlayerStatusUpdate
        statusUpdate.updateHealth()
        statusUpdate.updateEnergy()
    }

    private fun setupSleepButton() {

        binding.sleepButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(sleepingBag?.sleep() == true) {

                    withContext(Dispatchers.Main) {

                        updatePlayerStatus()
                        showMessage()
                        goToWorldMap()
                    }
                }

                else {

                    endTheGame()
                }
            }
        }
    }

    private fun endTheGame() {

        CoroutineScope(Dispatchers.IO).launch {

            if(CurrentNpc.jin().isDead() && CurrentNpc.saphonee().isDead() && Player.isDead()) {

                DeathReason.changeGameOverCause(GameOverCause.EVERYONE_HUNGRY)
            }

            else if(CurrentNpc.jin().isDead() && CurrentNpc.saphonee().isDead()) {

                DeathReason.changeGameOverCause(GameOverCause.SAPHONEE_JIN_HUNGRY)
            }

            else if(CurrentNpc.jin().isDead()) {

                DeathReason.changeGameOverCause(GameOverCause.HUNGRY_JIN)
            }

            else if(CurrentNpc.jin().isDead()) {

                DeathReason.changeGameOverCause(GameOverCause.HUNGRY_SAPHONEE)
            }

            else {

                DeathReason.changeGameOverCause(GameOverCause.HUNGRY_METEOR)
            }

            withContext(Dispatchers.Main) {

                val intent = Intent(context, GameOverActivity::class.java)
                startActivity(intent)
            }
        }
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

    override fun onDestroy() {

        sleepingBag = null
        super.onDestroy()
    }
}