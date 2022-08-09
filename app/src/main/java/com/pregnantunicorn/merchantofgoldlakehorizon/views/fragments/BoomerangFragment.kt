package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.BoomerangFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.*
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.BoomerangRangeAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class BoomerangFragment: Fragment() {

    private lateinit var binding: BoomerangFragmentBinding
    private lateinit var adapter: BoomerangRangeAdapter
    private lateinit var layoutManager: GridLayoutManager
    private val boomerang = CurrentBoomerang.boomerang()
    private var boomerangStyle = CurrentBoomerangStyle.boomerangStyle(boomerang.boomerangStyleName)

    private var job: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = BoomerangFragmentBinding.inflate(inflater, container, false)

        updateName()
        updateRange(boomerangStyle.range())
        setupLeaveButton()
        setupFab()
        return binding.root
    }

    private fun updateName() {

        binding.name.text = "Fishpond"
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
        status.updatePoultry()
        status.updateEnergy()
    }

    private fun setupFab() {

        val fab = activity?.findViewById<FloatingActionButton>(R.id.item_holder)

        fab?.setOnClickListener {

            if(CurrentHandState.handState() == HandState.BOOMERANG) {

                if(job == null) {

                    if(Merchant.energy().hasAmount(boomerang.energy)) {

                        fab.setImageResource(R.drawable.grab64)
                        Merchant.energy().loseAmount(0)
                        updateMerchantStatus()

                        job = CoroutineScope(Dispatchers.IO).launch {

                            while(true) {

                                boomerangStyle = CurrentBoomerangStyle.boomerangStyle(
                                    boomerang.boomerangStyleName
                                )

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

                    fab.setImageResource(boomerang.icon)

                    job?.cancel()
                    job = null

                    CoroutineScope(Dispatchers.IO).launch {

                        if(boomerangStyle.checkHitCondition(boomerang.hitAmount))
                        {

                            updateMerchantStatus()

                            withContext(Dispatchers.Main) {

                                showMessage()
                            }
                        }
                    }

                    updateRange(
                        boomerangStyle.range()
                    )
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

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

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