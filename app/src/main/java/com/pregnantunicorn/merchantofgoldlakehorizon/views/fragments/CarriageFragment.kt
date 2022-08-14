package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.CarriageFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.carriage.Carriage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.carriage.CarriageItem
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.CarriageAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CarriageFragment : Fragment(), CarriageAdapter.CarriageListener {

    private lateinit var binding: CarriageFragmentBinding
    private lateinit var adapter: CarriageAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private var carriageItems: Array<CarriageItem>? = Carriage().carriageItems()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = CarriageFragmentBinding.inflate(inflater, container, false)

        setupLeaveButton()
        setupCarriageItems()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateGoldCoins()
        status.updateDates()
        status.updateCoconuts()
        status.updatePeaches()
    }

    override fun onClickCarriageItem(position: Int) {

        CoroutineScope(Dispatchers.IO).launch {

            if(carriageItems?.get(position)?.sell()!!) {

                withContext(Dispatchers.Main) {

                    updateMerchantStatus()
                }
            }

            else {

                withContext(Dispatchers.Main) {

                    showMessage()
                }
            }
        }
    }

    private fun setupCarriageItems() {

        adapter = CarriageAdapter(carriageItems!!, this)
        layoutManager = LinearLayoutManager(context)
        binding.carriageRecycler.adapter = adapter
        binding.carriageRecycler.layoutManager = layoutManager
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }

    override fun onDestroy() {

        carriageItems = null
        super.onDestroy()
    }
}