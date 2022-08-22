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
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.WorkshopFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.CurrentFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.FragmentType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.shops.BoomerangShopManager
import com.pregnantunicorn.merchantofgoldlakehorizon.models.shops.Cafeteria
import com.pregnantunicorn.merchantofgoldlakehorizon.models.workshop.Blueprint
import com.pregnantunicorn.merchantofgoldlakehorizon.models.workshop.Workshop
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.CafeteriaAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.WorkshopAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WorkshopFragment : Fragment(), WorkshopAdapter.WorkshopListener {

    private lateinit var binding: WorkshopFragmentBinding
    private lateinit var adapter: WorkshopAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private var blueprints: List<Blueprint>? = Workshop().blueprints()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = WorkshopFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.WORKSHOP_FRAGMENT)
        }

        updateShopItems()
        setupLeaveButton()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateStone()
        status.updateWood()
    }

    override fun onClickTool(position: Int) {

        CoroutineScope(Dispatchers.IO).launch {

            if(blueprints?.get(position)?.make() == true) {

                blueprints = Workshop().blueprints()

                withContext(Dispatchers.Main) {

                    showMessage()
                    updateMerchantStatus()
                    updateShopItems()
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

        adapter = WorkshopAdapter(blueprints!!, this)
        layoutManager = LinearLayoutManager(context)
        binding.workshopRecycler.adapter = adapter
        binding.workshopRecycler.layoutManager = layoutManager
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    override fun onDestroy() {

        blueprints = null
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