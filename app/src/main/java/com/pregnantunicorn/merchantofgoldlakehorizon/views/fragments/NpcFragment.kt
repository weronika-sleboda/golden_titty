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
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.NpcFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NpcFragment : Fragment() {

    private lateinit var binding: NpcFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = NpcFragmentBinding.inflate(inflater, container, false)

        setupName()
        setupIcon()
        updateGreeting()
        setupPriceInfo()
        updateFriendshipInfo()
        setupBefriendButton()
        setupLeaveButton()
        hideBefriendButton()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun setupName() {

        binding.npcName.text = "npc.name"
    }

    private fun setupIcon() {

        //binding.npcIcon.setImageResource()
    }

    private fun updateGreeting() {

        binding.npcGreeting.text = "npc.greeting()"
    }

    private fun updateFriendshipInfo() {

        binding.info.friendshipAmount.text = "npc.friendshipToString().invoke()"
    }

    private fun setupPriceInfo() {

        binding.info.requiredGold.text = "npc.priceToString()"
    }

    private fun hideBefriendButton() {


    }

    private fun updateMerchantGold() {

        val statusUpdate = requireActivity() as PlayerStatusUpdate

    }

    private fun setupBefriendButton() {

        binding.befriendButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

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
}