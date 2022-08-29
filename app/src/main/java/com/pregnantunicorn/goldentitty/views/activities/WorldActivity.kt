package com.pregnantunicorn.goldentitty.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.WorldActivityBinding
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.goldentitty.models.day_cycle.DayCycle
import com.pregnantunicorn.goldentitty.models.food.FoodType
import com.pregnantunicorn.goldentitty.models.food.Foods
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.meteor.Meteor
import com.pregnantunicorn.goldentitty.models.music.Soundtrack
import com.pregnantunicorn.goldentitty.models.music.SoundtrackName
import com.pregnantunicorn.goldentitty.models.resources.Resources
import com.pregnantunicorn.goldentitty.models.tutorial.Tutorial
import com.pregnantunicorn.goldentitty.views.callbacks.WorldActivityUiUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import com.pregnantunicorn.goldentitty.views.fragments.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WorldActivity : AppCompatActivity(), WorldActivityUiUpdate {

    private lateinit var binding: WorldActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = WorldActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateHealth()
        updateEnergy()
        updateCoconuts()
        updateFish()
        updateIron()
        updateWood()

        updateFab()
        selectWorldButton()
        setupWorldButton()
        setupBackpackButton()
        setupSettingsButton()
        goToWorldMap()

        if(Tutorial.needed()) {

            CoroutineScope(Dispatchers.IO).launch {

                CurrentMessage.changeMessage(
                    "Info",
                    R.drawable.info64,
                    "If you need instructions on how to play various parts of the game, look always for an i-icon below your status."
                )

                withContext(Dispatchers.Main) {

                    showMessage()
                }
            }
        }

        CoroutineScope(Dispatchers.IO).launch {

            when(CurrentDayCycle.dayCycle()) {

                DayCycle.MORNING -> Soundtrack.changeSoundtrack(SoundtrackName.MORNING_THEME)
                DayCycle.SUNSET -> Soundtrack.changeSoundtrack(SoundtrackName.SUNSET_THEME)
                DayCycle.NIGHT -> Soundtrack.changeSoundtrack(SoundtrackName.NIGHT_THEME)
            }

            Soundtrack.playMusic(this@WorldActivity)

        }
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(supportFragmentManager, InfoDialogFragment.INFO_TAG)
    }

    override fun updateFab() {

        binding.itemHolder.setImageResource(CurrentHandState.fabIcon())
    }

    private fun goToWorldMap() {

        CurrentFragment.executeFragment(this)
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

        binding.player.health.text = Meteor.health().amountToString()
    }

    override fun updateEnergy() {

        binding.player.energy.text = Meteor.energy().amountToString()
    }

    override fun updateCoconuts() {

        binding.player.coconuts.text = Foods.food(FoodType.COCONUT).amountToString()
    }

    override fun updateFish() {

        binding.player.fish.text = Foods.food(FoodType.FISH).amountToString()
    }

    override fun updateIron() {

        binding.player.iron.text = Resources.iron().amountToString()
    }

    override fun updateWood() {

        binding.player.wood.text = Resources.wood().amountToString()
    }

    override fun onBackPressed() {}
}