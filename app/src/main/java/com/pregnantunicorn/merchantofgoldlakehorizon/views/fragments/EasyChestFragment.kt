package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.ChestFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlin.random.Random

class EasyChestFragment : Fragment() {

    private lateinit var binding: ChestFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = ChestFragmentBinding.inflate(inflater, container, false)

        setupIcon()
        setupOpenButton()
        setupLeaveButton()

        return binding.root
    }

    private fun setupIcon() {

        binding.icon.setImageResource(IconFactory().ironChest128())
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

            if(Player.stealth().hasAmount(2)) {

                Player.stealth().loseAmount(2)
                val status = requireActivity() as PlayerStatusUpdate
                status.updateStealth()

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

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }
}