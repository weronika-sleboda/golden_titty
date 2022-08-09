package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.GemSupplierFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.cave.CurrentGemSupplier
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.ResourceUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class GemSupplierFragment: Fragment() {

    private lateinit var binding: GemSupplierFragmentBinding
    private val gemSupplier = CurrentGemSupplier.gemSupplier()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = GemSupplierFragmentBinding.inflate(inflater, container, false)

        setupName()
        setupInfo()
        setupIcon()
        setupDigButton()
        setupLeaveButton()

        return binding.root
    }

    private fun setupName() {

        binding.name.text = gemSupplier.name
    }

    private fun setupIcon() {

        binding.icon.setImageResource(gemSupplier.icon)
    }

    private fun setupInfo() {

        binding.info.text = gemSupplier.info
    }

    private fun updateMerchantStatus() {

        val status = requireActivity() as MerchantStatusUpdate
        status.updateEnergy()

        when(gemSupplier.resourceUpdateType) {


        }
    }

    private fun setupDigButton() {

        binding.digButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(gemSupplier.dig()) {

                    withContext(Dispatchers.Main) {

                        updateMerchantStatus()
                    }
                }

                else {

                    withContext(Dispatchers.Main) {

                        showMessage()
                    }
                }
            }
        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }
}