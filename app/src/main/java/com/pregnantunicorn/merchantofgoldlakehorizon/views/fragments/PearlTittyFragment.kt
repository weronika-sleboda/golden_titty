package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.PearlTittyFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.*
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.BoomerangRangeAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class PearlTittyFragment: Fragment() {

    private lateinit var binding: PearlTittyFragmentBinding
    private lateinit var adapter: BoomerangRangeAdapter
    private lateinit var layoutManager: GridLayoutManager
    private val boomerang = CurrentBoomerang.boomerang()
    private var boomerangStyle = CurrentBoomerang.boomerang().boomerangStyle.invoke()

    private var job: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = PearlTittyFragmentBinding.inflate(inflater, container, false)

        updateName()
        updateRange(boomerangStyle.range())
        setupLeaveButton()
        setupFab()
        setupInfoButton()
        return binding.root
    }

    private fun updateName() {

        binding.name.text = boomerangStyle.name()
    }

    private fun updateRange(range: Array<BoomerangTile>) {

        adapter = BoomerangRangeAdapter(range)
        layoutManager = GridLayoutManager(context, 4)
        binding.fishPondRecycler.adapter = adapter
        binding.fishPondRecycler.layoutManager = layoutManager
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as MerchantStatusUpdate
        status.updateDates()
        status.updateCoconuts()
        status.updatePeaches()
        status.updateEnergy()
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)

        fab?.setOnClickListener {

            if(CurrentHandState.handState() == HandState.BOOMERANG) {

                if(job == null) {

                    val energy = 1

                    if(Merchant.energy().hasAmount(energy)) {

                        fab.setImageResource(R.drawable.grab64)
                        Merchant.energy().loseAmount(1)
                        updateMerchantStatus()

                        job = CoroutineScope(Dispatchers.IO).launch {

                            while(true) {

                                boomerangStyle = CurrentBoomerang.boomerang().boomerangStyle.invoke()

                                withContext(Dispatchers.Main) {

                                    updateRange(boomerangStyle.newRange(boomerang.icon))
                                }

                                delay(boomerang.speed)
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

                        if(boomerangStyle.checkHitCondition(boomerang.hitAmount))
                        {

                            withContext(Dispatchers.Main) {

                                binding.switchOn.progress += boomerang.power

                                updateMerchantStatus()

                                if(binding.switchOn.progress == 100) {

                                    activity?.supportFragmentManager?.commit {

                                        replace<LocationFragment>(R.id.world_container)
                                    }
                                }
                            }
                        }

                        withContext(Dispatchers.Main) {

                            fab.setImageResource(boomerang.icon)
                            updateRange(boomerangStyle.range())
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
                        "3. When the boomerang meets the emblem, click on the hand icon to bring back the boomerang.\n" +
                        "4. If you bring back the boomerang while it hits the emblem at the right time, the switch will loosen.\n" +
                        "5. The switch loosens faster the bigger the power of the boomerang."
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

        super.onDestroy()

        job?.cancel()
        job = null
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

}