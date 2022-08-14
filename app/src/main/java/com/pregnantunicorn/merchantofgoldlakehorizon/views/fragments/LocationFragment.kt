package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.LocationFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.Location
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.TileAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment

class LocationFragment: Fragment(), TileAdapter.TileListener {

    private lateinit var binding: LocationFragmentBinding
    private lateinit var adapter: TileAdapter
    private lateinit var layoutManager: GridLayoutManager
    private var location: Location? = CurrentLocation.location()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = LocationFragmentBinding.inflate(inflater, container, false)

        updateName()
        updateLocation()
        setupInfoButton()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun updateName() {

        binding.name.text = location?.name
    }

    private fun updateLocation() {

        adapter = TileAdapter(location?.map!!, this)
        layoutManager = GridLayoutManager(context, 4)
        binding.locationRecycler.adapter = adapter
        binding.locationRecycler.layoutManager = layoutManager
    }

    override fun onClickTile(position: Int) {

        location?.map?.get(position)?.onClick(requireActivity())
        location = CurrentLocation.location()
        updateName()
        updateLocation()
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    private fun setupInfoButton() {

        binding.infoButton.setOnClickListener {

            CurrentMessage.changeMessage(
                "Instructions",
                R.drawable.info64,
                "1. To interact with the environment, click on the rectangle tile. All tiles that display icons are clickable."
            )

            showMessage()
        }
    }

    override fun onDestroy() {

        location = null
        super.onDestroy()
    }
}