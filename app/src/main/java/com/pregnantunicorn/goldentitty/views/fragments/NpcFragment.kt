package com.pregnantunicorn.goldentitty.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.NpcFragmentBinding
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.npcs.LadySilvia
import com.pregnantunicorn.goldentitty.models.npcs.Npc
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.views.callbacks.WorldActivityUiUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NpcFragment : Fragment() {

    private lateinit var binding: NpcFragmentBinding
    private var npc: Npc? = LadySilvia.ladySilvia()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = NpcFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.NPC_FRAGMENT)
        }

        setupName()
        setupIcon()
        updateHealth()
        setupGreeting()
        updateHealth()
        setupRequiredFoodIcon()
        setupFeedButton()
        setupLeaveButton()
        setupFab()
        hideFeedButton()
        hideAskButton()
        hideHealthBar()
        setupAskButton()

        return binding.root
    }

    private fun hideHealthBar() {

        if(LadySilvia.ladySilvia().hasHouse()) {

            binding.info.npcStatus.isVisible = false
        }
    }

    private fun hideFeedButton() {

        if(LadySilvia.ladySilvia().hasHouse()) {

            binding.feedButton.isVisible = false
        }
    }

    private fun hideAskButton() {

        if(!LadySilvia.ladySilvia().hasHouse()) {

            binding.askButton.isVisible = false
        }
    }

    private fun setupRequiredFoodIcon() {

        binding.info.foodIcon.setImageResource(npc?.requiredFoodIcon()!!)
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {

            CurrentHandState.changeHandState(HandState.EMPTY)
            fab.setImageResource(CurrentHandState.fabIcon())
        }
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

    private fun updateWorldActivityUi() {

        val status = requireActivity() as WorldActivityUiUpdate
        status.updateCoconuts()
    }

    private fun setupFeedButton() {

        binding.feedButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(npc?.feed()!!) {

                    withContext(Dispatchers.Main) {

                        binding.greeting.text = npc?.afterMeal?.invoke()
                        updateHealth()
                        updateWorldActivityUi()
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

    private fun setupAskButton() {

        binding.askButton.setOnClickListener {

            if(CurrentHandState.handState() == HandState.KEY_ITEM) {

                binding.greeting.text = LadySilvia.ladySilvia().advice.invoke()
            }

            else {

                CurrentMessage.changeMessage(
                    "No Key Item",
                    R.drawable.info64,
                    "Equip a key item and click on the ask button. " +
                            "Lady Silvia will then tell you something about the item that you hold."
                )

                showMessage()
            }
        }
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