package com.pregnantunicorn.goldentitty.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.LocationFragmentBinding
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.models.world_map.world.CurrentLocation
import com.pregnantunicorn.goldentitty.models.world_map.world.Location
import com.pregnantunicorn.goldentitty.views.adapters.TileAdapter
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

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

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.LOCATION_FRAGMENT)
        }

        updateName()
        updateLocation()
        setupInfoButton()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)

        fab?.setOnClickListener {

            CurrentHandState.changeHandState(HandState.EMPTY)
            fab.setImageResource(CurrentHandState.fabIcon())
        }
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
                IconFactory().info64(),
                "1. To interact with the environment, click on the rectangle tile. All tiles that display icons are clickable." +
                        "\n2. To equip a tool click on the backpack icon and then on the empty hand icon next to the tool. " +
                        "\n3. To empty your hand click on the action button to the right of the bottom bar."
            )

            showMessage()
        }
    }

    override fun onDestroy() {

        location = null
        super.onDestroy()
    }
}