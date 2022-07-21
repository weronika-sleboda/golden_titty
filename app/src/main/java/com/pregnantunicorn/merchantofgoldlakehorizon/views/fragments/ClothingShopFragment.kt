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
import com.pregnantunicorn.merchantofgoldlakehorizon.models.clothing.CurrentRobeManager
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ClothingShopFragment : Fragment() {

    private lateinit var binding: ClothingShopFragmentBinding
    private val robeManager = CurrentRobeManager.robeManager()

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
        setupLeaveButton()
        hideBuyButton()

        return binding.root
    }

    private fun hideBuyButton() {

        if(robeManager.alreadyBought()) {

            binding.buyButton.isVisible = false
        }
    }

    private fun setupPriceInfo() {

        binding.requirement.requiredGold.text = robeManager.priceToString()
    }

    private fun setupIcon() {

        binding.icon.setImageResource(robeManager.icon)
    }

    private fun setupName() {

        binding.name.text = robeManager.name
    }

    private fun setupInfo() {

        binding.info.text = robeManager.info
    }

    private fun updateMerchantGold() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateGoldenCoins()
    }

    private fun setupBuyButton() {

        binding.buyButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(robeManager.buy()) {

                    withContext(Dispatchers.Main) {

                        showInfoDialogFragment(
                            robeManager.dialogMessage().title,
                            robeManager.dialogMessage().icon,
                            robeManager.dialogMessage().message
                        )

                        updateMerchantGold()
                        hideBuyButton()
                    }
                }

                else {

                    showInfoDialogFragment(
                        "Too expensive",
                        R.drawable.golden_coin_64,
                        "You don't have enough golden coins to buy this robe."
                    )
                }

            }
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<WorldMapFragment>(R.id.world_container)
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