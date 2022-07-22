package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.TradingHouseFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.trading_house.DealFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.GemUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class TradingHouseFragment : Fragment() {

    private lateinit var binding: TradingHouseFragmentBinding
    private var deal = DealFactory.deal()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = TradingHouseFragmentBinding.inflate(inflater, container, false)

        updateDeal()
        setupChangeDealButton()
        setupAcceptButton()
        setupLeaveButton()

        return binding.root
    }

    private fun updateDeal() {

        binding.deal.demandName.text = deal.name
        binding.deal.demandIcon.setImageResource(deal.icon)
        binding.deal.demandAmount.text = deal.demandToString()
        binding.deal.rewardInfo.text = deal.rewardToString()

    }

    private fun updateMerchantPersuasion() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updatePersuasion()
    }

    private fun setupChangeDealButton() {

        binding.changeDealButton.root.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(DealFactory.changeDeal()) {

                    deal = DealFactory.deal()

                    withContext(Dispatchers.Main) {

                        updateMerchantPersuasion()
                        updateDeal()
                    }
                }

                else {

                    showInfoDialogFragment(
                        DealFactory.dialogMessage().title,
                        DealFactory.dialogMessage().icon,
                        DealFactory.dialogMessage().message
                    )
                }
            }
        }
    }

    private fun updateMerchantStatus() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateGoldenCoins()

        statusUpdate.updateEmerald()
        statusUpdate.updateSapphire()
        statusUpdate.updateRuby()

    }

    private fun setupAcceptButton() {

        binding.acceptButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(deal.sell()) {

                    DealFactory.generateNewDeal()
                    deal = DealFactory.deal()

                    withContext(Dispatchers.Main) {

                        updateMerchantStatus()
                        updateDeal()
                    }
                }

                else {

                    withContext(Dispatchers.Main) {

                        showInfoDialogFragment(
                            deal.dialogMessage().title,
                            deal.dialogMessage().icon,
                            deal.dialogMessage().message
                        )
                    }
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