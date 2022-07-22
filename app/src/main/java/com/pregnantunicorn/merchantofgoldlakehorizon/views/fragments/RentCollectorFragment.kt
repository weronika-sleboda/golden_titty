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
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.RentCollectorFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.rent.Rent
import com.pregnantunicorn.merchantofgoldlakehorizon.views.activities.GameOverActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RentCollectorFragment : Fragment() {

    private lateinit var binding: RentCollectorFragmentBinding
    private val rent = Rent()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = RentCollectorFragmentBinding.inflate(inflater, container, false)

        setupPriceInfo()
        setupYesButton()
        setupNoButton()

        return binding.root
    }

    private fun setupPriceInfo() {

        binding.price.title.text = rent.rentInfo()
        binding.price.requiredGold.text = rent.priceToString()
    }

    private fun updateMerchantGold() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateGoldenCoins()
    }

    private fun setupYesButton() {

        binding.yesButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(rent.payRent()) {

                    withContext(Dispatchers.Main) {

                        updateMerchantGold()
                        goToWorldMap()

                        showInfoDialogFragment(
                            "Rent Has Been Paid",
                            R.drawable.jin64,
                            "Great! See you next time!"
                        )
                    }
                }

                else {

                    showInfoDialogFragment(
                        rent.dialogMessage().title,
                        rent.dialogMessage().icon,
                        rent.dialogMessage().message
                    )
                }
            }
        }
    }

    private fun goToWorldMap() {

        activity?.supportFragmentManager?.commit {

            replace<WorldMapFragment>(R.id.world_container)
        }
    }

    private fun setupNoButton() {

        binding.noButton.setOnClickListener {

            val intent = Intent(context, GameOverActivity::class.java)
            startActivity(intent)
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