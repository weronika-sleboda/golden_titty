package com.pregnantunicorn.goldentitty.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.ChidinmaStatueFragmentBinding
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.chidinmas_statue.ChidinmasStatue
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.key_items.CurrentKeyItem
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class ChidinmaStatueFragment : Fragment() {

    private lateinit var binding: ChidinmaStatueFragmentBinding
    private var chidinmasStatue: ChidinmasStatue? = ChidinmasStatue()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = ChidinmaStatueFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.CHIDINMA_STATUE_FRAGMENT)
        }

        setupFab()
        setupIcon()
        updateStoneIcons()
        setupInsertButton()
        setupLeaveButton()

        return binding.root
    }

    private fun updateStoneIcons() {

        if(chidinmasStatue?.rubyInserted()!!) {

            binding.insertionController.ruby.setImageResource(IconFactory().ruby64())
        }

        if(chidinmasStatue?.emeraldInserted()!!) {

            binding.insertionController.emerald.setImageResource(IconFactory().emerald64())
        }

        if(chidinmasStatue?.sapphireInserted()!!) {

            binding.insertionController.sapphire.setImageResource(IconFactory().sapphire64())
        }
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {

            CurrentHandState.changeHandState(HandState.EMPTY)
            fab.setImageResource(CurrentHandState.fabIcon())
        }
    }

    private fun setupIcon() {

        binding.icon.setImageResource(IconFactory().chidinmaStatue128())
    }

    private fun updateFabIcon() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab.setImageResource(CurrentHandState.fabIcon())
    }

    private fun setupInsertButton() {

        binding.insertButton.setOnClickListener {

            if(CurrentHandState.handState() == HandState.KEY_ITEM &&
                CurrentKeyItem.keyItemType() == KeyItemType.RUBY) {

                chidinmasStatue?.insertRuby()
                CurrentKeyItem.keyItem().remove()
                updateStoneIcons()

                CurrentHandState.changeHandState(HandState.EMPTY)
                updateFabIcon()
            }

            else if(
                CurrentHandState.handState() == HandState.KEY_ITEM &&
                CurrentKeyItem.keyItemType() == KeyItemType.EMERALD) {

                chidinmasStatue?.insertEmerald()
                CurrentKeyItem.keyItem().remove()
                updateStoneIcons()

                CurrentHandState.changeHandState(HandState.EMPTY)
                updateFabIcon()
            }

            else if(
                CurrentHandState.handState() == HandState.KEY_ITEM &&
                CurrentKeyItem.keyItemType() == KeyItemType.SAPPHIRE) {

                chidinmasStatue?.insertSapphire()
                CurrentKeyItem.keyItem().remove()
                updateStoneIcons()

                CurrentHandState.changeHandState(HandState.EMPTY)
                updateFabIcon()
            }

            else {

                CurrentMessage.changeMessage(
                    "Meteor",
                    R.drawable.meteor64,
                    "Hmmm... Nothing happened..."
                )

                showMessage()
            }

            if(chidinmasStatue!!.puzzleIsSolved()) {

                CoroutineScope(Dispatchers.IO).launch {

                    CurrentMessage.changeMessage(
                        "Meteor",
                        R.drawable.meteor64,
                        "What's that? A secret gate?"
                    )

                    withContext(Dispatchers.Main) {

                        activity?.supportFragmentManager?.commit {

                            replace<GoldenTittyFragment>(R.id.world_container)
                        }
                    }
                }
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
