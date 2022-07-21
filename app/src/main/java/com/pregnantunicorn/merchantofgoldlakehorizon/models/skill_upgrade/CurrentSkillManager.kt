package com.pregnantunicorn.merchantofgoldlakehorizon.models.skill_upgrade

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.StatusUpdateType

object CurrentSkillManager {

    const val ENERGY = 0
    const val PERSUASION = 1
    const val CHARISMA = 2
    const val INTELLIGENCE = 3

    private val skillManagers = arrayOf(

        SkillManager(
            "Max Energy",
            "Energy allows you to gather resources in the forest and cave.",
            R.drawable.energy128,
            StatusUpdateType.ENERGY,
        ) { Merchant.energy().addMaxAmount(1)},

        SkillManager(
            "Max Persuasion",
            "Persuasion allows you to change unfavourable deals.",
            R.drawable.persuasion128,
            StatusUpdateType.PERSUASION,
        ) { Merchant.persuasion().addMaxAmount(1)},

        SkillManager(
            "Max Charisma",
            "Charisma allows you to enter buildings through closed doors.",
            R.drawable.charisma128,
            StatusUpdateType.CHARISMA,
        ) { Merchant.charisma().addMaxAmount(1)},

        SkillManager(
            "Max Intelligence",
            "Intelligence allows you to investigate locations.",
            R.drawable.intelligence128,
            StatusUpdateType.INTELLIGENCE,
        ) { Merchant.intelligence().addMaxAmount(1)}
    )


    private var skillManager = skillManagers[ENERGY]
    fun skillManager() = skillManager

    fun changeSkillManager(skillIndex: Int) {

        skillManager = skillManagers[skillIndex]
    }
}