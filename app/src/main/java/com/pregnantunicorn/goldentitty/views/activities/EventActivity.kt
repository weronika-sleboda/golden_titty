package com.pregnantunicorn.goldentitty.views.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pregnantunicorn.goldentitty.databinding.EventActivityBinding
import com.pregnantunicorn.goldentitty.models.story_line.EventFactory
import com.pregnantunicorn.goldentitty.models.story_line.events.EndingEvent

class EventActivity : AppCompatActivity() {

    private lateinit var binding: EventActivityBinding
    private val event = EventFactory.currentEvent()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = EventActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateIcon()
        updateLine()
        updateName()
        updateButtonText()
        setupActionButton()
        setupSkipButton()
    }

    private fun updateName() {

        binding.npcName.text = event.eventLine().name
    }

    private fun updateIcon() {

        binding.npcIcon.setImageResource(event.eventLine().icon)
    }

    private fun updateLine() {

        binding.npcLine.text = event.eventLine().line
    }

    private fun updateButtonText() {

        binding.actionButton.text = event.eventLine().buttonText
    }

    private fun setupActionButton() {

       binding.actionButton.setOnClickListener {

            event.proceed()
            updateName()
            updateLine()
            updateIcon()
            updateButtonText()

            if(EndingEvent.event.hasAlreadyHappened()) {

                exitToMainMenu()
            }

            else {

                if(event.hasAlreadyHappened()) {

                    goToWorldMap()
                }
            }
        }
    }

    private fun goToWorldMap() {

        val intent = Intent(baseContext, WorldActivity::class.java)
        startActivity(intent)
    }

    private fun exitToMainMenu() {

        val intent = Intent(baseContext, MainMenuActivity::class.java)
        startActivity(intent)
    }

    private fun setupSkipButton() {

        binding.skipButton.setOnClickListener {

            val intent = Intent(baseContext, WorldActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {}
}