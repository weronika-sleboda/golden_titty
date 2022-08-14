package com.pregnantunicorn.merchantofgoldlakehorizon.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.WorldActivityBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.CurrentHandState
import com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment.CurrentFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.PlayerStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.*

class WorldActivity : AppCompatActivity(), PlayerStatusUpdate {

    private lateinit var binding: WorldActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = WorldActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateHealth()
        updateAccuracy()
        updateAgility()
        updateStealth()
        updateTittyCounter()
        updateGoldCoins()

        updateDates()
        updateCoconuts()
        updatePeaches()

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

        binding.merchant.health.text = Player.health().amountToString()
    }

    override fun updateAccuracy() {

        binding.merchant.accuracy.text = Player.accuracy().amountToString()
    }

    override fun updateAgility() {

        binding.merchant.agility.text = Player.agility().amountToString()
    }

    override fun updateStealth() {

        binding.merchant.stealth.text = Player.stealth().amountToString()
    }

    override fun updateDates() {

        binding.resources.dates.text = Player.dates().amountToString()
    }

    override fun updateCoconuts() {

        binding.resources.coconuts.text = Player.coconuts().amountToString()
    }

    override fun updatePeaches() {

        binding.resources.peaches.text = Player.peaches().amountToString()
    }

    override fun updateTittyCounter() {

        binding.merchant.tittyCounter.text = Player.tittyCounter().tittyCounterToString()
    }

    override fun updateGoldCoins() {

        binding.merchant.goldenCoins.text = Player.goldCoins().amountToString()
    }

    override fun onBackPressed() {}
}