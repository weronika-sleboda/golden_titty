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
    private val stone: Int
)
{
    private var isBuild = false
    fun isBuild() = isBuild

    fun woodToString() = "$wood"
    fun stoneToString() = "$stone"

    fun build(): Boolean {

        if(Player.wood().hasAmount(wood) && Player.stone().hasAmount(stone)) {

            Player.wood().loseAmount(wood)
            Player.stone().loseAmount(stone)
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