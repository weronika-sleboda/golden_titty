package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.WorldMapFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentMap
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.TileAdapter

class WorldMapFragment: Fragment(), TileAdapter.TileListener {

    private lateinit var binding: WorldMapFragmentBinding
    private lateinit var adapter: TileAdapter
    private lateinit var layoutManager: GridLayoutManager
    private val worldMap = CurrentMap.worldMap()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = WorldMapFragmentBinding.inflate(inflater, container, false)

        updateName()
        updateLocation()
        return binding.root
    }

    private fun updateName() {

        binding.name.text = worldMap.name
    }

    private fun updateLocation() {

        adapter = TileAdapter(worldMap.map, this)
        layoutManager = GridLayoutManager(context, 4)
        binding.locationRecycler.adapter = adapter
        binding.locationRecycler.layoutManager = layoutManager
    }

    override fun onClickTile(position: Int) {

        worldMap.map[position].onClick(requireActivity())
        updateName()
        updateLocation()
    }
}