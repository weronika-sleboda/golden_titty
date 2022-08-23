package com.pregnantunicorn.goldentitty.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.InformationFragmentBinding
import com.pregnantunicorn.goldentitty.models.information.CurrentInformation
import com.pregnantunicorn.goldentitty.models.information.Information

class InformationFragment : Fragment() {

    private lateinit var binding: InformationFragmentBinding
    private var information: Information? = CurrentInformation.information()

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
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun setupIcon() {

        binding.icon.setImageResource(information?.icon!!)
    }

    private fun setupName() {

        binding.name.text = information?.name
    }

    private fun setupInfo() {

        binding.info.text = information?.info
    }

    private fun setupLeaveButton() {

        binding.leaveButton.text = information?.buttonText
        binding.leaveButton.setOnClickListener {

            information?.algorithm?.invoke(requireActivity())
        }
    }

    override fun onDestroy() {

        information = null
        super.onDestroy()
    }
}