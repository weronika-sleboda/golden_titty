package com.pregnantunicorn.goldentitty.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.PalmFragmentBinding
import com.pregnantunicorn.goldentitty.models.tools.*
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.models.player.Player
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.views.adapters.PalmAdapter
import com.pregnantunicorn.goldentitty.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class PalmFragment: Fragment() {

    private lateinit var binding: PalmFragmentBinding
    private lateinit var adapter: PalmAdapter
    private lateinit var layoutManager: GridLayoutManager
    private var boomerang: Boomerang? = CurrentBoomerang.boomerang()
    private var palm: CoconutPalm? = boomerang?.palm()

    private var job: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = PalmFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.PALM_FRAGMENT)
        }

        updateName()
        updateRange(palm?.range()!!)
        setupLeaveButton()
        setupFab()
        setupInfoButton()
        setupFab()

        return binding.root
    }

    private fun updateName() {

        binding.name.text = palm?.name()
    }

    private fun updateRange(range: Array<PalmTile>) {

        adapter = PalmAdapter(range)
        layoutManager = GridLayoutManager(context, 4)
        binding.boomerangTileRecycler.adapter = adapter
        binding.boomerangTileRecycler.layoutManager = layoutManager
    }

    private fun updatePlayerStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateEnergy()
        status.updateCoconuts()
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)

        fab?.setOnClickListener {

            if(CurrentHandState.handState() == HandState.BOOMERANG) {

                if(job == null) {

                    val energy = 1

                    if(Player.energy().hasAmount(energy)) {

                        fab.setImageResource(R.drawable.grab64)
                        Player.energy().loseAmount(energy)
                        updatePlayerStatus()

                        job = CoroutineScope(Dispatchers.IO).launch {

                            while(true) {

                                palm = boomerang?.palm()

                                withContext(Dispatchers.Main) {

                                    updateRange(palm?.newRange(boomerang?.icon()!!)!!)
                                }

                                delay(boomerang?.speed?.invoke()!!)
                            }
                        }
                    }

                    else {

                        CurrentMessage.changeMessage(
                            "No Accuracy",
                            R.drawable.accuracy64,
                            "You don't have enough accuracy to perform this action."
                        )

                        showMessage()
                    }
                }

                else {

                    job?.cancel()
                    job = null

                    CoroutineScope(Dispatchers.IO).launch {

                        withContext(Dispatchers.Main) {

                            fab.setImageResource(boomerang?.icon()!!)
                            updateRange(palm?.range()!!)
                        }

                        if(palm?.checkHitCondition(boomerang?.hitAmount()!!) == true)
                        {

                            withContext(Dispatchers.Main) {

                                updatePlayerStatus()
                                showMessage()
                            }
                        }
                    }
                }
            }

            else {

                CurrentMessage.changeMessage(
                    "No Boomerang",
                    R.drawable.info64,
                    "Equip a boomerang."
                )

                showMessage()
            }
        }
    }

    private fun setupInfoButton() {

        binding.info.infoButton.setOnClickListener {

            CurrentMessage.changeMessage(
                "Instructions",
                R.drawable.info64,
                "1. Grab a boomerang from your backpack.\n" +
                        "2. Click on the boomerang icon at the bottom app bar in order to throw it.\n" +
                        "3. When the boomerang meets the target, click on the hand icon to bring back the boomerang.\n" +
                        "4. If you bring back the boomerang while it hits the target at the right time, you get the fruit."
            )

            showMessage()
        }
    }

    private fun setupLeaveButton() {

        binding.info.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }

    override fun onDestroy() {

        job?.cancel()
        job = null

        boomerang = null
        palm = null

        super.onDestroy()
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

}