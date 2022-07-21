package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.LockedDoorFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentLockedDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class LockedDoorFragment : Fragment() {

    private lateinit var binding: LockedDoorFragmentBinding
    private val lockedDoor = CurrentLockedDoor.lockedDoor()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = LockedDoorFragmentBinding.inflate(inflater, container, false)

        setupBuildingIcon()
        setupBuildingName()
        setupRequiredCharisma()
        setupInfo()
        setupEnterButton()
        setupLeaveButton()
        return binding.root
    }

    private fun setupBuildingName() {

        binding.buildingName.text = lockedDoor.buildingName
    }

    private fun setupBuildingIcon() {

        binding.buildingIcon.setImageResource(lockedDoor.doorIcon.invoke())
    }

    private fun setupRequiredCharisma() {

        binding.requirement.requiredCharisma.text = lockedDoor.charismaToString()
    }

    private fun setupInfo() {

        binding.buildingInfo.text = lockedDoor.buildingInfo
    }

    private fun updateMerchantCharisma() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateCharisma()
    }

    private fun setupEnterButton() {

        binding.enterButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                lockedDoor.open()

                withContext(Dispatchers.Main) {

                    if(lockedDoor.allowedToEnter()) {

                        updateMerchantCharisma()

                        activity?.supportFragmentManager?.commit {

                            replace<NpcFragment>(R.id.world_container)
                        }
                    }

                    else {

                        showInfoDialogFragment(
                            "No Charisma",
                            R.drawable.charisma64,
                            "You don't have enough charisma to get invited to the building."
                        )
                    }
                }
            }
        }
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

                replace<WorldMapFragment>(R.id.world_container)
            }
        }
    }
}