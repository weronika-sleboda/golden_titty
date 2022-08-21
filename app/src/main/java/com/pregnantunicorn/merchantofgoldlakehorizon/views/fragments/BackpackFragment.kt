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
import com.pregnantunicorn.merchantofgoldlakehorizon.models.tools.*
import com.pregnantunicorn.merchantofgoldlakehorizon.models.food.Food
import com.pregnantunicorn.merchantofgoldlakehorizon.models.food.FoodManager
import com.pregnantunicorn.merchantofgoldlakehorizon.models.tools.CurrentHandState
import com.pregnantunicorn.merchantofgoldlakehorizon.models.tools.HandState
import com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items.KeyItem
import com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items.KeyItemManager
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.ToolsAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.FoodAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.KeyItemAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BackpackFragment : Fragment(),
    FoodAdapter.FoodListener,
    ToolsAdapter.BoomerangListener,
    KeyItemAdapter.ItemListener
{

    private lateinit var binding: BackpackFragmentBinding
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var toolsAdapter: ToolsAdapter
    private lateinit var itemsAdapter: KeyItemAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private var food: Array<Food>? = FoodManager().foods
    private var tools: Array<Tool>? = Tools().tools
    private var keyItems: List<KeyItem>? = KeyItemManager().items()

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
        binding.itemsTab.setBackgroundResource(R.drawable.tab_background)
        binding.boomerangTab.setBackgroundResource(R.drawable.selected_tab_background)
    }

    private fun updateBoomerangs() {

        toolsAdapter = ToolsAdapter(tools!!, this)
        layoutManager = LinearLayoutManager(context)
        binding.backpackRecycler.adapter = toolsAdapter
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
        binding.itemsTab.setBackgroundResource(R.drawable.selected_tab_background)
        binding.boomerangTab.setBackgroundResource(R.drawable.tab_background)
    }

    private fun updateItems() {

        itemsAdapter = KeyItemAdapter(KeyItemManager().items(), this)
        layoutManager = LinearLayoutManager(context)
        binding.backpackRecycler.adapter = itemsAdapter
        binding.backpackRecycler.layoutManager = layoutManager
    }

    override fun onClickItem(position: Int) {

        keyItems?.get(position)?.equip()
        CurrentHandState.changeHandState(HandState.KEY_ITEM)

        updateFab()
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
                    updateFood()
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

        tools?.get(position)?.equip()
        updateFab()
    }

    override fun onDestroy() {

        food = null
        tools = null
        keyItems = null
        super.onDestroy()
    }
}