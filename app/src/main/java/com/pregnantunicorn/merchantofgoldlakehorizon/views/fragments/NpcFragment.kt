package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.NpcFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs.CurrentNpc
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

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
        updateGreeting()
        setupPriceInfo()
        updateFriendshipInfo()
        setupBefriendButton()
        setupLeaveButton()
        hideBefriendButton()

        return binding.root
    }

    private fun setupName() {

        binding.npcName.text = npc.name
    }

    private fun setupIcon() {

        binding.npcIcon.setImageResource(npc.icon)
    }

    private fun updateGreeting() {

        binding.npcGreeting.text = npc.greeting()
    }

    private fun updateFriendshipInfo() {

        binding.info.friendshipAmount.text = npc.friendshipToString().invoke()
    }

    private fun setupPriceInfo() {

        binding.info.requiredGold.text = npc.priceToString()
    }

    private fun hideBefriendButton() {

        if(npc.befriended()) {

            binding.befriendButton.isVisible = false
        }
    }

    private fun updateMerchantGold() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateGoldenCoins()
        statusUpdate.updateFriendCounter()
    }

    private fun setupBefriendButton() {

        binding.befriendButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(npc.befriend()) {

                    withContext(Dispatchers.Main) {

                        hideBefriendButton()
                        updateGreeting()
                        updateFriendshipInfo()
                        updateMerchantGold()

                        if(npc.befriended()) {

                            showInfoDialogFragment(
                                "Friend Added",
                                R.drawable.people64,
                                "${npc.name} is now your friend."
                            )
                        }
                    }
                }

                else {

                    showInfoDialogFragment(
                        npc.dialogMessage().title,
                        npc.dialogMessage().icon,
                        npc.dialogMessage().message
                    )
                }
            }
        }
    }

    private fun showInfoDialogFragment(title: String, icon: Int, message: String) {

        InfoDialogFragment(
            title,
            icon,
            message,
            "OK"
        ).show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }
}