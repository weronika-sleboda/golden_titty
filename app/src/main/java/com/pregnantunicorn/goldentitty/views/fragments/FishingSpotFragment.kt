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
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.tools.*
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.models.player.Player
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.views.adapters.ToolTileAdapter
import com.pregnantunicorn.goldentitty.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class FishingSpotFragment: Fragment() {

    private lateinit var binding: SupplierFragmentBinding
    private lateinit var adapter: ToolTileAdapter
    private lateinit var layoutManager: GridLayoutManager
    private var spear: Spear? = CurrentSpear.spear()
    private var fishingSpot: FishingSpot? = spear?.fishingSpot()

    private var job: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = SupplierFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.FISHING_SPOT_FRAGMENT)
        }

        updateName()
        updateRange(fishingSpot?.range()!!)
        setupLeaveButton()
        setupFab()
        setupInfoButton()
        setupFab()

        return binding.root
    }

    private fun updateName() {

        binding.name.text = fishingSpot?.name()
    }

    private fun updateRange(range: Array<ToolTile>) {

        adapter = ToolTileAdapter(range)
        layoutManager = GridLayoutManager(context, 4)
        binding.supplierTileRecycler.adapter = adapter
        binding.supplierTileRecycler.layoutManager = layoutManager
    }

    private fun updatePlayerStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateEnergy()
        status.updateFish()
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)

        fab?.setOnClickListener {

            if(CurrentHandState.handState() == HandState.SPEAR) {

                if(job == null) {

                    val energy = 1

                    if(Player.energy().hasAmount(energy)) {

                        Player.energy().loseAmount(energy)
                        updatePlayerStatus()

                        job = CoroutineScope(Dispatchers.IO).launch {

                            while(true) {

                                fishingSpot = spear?.fishingSpot()

                                withContext(Dispatchers.Main) {

                                    updateRange(fishingSpot?.newRange()!!)
                                }

                                delay(spear?.speed?.invoke()!!)
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

                            updateRange(fishingSpot?.newRange()!!)
                        }

                        if(fishingSpot?.checkHitCondition(spear?.hitAmount()!!) == true)
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
                    "No Spear",
                    R.drawable.info64,
                    "Equip a spear."
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
                "1. Grab a spear from your backpack.\n" +
                        "2. Click on the spear icon at the bottom app bar in order to attack.\n" +
                        "3. When the target icon meets the fish icon, click on the spear icon to stab the fish.\n" +
                        "4. If you click on the spear icon while the fish icon is covered by the target icon and you have the right timing, you will acquire the fish."
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

        spear = null
        fishingSpot = null

        super.onDestroy()
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

}