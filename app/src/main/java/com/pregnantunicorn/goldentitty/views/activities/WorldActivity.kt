package com.pregnantunicorn.goldentitty.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.WorldActivityBinding
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.player.Player
import com.pregnantunicorn.goldentitty.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.goldentitty.views.fragments.*

class WorldActivity : AppCompatActivity(), PlayerStatusUpdate {

    private lateinit var binding: WorldActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = WorldActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateHealth()
        updateEnergy()
        updateStoryProgress()
        updateCoconuts()
        updateStone()
        updateWood()

        updateFab()
        selectWorldButton()
        setupWorldButton()
        setupBackpackButton()
        setupSettingsButton()
        goToWorldMap()
    }

    override fun updateFab() {

        binding.itemHolder.setImageResource(CurrentHandState.fabIcon())
    }

    private fun goToWorldMap() {

        supportFragmentManager.commit {

            replace<LocationFragment>(R.id.world_container)
        }
    }

    private fun setupWorldButton() {

        binding.worldButton.setOnClickListener {

            selectWorldButton()
            CurrentFragment.executeFragment(this)
        }
    }

    private fun setupBackpackButton() {

        binding.backpackButton.setOnClickListener {

            selectBackpackButton()

            supportFragmentManager.commit {

                replace<BackpackFragment>(R.id.world_container)
            }
        }
    }

    private fun setupSettingsButton() {

        binding.settingsButton.setOnClickListener {

            selectPrayerButton()

            supportFragmentManager.commit {

                replace<SettingsFragment>(R.id.world_container)
            }
        }
    }

    private fun selectWorldButton() {

        binding.worldButton.setBackgroundResource(R.drawable.light_oval_gradient_button_background)
        binding.backpackButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.settingsButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
    }

    private fun selectBackpackButton() {

        binding.worldButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.backpackButton.setBackgroundResource(R.drawable.light_oval_gradient_button_background)
        binding.settingsButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
    }

    private fun selectPrayerButton() {

        binding.worldButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.backpackButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.settingsButton.setBackgroundResource(R.drawable.light_oval_gradient_button_background)
    }

    override fun updateHealth() {

        binding.player.health.text = Player.health().amountToString()
    }

    override fun updateEnergy() {

        binding.player.energy.text = Player.energy().amountToString()
    }

    override fun updateStoryProgress() {

        binding.player.storyProgress.text = Player.storyProgress().progressToString()
    }

    override fun updateCoconuts() {

        binding.player.coconuts.text = Player.coconuts().amountToString()
    }

    override fun updateStone() {

        binding.player.stone.text = Player.stone().amountToString()
    }

    override fun updateWood() {

        binding.player.wood.text = Player.wood().amountToString()
    }

    override fun onBackPressed() {}
}