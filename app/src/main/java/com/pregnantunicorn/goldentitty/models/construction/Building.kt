package com.pregnantunicorn.goldentitty.models.construction

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.resources.Resources
import com.pregnantunicorn.goldentitty.models.story_line.Event
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

class Building(
    val name: String,
    val info: String,
    val bigIcon: () -> Int,
    val smallIcon: () -> Int,
    val buildingType: BuildingType,
    private val wood: Int,
    private val iron: Int,
    val eventTitle: EventTitle,
    val event: Event,
    val locationName: LocationName,
    private val buildAlgorithm: () -> Unit,
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