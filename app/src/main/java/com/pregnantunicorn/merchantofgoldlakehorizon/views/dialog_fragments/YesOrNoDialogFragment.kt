package com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.YesOrNoDialogFragmentBinding

class YesOrNoDialogFragment(
    private val title: String,
    private val icon: Int,
    private val message: String,
    private val yesAlgorithm: () -> Unit
)
    : DialogFragment() {

    private lateinit var binding: YesOrNoDialogFragmentBinding

    companion object {

        const val YES_OR_NO_TAG = "YesOrNoTag"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = YesOrNoDialogFragmentBinding.inflate(inflater, container, false)

        setupTitle()
        setupIcon()
        setupMessage()
        setupYesButton()
        setupNoButton()
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

    private fun setupYesButton() {

        binding.yesButton.setOnClickListener {

            dismiss()
            yesAlgorithm.invoke()
        }
    }

    private fun setupNoButton() {

        binding.noButton.setOnClickListener {

            dismiss()
        }
    }
}