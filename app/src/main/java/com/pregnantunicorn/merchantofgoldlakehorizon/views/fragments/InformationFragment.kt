package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.InformationFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.information.CurrentInformation

class InformationFragment : Fragment() {

    private lateinit var binding: InformationFragmentBinding
    private val information = CurrentInformation.information()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = InformationFragmentBinding.inflate(inflater, container, false)

        setupName()
        setupIcon()
        setupInfo()
        setupLeaveButton()

        return binding.root
    }

    private fun setupIcon() {

        binding.icon.setImageResource(information.icon)
    }

    private fun setupName() {

        binding.name.text = information.name
    }

    private fun setupInfo() {

        binding.info.text = information.info
    }

    private fun setupLeaveButton() {

        binding.leaveButton.text = information.buttonText
        binding.leaveButton.setOnClickListener {

            information.algorithm.invoke(requireActivity())
        }
    }
}