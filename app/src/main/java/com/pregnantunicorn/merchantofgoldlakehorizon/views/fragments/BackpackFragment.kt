package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.BackpackFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.*
import com.pregnantunicorn.merchantofgoldlakehorizon.models.food.Food
import com.pregnantunicorn.merchantofgoldlakehorizon.models.food.FoodManager
import com.pregnantunicorn.merchantofgoldlakehorizon.models.items.Item
import com.pregnantunicorn.merchantofgoldlakehorizon.models.items.ItemManager
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.BoomerangAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.FoodAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.ItemAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BackpackFragment : Fragment(),
    FoodAdapter.FoodListener,
    BoomerangAdapter.BoomerangListener,
    ItemAdapter.ItemListener
{

    private lateinit var binding: BackpackFragmentBinding
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var boomerangAdapter: BoomerangAdapter
    private lateinit var itemsAdapter: ItemAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private var food: Array<Food>? = FoodManager().foods
    private var boomerangs: List<Boomerang>? = BoomerangManager().boomerangs()
    private var grabIconClicks = 0

    private var items: List<Item>? = ItemManager().items()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = BackpackFragmentBinding.inflate(inflater, container, false)

        selectFoodTab()
        updateFood()
        setupFoodTab()
        setupBoomerangTab()
        setupItemsTab()
        setupFab()

        return binding.root
    }

    private fun updateFab() {

        val statusUpdate = requireActivity() as PlayerStatusUpdate
        statusUpdate.updateFab()
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun setupFoodTab() {

        binding.foodTab.setOnClickListener {

            selectFoodTab()
            updateFood()
        }
    }

    private fun selectFoodTab() {

        binding.foodTab.setBackgroundResource(R.drawable.selected_tab_background)
        binding.clothesTab.setBackgroundResource(R.drawable.tab_background)
        binding.itemsTab.setBackgroundResource(R.drawable.tab_background)
        binding.boomerangTab.setBackgroundResource(R.drawable.tab_background)
    }

    private fun updateFood() {

        foodAdapter = FoodAdapter(food!!, this)
        layoutManager = LinearLayoutManager(context)
        binding.backpackRecycler.adapter = foodAdapter
        binding.backpackRecycler.layoutManager = layoutManager
    }

    private fun setupBoomerangTab() {

        binding.boomerangTab.setOnClickListener {

            selectBoomerangTab()
            updateBoomerangs()
        }
    }

    private fun selectBoomerangTab() {

        binding.foodTab.setBackgroundResource(R.drawable.tab_background)
        binding.clothesTab.setBackgroundResource(R.drawable.tab_background)
        binding.itemsTab.setBackgroundResource(R.drawable.tab_background)
        binding.boomerangTab.setBackgroundResource(R.drawable.selected_tab_background)
    }

    private fun updateBoomerangs() {

        boomerangAdapter = BoomerangAdapter(boomerangs!!, this)
        layoutManager = LinearLayoutManager(context)
        binding.backpackRecycler.adapter = boomerangAdapter
        binding.backpackRecycler.layoutManager = layoutManager
    }


    private fun setupItemsTab() {

        binding.itemsTab.setOnClickListener {

            selectItemsTab()
            updateItems()
        }
    }

    private fun selectItemsTab() {

        binding.foodTab.setBackgroundResource(R.drawable.tab_background)
        binding.clothesTab.setBackgroundResource(R.drawable.tab_background)
        binding.itemsTab.setBackgroundResource(R.drawable.selected_tab_background)
        binding.boomerangTab.setBackgroundResource(R.drawable.tab_background)
    }

    private fun updateItems() {

        itemsAdapter = ItemAdapter(ItemManager().items(), this)
        layoutManager = LinearLayoutManager(context)
        binding.backpackRecycler.adapter = itemsAdapter
        binding.backpackRecycler.layoutManager = layoutManager
    }

    override fun onClickItem(position: Int) {

    }

    private fun updateMerchantStatus() {

        val statusUpdate = requireActivity() as PlayerStatusUpdate
        statusUpdate.updateHealth()
        statusUpdate.updatePeaches()
        statusUpdate.updateDates()
        statusUpdate.updateCoconuts()
    }

    override fun onClickFood(position: Int) {

        CoroutineScope(Dispatchers.IO).launch {

            if(food?.get(position)?.consume()!!) {

                withContext(Dispatchers.Main) {

                    updateMerchantStatus()
                }
            }

            else {

                showMessage()
            }
        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    override fun onClickBoomerang(position: Int) {

        grabIconClicks++

        when(grabIconClicks) {

            1 -> {

                CurrentBoomerang.changeBoomerang(position)
                CurrentHandState.changeHandState(HandState.BOOMERANG)
            }

            else -> {

                grabIconClicks = 0

                if(CurrentHandState.handState() != HandState.EMPTY) {

                    CurrentHandState.changeHandState(HandState.EMPTY)
                    updateFab()
                }
            }
        }

        updateFab()
    }

    override fun onDestroy() {

        food = null
        boomerangs = null
        items = null
        super.onDestroy()
    }
}