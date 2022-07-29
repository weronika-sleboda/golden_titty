package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.MeteorsHarpFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

class MeteorsHarpFragment : Fragment() {

    private lateinit var binding: MeteorsHarpFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = MeteorsHarpFragmentBinding.inflate(inflater, container, false)

        setupIcon()
        setupPlayMusicButton()
        setupStopMusicButton()
        setupLeaveButton()

        return binding.root
    }

    private fun setupIcon() {

        binding.icon.setImageResource(IconFactory().harp128())
    }

    private fun setupPlayMusicButton() {

        binding.playMusicButton.setOnClickListener {


        }
    }

    private fun setupStopMusicButton() {

        binding.stopMusicButton.setOnClickListener {


        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }

}