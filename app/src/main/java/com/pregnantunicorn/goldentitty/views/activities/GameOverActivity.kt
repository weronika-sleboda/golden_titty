package com.pregnantunicorn.goldentitty.views.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pregnantunicorn.goldentitty.databinding.GameOverActivityBinding
import com.pregnantunicorn.goldentitty.models.death.DeathReason

class GameOverActivity : AppCompatActivity() {

    private lateinit var binding: GameOverActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GameOverActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupDeathReason()
        setupMainMenuButton()
    }

    private fun setupDeathReason() {

        binding.deathReason.text = DeathReason.deathReason()
    }
    private fun setupMainMenuButton() {

        binding.mainMenuButton.setOnClickListener {

            val intent = Intent(this, MainMenuActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {}
}