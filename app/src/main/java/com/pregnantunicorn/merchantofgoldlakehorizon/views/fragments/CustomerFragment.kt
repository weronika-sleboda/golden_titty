package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.CustomerFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.suppliers.CurrentCustomer
import com.pregnantunicorn.merchantofgoldlakehorizon.views.activities.WorldActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CustomerFragment : Fragment() {

    private lateinit var binding: CustomerFragmentBinding
    private val customer = CurrentCustomer.currentCustomer()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = CustomerFragmentBinding.inflate(inflater, container, false)

        setupIcon()
        setupName()
        setupNpcLine()
        updateDealIcon()
        updateDealName()
        updateDealReward()
        updateDealDemand()
        setupBuyButton()
        setupChangeDealButton()
        setupLeaveButton()

        return binding.root
    }

    private fun setupName() {

        binding.customerName.text = customer.name
    }

    private fun setupIcon() {

        binding.customerIcon.setImageResource(customer.icon)
    }

    private fun setupNpcLine() {

        binding.customerGreeting.text = customer.greeting
    }

    private fun updateDealIcon() {

        binding.deal.demandIcon.setImageResource(customer.deal().icon)
    }

    private fun updateDealName() {

        binding.deal.demandName.text = customer.deal().name
    }

    private fun updateDealDemand() {

        binding.deal.demandAmount.text = customer.demandToString()
    }

    private fun updateDealReward() {

        binding.deal.rewardInfo.text = customer.rewardToString()
    }

    private fun updateGoldenCoins() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateGoldenCoins()
    }

    private fun updatePersuasion() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updatePersuasion()
    }

    private fun setupBuyButton() {

        binding.acceptButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                customer.sell()

                withContext(Dispatchers.Main) {

                    binding.customerGreeting.text = customer.endingLine()
                    updateGoldenCoins()
                    updateDealIcon()
                    updateDealReward()
                    updateDealName()
                    updateDealDemand()
                }
            }
        }
    }

    private fun setupChangeDealButton() {

        binding.newDealButton.root.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                customer.changeDeal()

                withContext(Dispatchers.Main) {

                    binding.customerGreeting.text = customer.endingLine()
                    updatePersuasion()
                    updateDealIcon()
                    updateDealReward()
                    updateDealName()
                    updateDealDemand()
                }
            }
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<NpcFragment>(R.id.world_container)
            }
        }
    }
}