package com.pregnantunicorn.goldentitty.views.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentManager
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.MainMenuActivityBinding
import com.pregnantunicorn.goldentitty.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.goldentitty.models.day_cycle.DayCycle
import com.pregnantunicorn.goldentitty.models.file_manager.GameFile
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.music.Soundtrack
import com.pregnantunicorn.goldentitty.models.music.SoundtrackName
import com.pregnantunicorn.goldentitty.models.story_line.CurrentEvent
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.tutorial.Tutorial
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainMenuActivity : AppCompatActivity() {

    private lateinit var binding: MainMenuActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = MainMenuActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.IO).launch {

            GameFile().reset()
        }

        CoroutineScope(Dispatchers.IO).launch {

            Soundtrack.changeSoundtrack(SoundtrackName.OPENING_THEME)
            Soundtrack.playMusic(this@MainMenuActivity)
        }

        setupPlayButton()
        setupContinueButton()
        setupCreditsButton()
        hideContinueButton()

    }

    private fun setupPlayButton() {

        binding.playButton.setOnClickListener {

            CurrentEvent.changeEvent(EventTitle.OPENING)

            val intent = Intent(baseContext, EventActivity::class.java)
            startActivity(intent)
        }
    }

    private fun hideContinueButton() {

        CoroutineScope(Dispatchers.IO).launch {

            val sharedPreferences = "shared_preferences"
            val fileExists = GameFile().fileExists(getSharedPreferences(sharedPreferences, MODE_PRIVATE))

            if(fileExists == null) {

                binding.continueButton.isVisible = false
            }
        }
    }

    private fun setupContinueButton() {

        binding.continueButton.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                Tutorial.noNeedForTutorial()

                val sharedPreferences = "shared_preferences"
                GameFile().fileExists(getSharedPreferences(sharedPreferences, MODE_PRIVATE))

                withContext(Dispatchers.Main) {

                    val intent = Intent(baseContext, WorldActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }

    private fun setupCreditsButton() {

        binding.creditsButton.setOnClickListener {

            val intent = Intent(baseContext, CreditsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {}
}