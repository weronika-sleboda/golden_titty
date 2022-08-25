package com.pregnantunicorn.goldentitty.views.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.views.activities.MainMenuActivity
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.SettingsFragmentBinding
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.views.dialog_fragments.YesOrNoDialogFragment
import kotlin.system.exitProcess

class SettingsFragment : Fragment() {

    private lateinit var binding: SettingsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = SettingsFragmentBinding.inflate(inflater, container, false)

        setupMainMenuButton()
        setupExitGameButton()
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

    private fun setupMainMenuButton() {

        binding.mainMenuButton.setOnClickListener {

            showYesOrNoDialogFragment("Main menu", IconFactory().questionMark64(),
                "Are you sure you want to exit to main menu? All unsaved progress will be lost."
            ) { goToMainMenu() }
        }
    }

    private fun setupExitGameButton() {

        binding.exitButton.setOnClickListener {

            showYesOrNoDialogFragment("Exit game", IconFactory().questionMark64(),
                "Are you sure you want to exit the game? All unsaved progress will be lost."
            ) { exitGame()}

        }
    }

    private fun goToMainMenu() {

        val intent = Intent(context, MainMenuActivity::class.java)
        startActivity(intent)
    }

    private fun exitGame() {

        activity?.finishAffinity()
        exitProcess(0)
    }

    private fun showYesOrNoDialogFragment(
        title: String, icon: Int,
        message: String,
        yesAlgorithm: () -> Unit
    )
    {

        YesOrNoDialogFragment(
            title,
            icon,
            message,
        )
        { yesAlgorithm.invoke() }.show(parentFragmentManager, YesOrNoDialogFragment.YES_OR_NO_TAG)
    }

}