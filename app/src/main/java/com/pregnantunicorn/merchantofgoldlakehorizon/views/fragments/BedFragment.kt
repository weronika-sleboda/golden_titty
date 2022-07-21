package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.BedFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.bed.Bed
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BedFragment : Fragment() {

    private lateinit var binding: BedFragmentBinding
    private val bed = Bed()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = BedFragmentBinding.inflate(inflater, container, false)

        setupIcon()
        setupSleepButton()
        setupLeaveButton()

        return binding.root
    }

    private fun setupIcon() {

        binding.icon.setImageResource(bed.icon())
    }

    private fun updateMerchantStatus() {

        val statusUpdate = requireActivity() as MerchantStatusUpdate
        statusUpdate.updateEnergy()
        statusUpdate.updateCharisma()
        statusUpdate.updatePersuasion()
        statusUpdate.updateIntelligence()
    }

    private fun setupSleepButton() {

        binding.sleepButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                bed.sleep()

                withContext(Dispatchers.Main) {

                    updateMerchantStatus()

                    showInfoDialogFragment(
                        bed.dialogMessage().title,
                        bed.dialogMessage().icon,
                        bed.dialogMessage().message
                    )

                    goToWorldMap()
                }
            }
        }
    }

    private fun goToWorldMap() {

        activity?.supportFragmentManager?.commit {

            replace<WorldMapFragment>(R.id.world_container)
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            goToWorldMap()
        }
    }

    private fun showInfoDialogFragment(title: String, icon: Int, message: String) {

        InfoDialogFragment(
            title,
            icon,
            message,
            "OK"
        ).show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }
}