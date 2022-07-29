package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.MeteorsDeskFragmentBinding

class MeteorsDeskFragment : Fragment() {

    private lateinit var binding: MeteorsDeskFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = MeteorsDeskFragmentBinding.inflate(inflater, container, false)

        setupPlayMusicButton()
        setupStopMusicButton()
        setupLeaveButton()

        return binding.root
    }

    private fun setupPlayMusicButton() {

        binding.saveButton.setOnClickListener {


        }
    }

    private fun setupStopMusicButton() {

        binding.loadButton.setOnClickListener {


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