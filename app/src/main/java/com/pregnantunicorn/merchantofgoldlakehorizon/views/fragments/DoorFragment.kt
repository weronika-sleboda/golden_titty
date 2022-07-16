package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.DoorFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.LockedDoorFragmentBinding
import kotlinx.coroutines.*

class DoorFragment : Fragment() {

    private lateinit var binding: DoorFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DoorFragmentBinding.inflate(inflater, container, false)

        setupBuildingIcon()
        setupBuildingName()
        setupInfo()
        setupEnterButton()
        setupLeaveButton()
        return binding.root
    }

    private fun setupBuildingName() {

        binding.buildingName.text = ""
    }

    private fun setupBuildingIcon() {


    }

    private fun setupInfo() {

        binding.buildingInfo.text = ""
    }

    private fun setupEnterButton() {

        binding.enterButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {


                withContext(Dispatchers.Main) {


                }
            }
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<WorldMapFragment>(R.id.world_container)
            }
        }
    }
}