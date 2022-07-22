package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.BackpackFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.clothing.RobeFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.StatusUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.FoodAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.RobeAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BackpackFragment : Fragment(), FoodAdapter.FoodListener, RobeAdapter.RobeListener {

    private lateinit var binding: BackpackFragmentBinding
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var robeAdapter: RobeAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private val food = Merchant.food()
    private val robes = RobeFactory.robes

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = BackpackFragmentBinding.inflate(inflater, container, false)

        selectFoodTab()
        updateFood()
        setupFoodTab()
        setupRobeTab()

        return binding.root
    }

    private fun updateRobes() {

        robeAdapter = RobeAdapter(robes, this)
        layoutManager = LinearLayoutManager(context)
        binding.backpackRecycler.adapter = robeAdapter
        binding.backpackRecycler.layoutManager = layoutManager
    }

    private fun setupRobeTab() {

        binding.clothesTab.setOnClickListener {

            selectRobeTab()
            updateRobes()
        }
    }

    private fun selectRobeTab() {

        binding.foodTab.setBackgroundResource(R.drawable.tab_background)
        binding.clothesTab.setBackgroundResource(R.drawable.selected_tab_background)
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

    private fun updateMerchantAppearance() {

        val appearanceUpdate = requireActivity() as MerchantStatusUpdate
        appearanceUpdate.updateAppearance()
    }

    override fun onClickRobe(position: Int) {

        CoroutineScope(Dispatchers.IO).launch {

            if(robes[position].wears()) {

                withContext(Dispatchers.Main) {

                    showInfoDialogFragment(
                        "Already On",
                        R.drawable.warning64,
                        "You already wear that one!"
                    )
                }

            }

            else {

                for(robe in robes) {

                    robe.takeOff()
                }

                robes[position].wear()

                withContext(Dispatchers.Main) {

                    val dialog = robes[position].dialogMessage()

                    showInfoDialogFragment(
                        dialog.title,
                        dialog.icon,
                        dialog.message
                    )

                    updateMerchantAppearance()
                }
            }
        }

    }
}