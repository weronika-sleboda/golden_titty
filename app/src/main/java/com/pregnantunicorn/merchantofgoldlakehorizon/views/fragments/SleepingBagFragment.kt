package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.SleepingBagFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.CurrentFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.FragmentType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.tent.SleepingBag
import com.pregnantunicorn.merchantofgoldlakehorizon.views.activities.GameOverActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SleepingBagFragment : Fragment() {

    private lateinit var binding: SleepingBagFragmentBinding
    private var sleepingBag: SleepingBag? = SleepingBag()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = SleepingBagFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.SLEEPING_BAG_FRAGMENT)
        }

        setupIcon()
        setupSleepButton()
        setupLeaveButton()
        setupHealthCostToString()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {}
    }

    private fun setupIcon() {

        binding.icon.setImageResource(sleepingBag?.icon()!!)
    }

    private fun setupHealthCostToString() {

        binding.requirement.healthCost.text = sleepingBag?.healthCostToString()
    }

    private fun updateMerchantStatus() {

        val statusUpdate = requireActivity() as PlayerStatusUpdate
        statusUpdate.updateHealth()
        statusUpdate.updateAccuracy()
        statusUpdate.updateAgility()
        statusUpdate.updateStealth()
    }

    private fun setupSleepButton() {

        binding.sleepButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                sleepingBag?.sleep()

                withContext(Dispatchers.Main) {

                    if(Player.isDead()) {

                        endTheGame()
                    }

                    else {

                        updateMerchantStatus()
                        showMessage()
                        goToWorldMap()
                    }
                }
            }
        }
    }

    private fun endTheGame() {

        val intent = Intent(context, GameOverActivity::class.java)
        startActivity(intent)
    }

    private fun goToWorldMap() {

        activity?.supportFragmentManager?.commit {

            replace<LocationFragment>(R.id.world_container)
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            goToWorldMap()
        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    override fun onDestroy() {

        sleepingBag = null
        super.onDestroy()
    }
}