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
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.CafeteriaFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.CurrentFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.FragmentType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.shops.BoomerangShopManager
import com.pregnantunicorn.merchantofgoldlakehorizon.models.shops.Cafeteria
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.CafeteriaAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CafeteriaFragment : Fragment(), CafeteriaAdapter.DrinkListener {

    private lateinit var binding: CafeteriaFragmentBinding
    private lateinit var adapter: CafeteriaAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private var shopItems = Cafeteria().drinks

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = CafeteriaFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.CAFETERIA_FRAGMENT)
        }

        setupName()
        updateShopItems()
        setupLeaveButton()
        setupFab()

        return binding.root
    }

    private fun setupName() {

        binding.name.text = BoomerangShopManager().name()
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateGoldCoins()
    }

    override fun onClickDrink(position: Int) {

        CoroutineScope(Dispatchers.IO).launch {

            if(shopItems[position].buy()) {

                withContext(Dispatchers.Main) {

                    showMessage()
                    updateMerchantStatus()
                }
            }

            else {

                withContext(Dispatchers.Main) {

                    showMessage()
                }
            }
        }
    }

    private fun updateShopItems() {

        adapter = CafeteriaAdapter(shopItems, this)
        layoutManager = LinearLayoutManager(context)
        binding.cafeteriaRecycler.adapter = adapter
        binding.cafeteriaRecycler.layoutManager = layoutManager
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
}