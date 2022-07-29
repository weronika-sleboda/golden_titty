package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ClothingShopFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.robes.CurrentRobe
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ClothingShopFragment : Fragment() {

    private lateinit var binding: ClothingShopFragmentBinding
    private val robeManager = CurrentRobe.robe()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = ClothingShopFragmentBinding.inflate(inflater, container, false)

        setupPriceInfo()
        setupName()
        setupIcon()
        setupInfo()
        setupBuyButton()
        hideBuyButton()
        setupLeaveButton()

        return binding.root
    }

    private fun hideBuyButton() {


    }

    private fun setupPriceInfo() {


    }

    private fun setupIcon() {


    }

    private fun setupName() {

        binding.name.text = robeManager.name
    }

    private fun setupInfo() {


    }

    private fun updateMerchantGold() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateGoldenCoins()
    }

    private fun setupBuyButton() {

        binding.buyButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

            }
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
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