package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.LinearLayoutManager
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.FoodShopFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.shops.FoodShop
import com.pregnantunicorn.merchantofgoldlakehorizon.views.adapters.FoodProductAdapter
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FoodShopFragment : Fragment(), FoodProductAdapter.ProductListener {

    private lateinit var binding: FoodShopFragmentBinding
    private lateinit var adapter: FoodProductAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private var products = FoodShop().products

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FoodShopFragmentBinding.inflate(inflater, container, false)

        setupLeaveButton()
        updateProducts()

        return binding.root
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as MerchantStatusUpdate
        status.updateGoldenCoins()
    }

    override fun onClickProduct(position: Int) {

        CoroutineScope(Dispatchers.IO).launch {

            if(products[position].buy()) {

                products = FoodShop().products

                withContext(Dispatchers.Main) {

                    showMessage()
                    updateMerchantStatus()
                    updateProducts()
                }
            }

            else {

                withContext(Dispatchers.Main) {

                    showMessage()
                }
            }
        }
    }

    private fun updateProducts() {

        adapter = FoodProductAdapter(products, this)
        layoutManager = LinearLayoutManager(context)
        binding.productRecycler.adapter = adapter
        binding.productRecycler.layoutManager = layoutManager
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }
}