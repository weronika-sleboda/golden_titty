package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.LinearLayoutManager
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.MeteorsClosetFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.robes.CurrentRobe
import com.pregnantunicorn.merchantofgoldlakehorizon.models.robes.RobeManager
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.RobeAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment

class MeteorsClosetFragment: Fragment(), RobeAdapter.RobeListener {

    private lateinit var binding: MeteorsClosetFragmentBinding
    private lateinit var adapter: RobeAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private val robes = RobeManager().robes()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = MeteorsClosetFragmentBinding.inflate(inflater, container, false)

        updateRobes()
        setupLeaveButton()

        return binding.root
    }

    private fun updateRobes() {

        adapter = RobeAdapter(robes, this)
        layoutManager = LinearLayoutManager(context)
        binding.robeRecycler.adapter = adapter
        binding.robeRecycler.layoutManager = layoutManager
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

    private fun updateMerchant() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateAppearance()
    }

    override fun onClickRobe(position: Int) {

        if(CurrentRobe.robe() == robes[position].robeType) {

            showInfoDialogFragment(
                "Already On",
                R.drawable.warning64,
                "You already wear that one."
            )
        }

        else {

            CurrentRobe.changeRobe(robes[position].robeType)
            robes[position].algorithm.invoke()
            updateMerchant()
        }
    }
}