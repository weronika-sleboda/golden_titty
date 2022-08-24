package com.pregnantunicorn.goldentitty.models.construction

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.player.Player

class Building(
    val name: String,
    val info: String,
    val bigIcon: () -> Int,
    val smallIcon: () -> Int,
    val buildingType: BuildingType,
    private val wood: Int,
    private val iron: Int
)
{
    private var isBuild = false
    fun isBuild() = isBuild

    fun woodToString() = "$wood"
    fun ironToString() = "$iron"

    fun build(): Boolean {

        if(Player.wood().hasAmount(wood) && Player.iron().hasAmount(iron)) {

            Player.wood().loseAmount(wood)
            Player.iron().loseAmount(iron)
            Player.storyProgress().increaseProgress()

            isBuild = true

            CurrentMessage.changeMessage(
                "$name Built",
                bigIcon.invoke(),
                "$name has been built."
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