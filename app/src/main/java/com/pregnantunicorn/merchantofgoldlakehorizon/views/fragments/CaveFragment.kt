package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.CaveFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.cave.Supplier
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.CaveTile
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.CaveTileAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CaveFragment: Fragment(), CaveTileAdapter.TileListener {

    private lateinit var binding: CaveFragmentBinding
    private lateinit var adapter: CaveTileAdapter
    private lateinit var layoutManager: GridLayoutManager
    private var supplier = Supplier

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = CaveFragmentBinding.inflate(inflater, container, false)

        updateName()
        updateLocation()
        setupLeaveButton()
        return binding.root
    }

    private fun updateName() {

        binding.name.text = "Cave"
    }

    private fun updateLocation() {

        adapter = CaveTileAdapter(supplier.tiles(), this)
        layoutManager = GridLayoutManager(context, 4)
        binding.caveRecycler.adapter = adapter
        binding.caveRecycler.layoutManager = layoutManager
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {


        }
    }

    override fun onClickTile(position: Int) {

        CoroutineScope(Dispatchers.IO).launch {

            supplier.tiles()[position].onClick(requireActivity())

            if(Merchant.energy().amountIsZero()
                && supplier.tiles()[position].state() == CaveTile.State.READY) {

                showMessage()
            }

        }

    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }
}