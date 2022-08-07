package com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.views.activities.MainMenuActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.SettingsFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.YesOrNoDialogFragment
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

        return binding.root
    }

    private fun setupMainMenuButton() {

        binding.mainMenuButton.setOnClickListener {

            showYesOrNoDialogFragment("Main menu", R.drawable.question_mark64,
                "Are you sure you want to exit to main menu? All unsaved progress will be lost."
            ) { goToMainMenu() }
        }
    }

    private fun setupExitGameButton() {

        binding.exitButton.setOnClickListener {

            showYesOrNoDialogFragment("Exit game", R.drawable.question_mark64,
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