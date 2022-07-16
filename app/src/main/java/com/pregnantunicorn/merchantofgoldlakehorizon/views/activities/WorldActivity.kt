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

        goToWorldMap()
        setupWorldButton()
        setupBackpackButton()
        setupPrayerButton()
    }


    private fun setupPrayerButton() {

        binding.prayerButton.setOnClickListener {

            supportFragmentManager.commit {

                replace<PrayerFragment>(R.id.world_container)
            }
        }
    }

    private fun goToWorldMap() {

        supportFragmentManager.commit {

            replace<WorldMapFragment>(R.id.world_container)
        }
    }

    private fun setupWorldButton() {

        binding.worldButton.setOnClickListener {

            goToWorldMap()
        }
    }

    private fun setupBackpackButton() {

        binding.backpackButton.setOnClickListener {

            supportFragmentManager.commit {

                replace<BackpackFragment>(R.id.world_container)
            }
        }
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

    override fun updateGoldenCoins() {

        binding.merchant.goldenCoins.text = Merchant.goldenCoins().amountToString()
    }

}