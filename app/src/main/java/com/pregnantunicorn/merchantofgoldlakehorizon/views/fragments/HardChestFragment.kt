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

class HardChestFragment : Fragment() {

    private lateinit var binding: HardChestFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = HardChestFragmentBinding.inflate(inflater, container, false)

        setupOpenButton()

        return binding.root
    }

    private fun setupOpenButton() {

        binding.openButton.setOnClickListener {

            if(binding.firstSwitch.isChecked && !binding.secondSwitch.isChecked) {

                activity?.supportFragmentManager?.commit {

                    replace<LocationFragment>(R.id.world_container)
                }
            }
        }
    }
}