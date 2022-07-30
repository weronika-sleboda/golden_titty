package com.pregnantunicorn.merchantofgoldlakehorizon.models.skill_upgrade

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.StatusUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

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
            { Merchant.energy().maxValueReached()},
            { Merchant.energy().addMaxAmount(1)},
            {
                CurrentMessage.changeMessage(
                    "Max Value Reached",
                    R.drawable.energy64,
                    "Your energy has reached its max value."
                )
            }
        ),

        SkillManager(
            "Max Persuasion",
            "Persuasion allows you to change unfavourable deals.",
            R.drawable.persuasion128,
            StatusUpdateType.PERSUASION,
            { Merchant.persuasion().maxValueReached()},
            { Merchant.persuasion().addMaxAmount(1)},
            {
                CurrentMessage.changeMessage(
                    "Max Value Reached",
                    R.drawable.persuasion64,
                    "Your persuasion has reached its max value."
                )
            }
        ),

        SkillManager(
            "Max Charisma",
            "Charisma allows you to enter buildings through closed doors.",
            R.drawable.charisma128,
            StatusUpdateType.CHARISMA,
            { Merchant.charisma().maxValueReached()},
            { Merchant.charisma().addMaxAmount(1)},
            {
                CurrentMessage.changeMessage(
                    "Max Value Reached",
                    R.drawable.charisma64,
                    "Your charisma has reached its max value."
                )
            }
        ),

        SkillManager(
            "Max Intelligence",
            "Intelligence allows you to investigate locations.",
            R.drawable.intelligence128,
            StatusUpdateType.INTELLIGENCE,
            { Merchant.energy().maxValueReached()},
            { Merchant.energy().addMaxAmount(1)},
            {
                CurrentMessage.changeMessage(
                    "Max Value Reached",
                    R.drawable.intelligence64,
                    "Your intelligence has reached its max value."
                )
            }
        )
    )


    private var skillManager = skillManagers[ENERGY]
    fun skillManager() = skillManager

    fun changeSkillManager(skillIndex: Int) {

        skillManager = skillManagers[skillIndex]
    }
}