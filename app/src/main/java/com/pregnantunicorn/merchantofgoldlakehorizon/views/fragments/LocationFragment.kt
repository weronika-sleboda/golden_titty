package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.LocationFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentLocation
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.TileAdapter

class LocationFragment: Fragment(), TileAdapter.TileListener {

    private lateinit var binding: LocationFragmentBinding
    private lateinit var adapter: TileAdapter
    private lateinit var layoutManager: GridLayoutManager
    private var location = CurrentLocation.location()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = LocationFragmentBinding.inflate(inflater, container, false)

        updateName()
        updateLocation()
        return binding.root
    }

    private fun updateName() {

        binding.name.text = location.name
    }

    private fun updateLocation() {

        adapter = TileAdapter(location.map, this)
        layoutManager = GridLayoutManager(context, 4)
        binding.locationRecycler.adapter = adapter
        binding.locationRecycler.layoutManager = layoutManager
    }

    override fun onClickTile(position: Int) {

        location.map[position].onClick(requireActivity())
        location = CurrentLocation.location()
        updateName()
        updateLocation()
    }
}