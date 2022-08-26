package com.pregnantunicorn.goldentitty.views.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pregnantunicorn.goldentitty.databinding.MainMenuActivityBinding
import com.pregnantunicorn.goldentitty.models.story_line.EventFactory
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle

class MainMenuActivity : AppCompatActivity() {

    private lateinit var binding: MainMenuActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = MainMenuActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupPlayButton()
        setupContinueButton()
        hideContinueButton()

    }

    private fun setupPlayButton() {

        binding.playButton.setOnClickListener {

            EventFactory.changeEvent(EventTitle.OPENING)

            val intent = Intent(baseContext, EventActivity::class.java)
            startActivity(intent)
        }
    }

    private fun hideContinueButton() {

    }

    private fun setupContinueButton() {

        binding.continueButton.setOnClickListener {

            val intent = Intent(baseContext, WorldActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {}
}