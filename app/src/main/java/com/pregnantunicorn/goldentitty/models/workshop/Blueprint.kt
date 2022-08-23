package com.pregnantunicorn.goldentitty.models.workshop

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.player.Player
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
    fun stoneToString() = "${tool.requiredStone()}"

    fun make(): Boolean {

        if(Player.wood().hasAmount(tool.requiredWood())
            && Player.stone().hasAmount(tool.requiredStone())) {

            Player.wood().loseAmount(tool.requiredWood())
            Player.stone().loseAmount(tool.requiredStone())
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