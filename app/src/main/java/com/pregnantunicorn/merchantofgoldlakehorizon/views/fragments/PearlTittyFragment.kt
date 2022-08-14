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
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.CurrentFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.FragmentType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.temples.CurrentTemple
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.BoomerangRangeAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class PearlTittyFragment: Fragment() {

    private lateinit var binding: PearlTittyFragmentBinding
    private lateinit var adapter: BoomerangRangeAdapter
    private lateinit var layoutManager: GridLayoutManager
    private var boomerang: Boomerang? = CurrentBoomerang.boomerang()
    private var boomerangStyle: BoomerangStyle? = CurrentBoomerang.boomerang().boomerangStyle.invoke()
    private var templeName: String? = CurrentTemple.templeName()

    private var job: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = PearlTittyFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.PEARL_TITTY_FRAGMENT)
        }

        updateName()
        updateRange(boomerangStyle?.range()!!)
        setupLeaveButton()
        setupFab()
        setupInfoButton()
        defineMaxProgress()
        setupRequiredAccuracyToString()

        return binding.root
    }

    private fun setupRequiredAccuracyToString() {

        binding.info.requiredAccuracy.text = boomerang?.requiredAccuracy.toString()
    }

    private fun defineMaxProgress() {

        binding.destruction.max = 10
    }

    private fun updateName() {

        binding.name.text = templeName
    }

    private fun updateRange(range: Array<BoomerangTile>) {

        adapter = BoomerangRangeAdapter(range)
        layoutManager = GridLayoutManager(context, 4)
        binding.boomerangTileRecycler.adapter = adapter
        binding.boomerangTileRecycler.layoutManager = layoutManager
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateAccuracy()
        status.updateTittyCounter()
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)

        fab?.setOnClickListener {

            if(CurrentHandState.handState() == HandState.BOOMERANG) {

                if(job == null) {

                    if(Player.accuracy().hasAmount(boomerang?.requiredAccuracy!!)) {

                        fab.setImageResource(R.drawable.grab64)
                        Player.accuracy().loseAmount(boomerang?.requiredAccuracy!!)
                        updateMerchantStatus()

                        job = CoroutineScope(Dispatchers.IO).launch {

                            while(true) {

                                boomerangStyle = CurrentBoomerang.boomerang().boomerangStyle.invoke()

                                withContext(Dispatchers.Main) {

                                    updateRange(boomerangStyle?.newRange(boomerang?.icon!!)!!)
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

                    fab.setImageResource(boomerang?.icon!!)
                    updateRange(boomerangStyle?.range()!!)

                    CoroutineScope(Dispatchers.IO).launch {

                        if(boomerangStyle?.checkHitCondition(boomerang?.hitAmount?.invoke()!!)!!)
                        {

                            withContext(Dispatchers.Main) {

                                binding.destruction.progress += boomerang?.power!!.invoke()

                                updateMerchantStatus()

                                if(binding.destruction.progress == 10) {

                                    Player.tittyCounter().addTitty()
                                    updateMerchantStatus()

                                    CurrentMessage.changeMessage(
                                        "Titty Destroyed",
                                        R.drawable.stars64,
                                        "Heretic titty has been destroyed."
                                    )

                                    showMessage()

                                    activity?.supportFragmentManager?.commit {

                                        replace<LocationFragment>(R.id.world_container)
                                    }
                                }
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

        job?.cancel()
        job = null

        boomerang = null
        boomerangStyle = null
        templeName = null

        super.onDestroy()
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

}