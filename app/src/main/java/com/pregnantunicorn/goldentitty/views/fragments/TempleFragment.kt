package com.pregnantunicorn.goldentitty.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.TempleFloorFragmentBinding
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.temple.TempleFloor
import com.pregnantunicorn.goldentitty.models.temple.TempleFloors
import com.pregnantunicorn.goldentitty.views.adapters.TempleFloorAdapter
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class TempleFragment : Fragment(), TempleFloorAdapter.TempleFloorListener {

    private lateinit var binding: TempleFloorFragmentBinding
    private lateinit var adapter: TempleFloorAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private var templeFloors: Array<TempleFloor>? = TempleFloors.floors

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = TempleFloorFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.TEMPLE_FRAGMENT)
        }

        updateTempleFloors()
        setupLeaveButton()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    override fun onClickTempleFloor(position: Int) {

        CoroutineScope(Dispatchers.IO).launch {

            if(!templeFloors?.get(position)?.open()!!) {

                withContext(Dispatchers.Main) {

                    showMessage()
                }
            }

            else {

                activity?.supportFragmentManager?.commit {

                    replace<BattlefieldFragment>(R.id.world_container)
                }
            }
        }
    }

    private fun updateTempleFloors() {

        adapter = TempleFloorAdapter(templeFloors!!, this)
        layoutManager = LinearLayoutManager(context)
        binding.templeFloorRecycler.adapter = adapter
        binding.templeFloorRecycler.layoutManager = layoutManager
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    override fun onDestroy() {

        templeFloors = null
        super.onDestroy()
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<EntranceFragment>(R.id.world_container)
            }
        }
    }
}