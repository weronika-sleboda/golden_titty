package com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.InfoDialogFragmentBinding

class InfoDialogFragment(
    private val title: String,
    private val icon: Int,
    private val message: String,
    private val buttonText: String,
)
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

        binding.title.text = title
    }

    private fun setupIcon() {

        binding.icon.setImageResource(icon)
    }

    private fun setupMessage() {

        binding.message.text = message
    }

    private fun setupButton() {

        binding.button.text = buttonText
        binding.button.setOnClickListener {

            dismiss()
        }
    }
}