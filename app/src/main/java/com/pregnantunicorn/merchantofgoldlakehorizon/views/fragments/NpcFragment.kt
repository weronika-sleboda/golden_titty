package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.NpcFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs.CurrentNpc

class NpcFragment : Fragment() {

    private lateinit var binding: NpcFragmentBinding
    private val npc = CurrentNpc.npc()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = NpcFragmentBinding.inflate(inflater, container, false)

        setupName()
        setupIcon()
        setupGreeting()
        setupFriendshipInfo()
        setupTradeButton()
        setupLeaveButton()

        return binding.root
    }

    private fun setupName() {

        binding.npcName.text = npc.name
    }

    private fun setupIcon() {

        binding.npcIcon.setImageResource(npc.icon)
    }

    private fun setupGreeting() {

        binding.npcGreeting.text = npc.greeting()
    }

    private fun setupFriendshipInfo() {

        binding.info.friendshipAmount.text = npc.friendshipToString()
    }

    private fun setupTradeButton() {

        binding.tradeButton.setOnClickListener {

            npc.trade()

            activity?.supportFragmentManager?.commit {

                replace<CustomerFragment>(R.id.world_container)
            }
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<WorldMapFragment>(R.id.world_container)
            }
        }
    }
}