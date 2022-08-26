package com.pregnantunicorn.goldentitty.models.construction

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.meteor.Meteor
import com.pregnantunicorn.goldentitty.models.resources.Resources

class Building(
    val name: String,
    val info: String,
    val bigIcon: () -> Int,
    val smallIcon: () -> Int,
    val buildingType: BuildingType,
    private val wood: Int,
    private val iron: Int,
    private val buildAlgorithm: () -> Unit
)
{
    private var isBuild = false
    fun isBuild() = isBuild

    fun woodToString() = "$wood"
    fun ironToString() = "$iron"

    fun build(): Boolean {

        if(Resources.wood().hasAmount(wood) && Resources.iron().hasAmount(iron)) {

            Resources.wood().loseAmount(wood)
            Resources.iron().loseAmount(iron)
            buildAlgorithm.invoke()

            isBuild = true

            CurrentMessage.changeMessage(
                "$name Built",
                smallIcon.invoke(),
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