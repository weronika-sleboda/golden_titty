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
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import kotlinx.coroutines.*

class DoorFragment : Fragment() {

    private lateinit var binding: DoorFragmentBinding
    private val door = CurrentDoor.door()

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
        setupOpeningInfo()
        return binding.root
    }

    private fun setupBuildingName() {

        binding.buildingName.text = door.buildingName
    }

    private fun setupBuildingIcon() {

        binding.buildingIcon.setImageResource(door.icon())
    }

    private fun setupInfo() {

        binding.buildingInfo.text = door.buildingInfo
    }

    private fun setupOpeningInfo() {

        binding.closingInfo.closingTime.text = door.closingInfo
    }

    private fun setupEnterButton() {

        binding.enterButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                door.open(requireActivity())
            }
        }
    }

    private fun goToWorldMap() {

        activity?.supportFragmentManager?.commit {

            replace<LocationFragment>(R.id.world_container)
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            goToWorldMap()
        }
    }
}