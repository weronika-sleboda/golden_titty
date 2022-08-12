package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.text.TextUtils
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.SneakFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.BoomerangPlaceName
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.CurrentBoomerangPlace
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class SneakFragment : Fragment() {

    private lateinit var binding: SneakFragmentBinding
    private var job: Job? = null
    private var noise = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = SneakFragmentBinding.inflate(inflater, container, false)

        setupName()
        setupIcon()
        setupSneakButton()
        setupLeaveButton()
        setupInfoButton()
        defineMaxProgress()

        return binding.root
    }

    private fun defineMaxProgress() {

        binding.successProgressBar.max = 120
    }

    private fun setupName() {

        binding.name.text = ""
    }

    private fun setupIcon() {

        binding.icon.setImageResource(R.drawable.enemy_monk_brown128)
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as PlayerStatusUpdate
        status.updateStealth()
        status.updateTittyCounter()
    }

    private fun updateNoise() {

        noise += 5

        if(noise == 100) {

            noise = 0
        }
    }

    private fun checkWinningCondition() {

        if(binding.noiseProgressBar.progress >= 45) {

            binding.successProgressBar.progress -= 40

            if(binding.successProgressBar.progress == 0) {

                CurrentMessage.changeMessage(
                    "Pearl Titty Monk",
                    R.drawable.enemy_monk_brown64,
                    "Hey you there! Get out of here!"
                )

                showMessage()

                CurrentBoomerangPlace.changeBoomerangPlace(
                    BoomerangPlaceName.PEARL_TITTY_ALTAR)

                goToWorldMap()
            }
        }

        else {

            binding.successProgressBar.progress += 40

            if (binding.successProgressBar.progress == 120) {

                goToTittyFragment()
            }
        }
    }

    private fun goToTittyFragment() {

        activity?.supportFragmentManager?.commit {

            replace<PearlTittyFragment>(R.id.world_container)
        }
    }

    private fun updateSneakButtonText(text: Int) {

        binding.sneakButton.text = resources.getString(text)
    }

    private fun setupSneakButton() {

        updateSneakButtonText(R.string.hide)
        binding.sneakButton.setOnClickListener {

            if(job == null) {

                val stealth = 1

                if(Player.stealth().hasAmount(stealth)) {

                    Player.stealth().loseAmount(stealth)
                    updateMerchantStatus()

                   updateSneakButtonText(R.string.sneak)

                    job = CoroutineScope(Dispatchers.IO).launch {

                        while(true) {

                            updateNoise()

                            delay(10)

                            withContext(Dispatchers.Main) {

                                binding.noiseProgressBar.progress = noise
                            }
                        }
                    }
                }

                else {

                    CurrentMessage.changeMessage(
                        "No Stealth",
                        R.drawable.stealth64,
                        "You don't have enough stealth to perform this action."
                    )

                    showMessage()
                }
            }

            else {

                job?.cancel()
                job = null
                updateSneakButtonText(R.string.hide)
                checkWinningCondition()
            }
        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
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

    private fun setupInfoButton() {

        binding.info.infoButton.setOnClickListener {

            CurrentMessage.changeMessage(
                "Instructions",
                R.drawable.info64,
                "1. Press hide button to see the noise meter moving.\n" +
                        "2. Press sneak button when you see the noise being minimal.\n" +
                        "3. The noise meter has the value of 100 and the noise you are making should be below 40.\n" +
                        "4. When your sneak is successful the success progress bar will move by 20.\n" +
                        "5. Sneak until the success progress reaches its maximum value."
            )

            showMessage()
        }
    }
}