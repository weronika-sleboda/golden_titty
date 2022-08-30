package com.pregnantunicorn.goldentitty.views.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.databinding.BattlefieldFragmentBinding
import com.pregnantunicorn.goldentitty.models.tools.*
import com.pregnantunicorn.goldentitty.models.current_fragment.CurrentFragment
import com.pregnantunicorn.goldentitty.models.current_fragment.FragmentType
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.models.meteor.Meteor
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.story_line.CurrentEvent
import com.pregnantunicorn.goldentitty.models.temple.CurrentEnemy
import com.pregnantunicorn.goldentitty.models.temple.Enemy
import com.pregnantunicorn.goldentitty.models.temple.TempleFloors
import com.pregnantunicorn.goldentitty.views.activities.EventActivity
import com.pregnantunicorn.goldentitty.views.adapters.ToolTileAdapter
import com.pregnantunicorn.goldentitty.views.callbacks.WorldActivityUiUpdate
import com.pregnantunicorn.goldentitty.views.dialog_fragments.InfoDialogFragment
import kotlinx.coroutines.*

class BattlefieldFragment: Fragment() {

    private lateinit var binding: BattlefieldFragmentBinding
    private lateinit var adapter: ToolTileAdapter
    private lateinit var layoutManager: GridLayoutManager
    private var sword: Sword? = CurrentSword.sword()
    private var battleField: BattleField? = sword?.battleField()
    private var enemy: Enemy? = CurrentEnemy.enemy()

    private var job: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = BattlefieldFragmentBinding.inflate(inflater, container, false)

        CoroutineScope(Dispatchers.IO).launch {

            CurrentFragment.changeFragment(FragmentType.BATTLEFIELD_FRAGMENT)
        }

        updateName()
        setupEnemyDamageInfo()
        updateRange(battleField!!.range(enemy?.icon!!))
        setupLeaveButton()
        setupFab()
        setupInfoButton()
        updateEnemyHealth()
        setupFab()

        return binding.root
    }

    private fun setupEnemyDamageInfo() {

        binding.info.enemyDamage.text = enemy?.damage.toString()
    }

    private fun updateEnemyHealth() {

        binding.info.healthProgressBar.max = enemy?.maxHealth!!
        binding.info.healthProgressBar.progress = enemy?.health()!!
    }

    private fun updateName() {

        binding.name.text = enemy?.name
    }

    private fun updateRange(range: Array<ToolTile>) {

        adapter = ToolTileAdapter(range)
        layoutManager = GridLayoutManager(context, 4)
        binding.battlefieldTileRecycler.adapter = adapter
        binding.battlefieldTileRecycler.layoutManager = layoutManager
    }

    private fun updateWorldActivityUi() {

        val status = requireActivity() as WorldActivityUiUpdate
        status.updateEnergy()
        status.updateHealth()
    }

    private fun setupFab() {

        val fab = requireActivity().findViewById<FloatingActionButton>(R.id.item_holder)

        fab?.setOnClickListener {

            if(CurrentHandState.handState() == HandState.SWORD) {

                if(job == null) {

                    val energy = 1

                    if(Meteor.energy().hasAmount(energy)) {

                        Meteor.energy().loseAmount(energy)
                        updateWorldActivityUi()

                        job = CoroutineScope(Dispatchers.IO).launch {

                            while(true) {

                                battleField = sword?.battleField()

                                withContext(Dispatchers.Main) {

                                    updateRange(battleField!!.newRange(enemy?.icon!!))
                                }

                                delay(sword?.speed?.invoke()!!)
                            }
                        }
                    }

                    else {

                        CurrentMessage.changeMessage(
                            "No Energy",
                            R.drawable.energy64,
                            "You don't have enough energy to perform this action."
                        )

                        showMessage()
                    }
                }

                else {

                    job?.cancel()
                    job = null

                    CoroutineScope(Dispatchers.IO).launch {

                        withContext(Dispatchers.Main) {

                            updateRange(battleField!!.newRange(enemy?.icon!!))
                        }

                        val attackAlgorithm: () -> Unit = {

                            enemy?.loseHealth(sword?.hitAmount()!!)
                        }

                        if(battleField?.checkHitCondition({ attackAlgorithm.invoke() }, enemy?.damage!!) == true)
                        {

                            withContext(Dispatchers.Main) {

                                updateEnemyHealth()
                                updateWorldActivityUi()
                            }

                            if(enemy?.health() == 0) {

                                TempleFloors.templeFloor().beat()

                                CurrentEvent.changeEvent(TempleFloors.templeFloor().eventEnding)
                                CurrentEvent.changeEvent(TempleFloors.templeFloor().eventEndingTitle)

                                withContext(Dispatchers.Main) {

                                    CurrentFragment.changeFragment(FragmentType.TEMPLE_FRAGMENT)

                                    val intent = Intent(context, EventActivity::class.java)
                                    startActivity(intent)
                                }
                            }
                        }

                        else {

                            withContext(Dispatchers.Main) {

                                updateWorldActivityUi()
                                showMessage()

                                if(Meteor.isDead()) {

                                    CurrentEvent.changeEvent(TempleFloors.templeFloor().eventDeath)

                                    val intent = Intent(context, EventActivity::class.java)
                                    startActivity(intent)
                                }
                            }
                        }
                    }
                }
            }

            else {

                CurrentMessage.changeMessage(
                    "No Sword",
                    R.drawable.info64,
                    "Equip a sword."
                )

                showMessage()
            }
        }
    }

    private fun setupInfoButton() {

        binding.infoButton.setOnClickListener {

            CurrentMessage.changeMessage(
                "Instructions",
                R.drawable.info64,
                "1. Grab a sword from your backpack.\n" +
                        "2. Click on the sword icon at the bottom app bar in order to attack.\n" +
                        "3. When the target icon meets the enemy icon, click on the sword icon to hit the enemy.\n" +
                        "4. If you click on the sword icon while the enemy icon is covered by the target icon and you have the right timing, the enemy's health will decrease."
            )

            showMessage()
        }
    }

    private fun setupLeaveButton() {

        binding.leaveButton.setOnClickListener {

            activity?.supportFragmentManager?.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }
    }

    override fun onDestroy() {

        job?.cancel()
        job = null

        battleField = null
        sword = null

        super.onDestroy()
    }

    private fun showMessage() {

        InfoDialogFragment(CurrentMessage.message())
            .show(parentFragmentManager, InfoDialogFragment.INFO_TAG)
    }

}