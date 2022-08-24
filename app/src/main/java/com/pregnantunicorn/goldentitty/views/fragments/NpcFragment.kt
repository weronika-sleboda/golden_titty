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
import com.pregnantunicorn.goldentitty.databinding.NpcFragmentBinding
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.npcs.CurrentNpc
import com.pregnantunicorn.goldentitty.models.npcs.Npc
import com.pregnantunicorn.goldentitty.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NpcFragment : Fragment() {

    private lateinit var binding: NpcFragmentBinding
    private var npc: Npc? = CurrentNpc.npc()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = NpcFragmentBinding.inflate(inflater, container, false)

        setupName()
        setupIcon()
        updateHealth()
        setupGreeting()
        updateHealth()
        setupRequiredFoodIcon()
        setupFeedButton()
        setupLeaveButton()
        setupFab()

        return binding.root
    }

    private fun setupRequiredFoodIcon() {

        binding.info.foodIcon.setImageResource(npc?.requiredFoodIcon()!!)
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun setupName() {

        binding.name.text = npc?.name
    }

    private fun setupIcon() {

        binding.icon.setImageResource(npc?.icon!!)
    }

    private fun setupGreeting() {

        binding.greeting.text = npc?.greeting?.invoke()
    }

    private fun updateHealth() {

        binding.info.healthProgressBar.max = npc?.maxHealth()!!
        binding.info.healthProgressBar.progress = npc?.health()!!
    }

    private fun updatePlayerStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateFish()
    }

    private fun setupFeedButton() {

        binding.feedButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(npc?.feed()!!) {

                    withContext(Dispatchers.Main) {

                        binding.greeting.text = npc?.afterMeal?.invoke()
                        updateHealth()
                        updatePlayerStatus()
                    }
                }

                else if(npc?.isFed()!!) {

                    withContext(Dispatchers.Main) {

                        binding.greeting.text = npc?.isFedLine?.invoke()
                    }
                }

                else {

                    withContext(Dispatchers.Main) {

                        showMessage()
                    }
                }
            }
        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    override fun onDestroy() {

        npc = null
        super.onDestroy()
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }
}