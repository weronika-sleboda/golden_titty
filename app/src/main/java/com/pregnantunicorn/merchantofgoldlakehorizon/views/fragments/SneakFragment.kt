package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.HardChestFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.SneakFragmentBinding
import kotlinx.coroutines.*
import java.util.concurrent.TimeUnit
import kotlin.time.Duration

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

        return binding.root
    }

    private fun setupStopButton() {

        binding.sneakButton.text = "Hide"
        binding.sneakButton.setOnClickListener {

            if(job == null) {

                binding.sneakButton.text = "Go"
                job = CoroutineScope(Dispatchers.IO).launch {

                    while(counter < 100) {

                        if(counter < 100) {

                            counter += 10
                        }

                        if(counter == 100) {

                            counter = 0

                        }

                        delay(4)

                        withContext(Dispatchers.Main) {

                            binding.noiseProgressBar.progress = counter
                        }


                    }
                }
            }

            else {

                binding.sneakButton.text = "Go"

                if(counter < 50) {

                    binding.successProgressBar.progress += 25

                    if(binding.successProgressBar.progress == 100) {

                        activity?.supportFragmentManager?.commit {

                            replace<BedFragment>(R.id.world_container)
                        }
                    }
                }

                else {

                    if(binding.successProgressBar.progress > 0) {

                        binding.successProgressBar.progress -= 25
                    }

                    if(binding.successProgressBar.progress == 0) {

                        activity?.supportFragmentManager?.commit {

                            replace<LocationFragment>(R.id.world_container)
                        }
                    }
                }

                job?.cancel()
                job = null
            }
        }
    }
    private fun setupOpenButton() {

        binding.leaveButton.setOnClickListener {


        }
    }

    override fun onDestroy() {
        super.onDestroy()

        job?.cancel()
        job = null
    }
}