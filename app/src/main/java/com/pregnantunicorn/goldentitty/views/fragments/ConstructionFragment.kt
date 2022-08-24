package com.pregnantunicorn.goldentitty.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.ConstructionFragmentBinding
import com.pregnantunicorn.goldentitty.models.construction.Building
import com.pregnantunicorn.goldentitty.models.construction.CurrentBuilding
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ConstructionFragment : Fragment() {

    private lateinit var binding: ConstructionFragmentBinding
    private var building: Building? = CurrentBuilding.building()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = ConstructionFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.CONSTRUCTION_FRAGMENT)
        }

        setupIcon()
        setupName()
        setupInfo()
        setupFab()
        setupRequirementInfo()
        setupBuildButton()
        setupLeaveButton()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun updatePlayerStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateWood()
        status.updateIron()
    }

    private fun setupRequirementInfo() {

        binding.requirement.requiredStone.text = building?.ironToString()
        binding.requirement.requiredWood.text = building?.woodToString()
    }

    private fun setupName() {

        binding.name.text = building?.name
    }

    private fun setupIcon() {

        binding.icon.setImageResource(building?.bigIcon?.invoke()!!)
    }

    private fun setupInfo() {

        binding.info.text = building?.info
    }

    private fun setupBuildButton() {

        binding.constructButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(building?.build()!!) {

                    withContext(Dispatchers.Main) {

                        updatePlayerStatus()
                        showMessage()
                        goToWorldMap()
                    }
                }

                else {

                    showMessage()
                }
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

    override fun onDestroy() {

        building = null
        super.onDestroy()
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }
}