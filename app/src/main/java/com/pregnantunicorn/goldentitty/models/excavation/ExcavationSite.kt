package com.pregnantunicorn.goldentitty.models.excavation

import com.pregnantunicorn.goldentitty.models.world_map.world.CurrentLocation
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName
import kotlin.random.Random

class ExcavationSite(
    val keyItemName: String,
    val keyItemIcon: Int,
    val name: String,
    private val exitToLocation: LocationName,
    val addKeyAlgorithm: () -> Unit,
)
{

    private val range = 24
    private val excavation = Array(range) { ExcavationTile() }
    fun excavation() = excavation

    private val keyPosition = Random.nextInt(range)
    fun keyPosition() = keyPosition

    private var hasBeenExcavated = false
    fun hasBeenExcavated() = hasBeenExcavated

    fun completeExcavation() {

        hasBeenExcavated = true
    }

    fun leave() {

        CurrentLocation.changeLocation(exitToLocation)
    }
}