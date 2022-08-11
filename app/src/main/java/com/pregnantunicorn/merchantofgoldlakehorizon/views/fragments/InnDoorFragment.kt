package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.InnDoorFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.inn.CurrentInnDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class InnDoorFragment : Fragment() {

    private lateinit var binding: InnDoorFragmentBinding
    private val innDoor = CurrentInnDoor.innDoor()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = InnDoorFragmentBinding.inflate(inflater, container, false)

        setupIcon()
        setupName()
        setupInfo()
        setupRequiredGoldInfo()
        setupEnterButton()
        setupLeaveButton()
        return binding.root
    }

    private fun setupName() {

        binding.name.text = innDoor.name
    }

    private fun setupIcon() {

        binding.icon.setImageResource(innDoor.icon.invoke())
    }

    private fun setupInfo() {

        binding.info.text = innDoor.info
    }

    private fun setupRequiredGoldInfo() {

        binding.requirement.requiredGold.text = innDoor.priceToString()
    }

    private fun updateGold() {

        val status = requireActivity() as MerchantStatusUpdate
        status.updateGoldCoins()
    }

    private fun setupEnterButton() {

        binding.enterButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(innDoor.enter()) {

                    updateGold()
                    goToBedFragment()
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

    private fun goToBedFragment() {

        activity?.supportFragmentManager?.commit {

            replace<BedFragment>(R.id.world_container)
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