package com.pregnantunicorn.merchantofgoldlakehorizon.views.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.GameOverActivityBinding

class GameOverActivity : AppCompatActivity() {

    private lateinit var binding: GameOverActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GameOverActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupMainMenuButton()
    }

    private fun setupMainMenuButton() {

        binding.mainMenuButton.setOnClickListener {

            val intent = Intent(this, MainMenuActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {}
}