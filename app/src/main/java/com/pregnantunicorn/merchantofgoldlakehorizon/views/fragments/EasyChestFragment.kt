package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.EasyChestFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlin.random.Random

class EasyChestFragment : Fragment() {

    private lateinit var binding: EasyChestFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = EasyChestFragmentBinding.inflate(inflater, container, false)

        setupOpenButton()

        return binding.root
    }

    private var condition: Boolean = false

    private fun setupOpenButton() {

        binding.openButton.setOnClickListener {

            condition = when(Random.nextInt(4)) {

                0 -> binding.firstSwitch.isChecked && binding.secondSwitch.isChecked
                1 -> !binding.firstSwitch.isChecked && binding.secondSwitch.isChecked
                2 -> !binding.firstSwitch.isChecked && !binding.secondSwitch.isChecked
                else -> binding.firstSwitch.isChecked && !binding.secondSwitch.isChecked
            }

            if(Merchant.intelligence().hasAmount(2)) {

                Merchant.intelligence().loseAmount(2)
                val status = requireActivity() as MerchantStatusUpdate
                status.updateIntelligence()

                if(condition) {

                    activity?.supportFragmentManager?.commit {

                        replace<LocationFragment>(R.id.world_container)
                    }
                }

                else {

                    CurrentMessage.changeMessage(
                        "You Failed",
                        R.drawable.chest64_morning,
                        "You failed to open the chest."
                    )

                    showMessage()
                }
            }
        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }
}