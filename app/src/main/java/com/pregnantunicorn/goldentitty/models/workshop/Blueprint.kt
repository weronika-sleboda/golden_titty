package com.pregnantunicorn.goldentitty.models.workshop

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.meteor.Meteor
import com.pregnantunicorn.goldentitty.models.resources.Resources
import com.pregnantunicorn.goldentitty.models.tools.Tool

class Blueprint(
    private val tool: Tool,
)
{

    val name = tool.name()
    val icon = tool.icon()
    val type = tool.type()
    val info = tool.info()

    fun woodToString() = "${tool.requiredWood()}"
    fun stoneToString() = "${tool.requiredIron()}"

    fun make(): Boolean {

        if(Resources.wood().hasAmount(tool.requiredWood())
            && Resources.iron().hasAmount(tool.requiredIron())) {

            Resources.wood().loseAmount(tool.requiredWood())
            Resources.iron().loseAmount(tool.requiredIron())
            tool.addToBackpack()

            CurrentMessage.changeMessage(
                "$name Made",
                icon,
                "$name has been made."
            )

            return true
        }

        CurrentMessage.changeMessage(
            "No Resources",
            R.drawable.fail64,
            "You lack resources."
        )

        return false
    }
}