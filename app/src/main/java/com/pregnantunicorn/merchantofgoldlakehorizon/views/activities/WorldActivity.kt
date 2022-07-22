package com.pregnantunicorn.merchantofgoldlakehorizon.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.text.TextUtils.replace
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.databinding.WorldActivityBinding
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.skill_upgrade.SkillManager
import com.pregnantunicorn.merchantofgoldlakehorizon.views.callbacks.MerchantStatusUpdate
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.*

class WorldActivity : AppCompatActivity(), MerchantStatusUpdate {

    private lateinit var binding: WorldActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = WorldActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateEnergy()
        updatePersuasion()
        updateCharisma()
        updateIntelligence()
        updateGoldenCoins()
        updateHourglass()

        updateEmerald()
        updateSapphire()
        updateRuby()

        selectWorldButton()
        goToWorldMap()
        setupWorldButton()
        setupBackpackButton()
        setupPrayerButton()
        setupSettingsButton()
    }

    private fun goToWorldMap() {

        supportFragmentManager.commit {

            replace<WorldMapFragment>(R.id.world_container)
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

    private fun setupPrayerButton() {

        binding.prayerButton.setOnClickListener {

            selectPrayerButton()

            supportFragmentManager.commit {

                replace<PrayerFragment>(R.id.world_container)
            }
        }
    }

    private fun setupSettingsButton() {

        binding.settingsButton.setOnClickListener {

            selectSettingsButton()

            supportFragmentManager.commit {

                replace<SettingsFragment>(R.id.world_container)
            }
        }
    }

    private fun selectWorldButton() {

        binding.worldButton.setBackgroundResource(R.drawable.light_oval_gradient_button_background)
        binding.backpackButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.prayerButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.settingsButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
    }

    private fun selectBackpackButton() {

        binding.worldButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.backpackButton.setBackgroundResource(R.drawable.light_oval_gradient_button_background)
        binding.prayerButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.settingsButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
    }

    private fun selectPrayerButton() {

        binding.worldButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.backpackButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.prayerButton.setBackgroundResource(R.drawable.light_oval_gradient_button_background)
        binding.settingsButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
    }

    private fun selectSettingsButton() {

        binding.worldButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.backpackButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.prayerButton.setBackgroundResource(R.drawable.dark_oval_gradient_button_background)
        binding.settingsButton.setBackgroundResource(R.drawable.light_oval_gradient_button_background)
    }

    override fun updatePersuasion() {

        binding.merchant.persuasion.text = Merchant.persuasion().amountToString()
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

    override fun updateEmerald() {

        binding.resources.emerald.text = Merchant.emerald().amountToString()
    }

    override fun updateSapphire() {

        binding.resources.sapphire.text = Merchant.sapphire().amountToString()
    }

    override fun updateRuby() {

        binding.resources.ruby.text = Merchant.ruby().amountToString()
    }

    override fun updateHourglass() {

        binding.merchant.hourglass.text = Merchant.hourglass().dayCycleNumberToString()
    }

    override fun updateGoldenCoins() {

        binding.merchant.goldenCoins.text = Merchant.goldenCoins().amountToString()
    }

    override fun updateAppearance() {

        binding.merchant.icon.setImageResource(Merchant.appearance().icon())
    }

}