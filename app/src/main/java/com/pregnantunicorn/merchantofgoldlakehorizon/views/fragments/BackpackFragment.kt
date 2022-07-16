package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.BackpackFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.StatusUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.FoodAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.ItemAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BackpackFragment : Fragment(), FoodAdapter.FoodListener {

    private lateinit var binding: BackpackFragmentBinding
    private lateinit var itemAdapter: ItemAdapter
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private val food = Merchant.food()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = BackpackFragmentBinding.inflate(inflater, container, false)

        selectItemsTab()
        updateItems()
        setupItemsTab()
        setupFoodTab()

        return binding.root
    }

    private fun setupItemsTab() {

        binding.itemsTab.setOnClickListener {

            selectItemsTab()
            updateItems()
        }
    }

    private fun selectItemsTab() {

        binding.itemsTab.setBackgroundResource(R.drawable.selected_tab_background)
        binding.foodTab.setBackgroundResource(R.drawable.tab_background)
    }

    private fun updateItems() {

        itemAdapter = ItemAdapter(Merchant.items())
        layoutManager = LinearLayoutManager(context)
        binding.backpackRecycler.adapter = itemAdapter
        binding.backpackRecycler.layoutManager = layoutManager
    }

    private fun setupFoodTab() {

        binding.foodTab.setOnClickListener {

            selectFoodTab()
            updateFood()
        }
    }

    private fun selectFoodTab() {

        binding.itemsTab.setBackgroundResource(R.drawable.tab_background)
        binding.foodTab.setBackgroundResource(R.drawable.selected_tab_background)
    }

    private fun updateFood() {

        foodAdapter = FoodAdapter(food, this)
        layoutManager = LinearLayoutManager(context)
        binding.backpackRecycler.adapter = foodAdapter
        binding.backpackRecycler.layoutManager = layoutManager
    }

    private fun updateMerchantStatus(position: Int) {

        val statusUpdate = requireActivity() as MerchantStatusUpdate

        when(food[position].statusUpdateType) {

            StatusUpdateType.CHARISMA -> statusUpdate.updateCharisma()
            StatusUpdateType.PERSUASION -> statusUpdate.updatePersuasion()
            StatusUpdateType.ENERGY -> statusUpdate.updateEnergy()
            StatusUpdateType.INTELLIGENCE -> statusUpdate.updateIntelligence()
        }
    }

    override fun onClickFood(position: Int) {

        CoroutineScope(Dispatchers.IO).launch {

            if(food[position].consume()) {

                withContext(Dispatchers.Main) {

                    updateMerchantStatus(position)
                    updateFood()
                }
            }

            else {

                showInfoDialogFragment(
                    food[position].dialogMessage().title,
                    food[position].dialogMessage().icon,
                    food[position].dialogMessage().message
                )
            }

        }
    }

    private fun showInfoDialogFragment(title: String, icon: Int, message: String) {

        InfoDialogFragment(
            title,
            icon,
            message,
            "OK"
        ).show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }
}