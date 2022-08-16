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
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.TempleFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.CurrentFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.FragmentType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.temple_floors.CurrentTempleFloor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.temple_floors.TempleFloor
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.TempleFloorAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class TempleFragment : Fragment(), TempleFloorAdapter.TempleFloorListener {

    private lateinit var binding: TempleFragmentBinding
    private lateinit var adapter: TempleFloorAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private var templeFloors: Array<TempleFloor>? = CurrentTempleFloor.floors()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = TempleFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.TEMPLE_FRAGMENT)
        }

        setupLeaveButton()
        updateTempleFloors()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    override fun onClickFloor(position: Int) {

        if(!templeFloors?.get(position)?.open(requireActivity())!!) {

            showMessage()
        }

        updateTempleFloors()
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

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<EntranceFragment>(R.id.world_container)
            }
        }
    }

    override fun onDestroy() {

        templeFloors = null
        super.onDestroy()
    }
}