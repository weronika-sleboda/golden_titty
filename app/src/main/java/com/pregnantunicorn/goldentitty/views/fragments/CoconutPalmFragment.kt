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
import com.pregnantunicorn.goldentitty.databinding.SupplierFragmentBinding
import com.pregnantunicorn.goldentitty.models.tools.*
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.models.meteor.Meteor
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.views.adapters.ToolTileAdapter
import com.pregnantunicorn.goldentitty.views.callbacks.WorldActivityUiUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class CoconutPalmFragment: Fragment() {

    private lateinit var binding: SupplierFragmentBinding
    private lateinit var adapter: ToolTileAdapter
    private lateinit var layoutManager: GridLayoutManager
    private var boomerang: Boomerang? = CurrentBoomerang.boomerang()
    private var palm: CoconutPalm? = boomerang?.palm()

    private var job: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = SupplierFragmentBinding.inflate(inflater, container, false)

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

    private fun updateRange(range: Array<ToolTile>) {

        adapter = ToolTileAdapter(range)
        layoutManager = GridLayoutManager(context, 4)
        binding.supplierTileRecycler.adapter = adapter
        binding.supplierTileRecycler.layoutManager = layoutManager
    }

    private fun updateWorldActivityUi() {

        val status = requireActivity() as WorldActivityUiUpdate
        status.updateEnergy()
        status.updateCoconuts()
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)

        fab?.setOnClickListener {

            if(CurrentHandState.handState() == HandState.BOOMERANG) {

                if(job == null) {

                    val energy = 1

                    if(Meteor.energy().hasAmount(energy)) {

                        fab.setImageResource(IconFactory().emptyHand64())
                        Meteor.energy().loseAmount(energy)
                        updateWorldActivityUi()

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
                            "No Energy",
                            R.drawable.energy64,
                            "You don't have enough energy to perform this action."
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

                                updateWorldActivityUi()
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
                        "4. If you bring back the boomerang while it hits the target and you have the right timing, you get the fruit."
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