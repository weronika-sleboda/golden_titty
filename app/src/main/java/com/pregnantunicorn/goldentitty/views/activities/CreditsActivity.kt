package com.pregnantunicorn.goldentitty.views.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pregnantunicorn.goldentitty.databinding.CreditsActivityBinding

class CreditsActivity : AppCompatActivity() {

    private lateinit var binding: CreditsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = CreditsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupExitButton()
    }

    private fun setupExitButton() {

        binding.exitButton.setOnClickListener {

            val intent = Intent(baseContext, MainMenuActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {}
}