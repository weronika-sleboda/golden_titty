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
import com.pregnantunicorn.goldentitty.databinding.ExcavationFragmentBinding
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.excavation.CurrentExcavationSite
import com.pregnantunicorn.goldentitty.models.excavation.ExcavationSite
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.meteor.Meteor
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.views.adapters.ExcavationTileAdapter
import com.pregnantunicorn.goldentitty.views.callbacks.WorldActivityUiUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ExcavationFragment: Fragment(), ExcavationTileAdapter.TileListener {

    private lateinit var binding: ExcavationFragmentBinding
    private lateinit var adapter: ExcavationTileAdapter
    private lateinit var layoutManager: GridLayoutManager
    private var excavationSite: ExcavationSite? = CurrentExcavationSite.excavation()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = ExcavationFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.EXCAVATION_FRAGMENT)
        }

        updateName()
        updateExcavationSite()
        setupInfoButton()
        setupLeaveButton()
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

    private fun updateName() {

        binding.name.text = excavationSite?.name
    }

    private fun updateExcavationSite() {

        adapter = ExcavationTileAdapter(excavationSite?.excavation()!!, this)
        layoutManager = GridLayoutManager(context, 4)
        binding.excavationRecycler.adapter = adapter
        binding.excavationRecycler.layoutManager = layoutManager
    }

    private fun updateWorldActivityUi() {

        val status = requireActivity() as WorldActivityUiUpdate
        status.updateEnergy()
    }
    override fun onClickTile(position: Int) {

        if(CurrentHandState.handState() == HandState.SHOVEL) {

            val energy = 1

            if(Meteor.energy().hasAmount(energy)) {

                Meteor.energy().loseAmount(energy)
                updateWorldActivityUi()

                excavationSite?.excavation()?.get(position)?.onClick()
                excavationSite = CurrentExcavationSite.excavation()
                updateExcavationSite()

                if(excavationSite!!.keyPosition() == position) {

                    excavationSite!!.addKeyAlgorithm.invoke()

                    CurrentMessage.changeMessage(
                        excavationSite!!.keyItemName,
                        excavationSite!!.keyItemIcon,
                        "A key item has been added to your backpack."
                    )

                    showMessage()

                    excavationSite!!.completeExcavation()
                    goToWorldMap()
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

            CurrentMessage.changeMessage(
                "No Shovel",
                R.drawable.shovel64,
                "Equip a shovel."
            )

            showMessage()
        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    private fun setupInfoButton() {

        binding.infoButton.setOnClickListener {

            CurrentMessage.changeMessage(
                "Instructions",
                R.drawable.info64,
                "Click on the rectangle tile in order to dig. When the rectangle changes its color, it means the tile has been excavated. Dig until you find an item."
            )

            showMessage()
        }
    }

    private fun goToWorldMap() {

        activity?.supportFragmentManager?.commit {

            replace<LocationFragment>(R.id.world_container)
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            excavationSite!!.leave()
            goToWorldMap()
        }
    }

    override fun onDestroy() {

        excavationSite = null
        super.onDestroy()
    }
}