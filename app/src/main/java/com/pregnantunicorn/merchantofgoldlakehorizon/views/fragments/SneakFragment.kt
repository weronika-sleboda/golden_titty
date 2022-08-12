package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.SneakFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class SneakFragment : Fragment() {

    private lateinit var binding: SneakFragmentBinding
    private var counter = 0
    private var job: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = SneakFragmentBinding.inflate(inflater, container, false)

        binding.noiseProgressBar.max = 100
        binding.successProgressBar.max = 100
        setupOpenButton()
        setupStopButton()
        setupLeaveButton()

        return binding.root
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateStealth()
        status.updateTittyCounter()
    }

    private fun setupStopButton() {

        binding.sneakButton.text = "Hide"
        binding.sneakButton.setOnClickListener {

            if(job == null) {

                val stealth = 1

                if(Player.stealth().hasAmount(stealth)) {

                    Player.stealth().loseAmount(stealth)
                    updateMerchantStatus()
                    binding.sneakButton.text = "Sneak"

                    job = CoroutineScope(Dispatchers.IO).launch {

                        while(counter < 100) {

                            if(counter < 100) { counter += 10 }

                            if(counter == 100) { counter = 0 }

                            delay(4)

                            withContext(Dispatchers.Main) {

                                binding.noiseProgressBar.progress = counter
                            }
                        }
                    }
                }

                else {

                    CurrentMessage.changeMessage(
                        "No Intelligence",
                        R.drawable.intelligence64,
                        "You don't have enough intelligence to perform this action."
                    )

                    showMessage()
                }
            }

            else {

                binding.sneakButton.text = "Sneak"

                if(counter < 50) {

                    binding.successProgressBar.progress += 25

                    if(binding.successProgressBar.progress == 100) {

                        activity?.supportFragmentManager?.commit {

                            replace<LocationFragment>(R.id.world_container)
                        }
                    }
                }

                else {

                    if(binding.successProgressBar.progress > 0) {

                        binding.successProgressBar.progress -= 25
                    }

                    if(binding.successProgressBar.progress == 0) {

                        goToWorldMap()
                    }
                }

                job?.cancel()
                job = null
            }
        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    private fun setupOpenButton() {

        binding.leaveButton.setOnClickListener {


        }
    }

    private fun goToWorldMap() {

        activity?.supportFragmentManager?.commit {

            replace<LocationFragment>(R.id.world_container)
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            goToWorldMap()
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        job?.cancel()
        job = null
    }
}