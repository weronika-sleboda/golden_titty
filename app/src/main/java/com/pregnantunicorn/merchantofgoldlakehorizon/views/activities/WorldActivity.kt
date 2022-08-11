package com.pregnantunicorn.merchantofgoldlakehorizon.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.WorldActivityBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.CurrentHandState
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.HandState
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.rent.RentTime
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.*

class WorldActivity : AppCompatActivity(), MerchantStatusUpdate {

    private  lateinit var binding: WorldActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = WorldActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateEnergy()
        updateHealth()
        updateCharisma()
        updateIntelligence()
        updateGoldenCoins()
        updateDayCycleCounter()

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
            goToWorldMap()
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

        binding.merchant.health.text = Merchant.health().amountToString()
    }

    override fun updateEnergy() {

        binding.merchant.energy.text = Merchant.energy().amountToString()
    }

    override fun updateCharisma() {

        binding.merchant.charisma.text = Merchant.charisma().amountToString()
    }

    override fun updateIntelligence() {

        binding.merchant.intelligence.text = Merchant.intelligence().amountToString()
    }

    override fun updateDates() {

        binding.resources.dates.text = Merchant.dates().amountToString()
    }

    override fun updateCoconuts() {

        binding.resources.coconuts.text = Merchant.coconuts().amountToString()
    }

    override fun updatePeaches() {

        binding.resources.peaches.text = Merchant.peaches().amountToString()
    }

    override fun updateDayCycleCounter() {

        binding.merchant.dayCycleCounter.text = RentTime.counterToString()
    }

    override fun updateGoldenCoins() {

        binding.merchant.goldenCoins.text = Merchant.goldenCoins().amountToString()
    }

    override fun updateAppearance() {

        binding.merchant.icon.setImageResource(Merchant.appearance().icon())
    }

}