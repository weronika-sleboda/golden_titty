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
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.MeteorsAltarFragmentBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.dialog_fragments.YesOrNoDialogFragment
import kotlin.system.exitProcess

class MeteorsAltarFragment : Fragment() {

    private lateinit var binding: MeteorsAltarFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = MeteorsAltarFragmentBinding.inflate(inflater, container, false)

        setupIcon()
        setupMainMenuButton()
        setupExitGameButton()
        setupLeaveButton()

        return binding.root
    }

    private fun setupIcon() {

        binding.icon.setImageResource(IconFactory().meteorsAltar128())
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

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
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