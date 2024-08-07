package com.pregnantunicorn.goldentitty.views.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.EntranceFragmentBinding
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.entrances.CurrentEntrance
import com.pregnantunicorn.goldentitty.models.entrances.Entrance
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.story_line.CurrentEvent
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.views.activities.EventActivity
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class EntranceFragment : Fragment() {

    private lateinit var binding: EntranceFragmentBinding
    private var entrance: Entrance? = CurrentEntrance.entrance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = EntranceFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.ENTRANCE_FRAGMENT)
        }

        setupIcon()
        setupName()
        setupInfo()
        setupEnterButton()
        setupLeaveButton()
        setupFab()

        return binding.root
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)
        fab?.setOnClickListener {

            CurrentHandState.changeHandState(HandState.EMPTY)
            fab.setImageResource(CurrentHandState.fabIcon())
        }
    }

    private fun setupName() {

        binding.name.text = entrance?.name
    }

    private fun setupIcon() {

        binding.icon.setImageResource(entrance?.icon?.invoke()!!)
    }

    private fun setupInfo() {

        binding.info.text = entrance?.info
    }

    private fun setupEnterButton() {

        binding.enterButton.text = entrance?.buttonText

        binding.enterButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                if(!entrance?.enter(requireActivity())!!) {

                    withContext(Dispatchers.Main) {

                        CurrentMessage.changeMessage(
                            "Locked",
                            R.drawable.padlock64,
                            "The door is locked.You need to have a key."
                        )

                        showMessage()
                    }
                }
            }
        }
    }

    private fun goToEventActivity() {

        val intent = Intent(context, EventActivity::class.java)
        startActivity(intent)
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

    override fun onDestroy() {

        entrance = null
        super.onDestroy()
    }
}