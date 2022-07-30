package com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.InfoDialogFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.Message

class InfoDialogFragment(private val message: Message)

    : DialogFragment() {

    private lateinit var binding: InfoDialogFragmentBinding

    companion object {

        const val INFO_TAG = "InfoTag"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = InfoDialogFragmentBinding.inflate(inflater, container, false)

        setupTitle()
        setupIcon()
        setupMessage()
        setupButton()
        isCancelable = false

        return binding.root
    }

    private fun setupTitle() {

        binding.title.text = message.title
    }

    private fun setupIcon() {

        binding.icon.setImageResource(message.icon)
    }

    private fun setupMessage() {

        binding.message.text = message.content
    }

    private fun setupButton() {

        binding.button.setOnClickListener {

            dismiss()
        }
    }
}