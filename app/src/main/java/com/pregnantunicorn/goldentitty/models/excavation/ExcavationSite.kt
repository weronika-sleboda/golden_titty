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
    private var excavation = Array(range) { ExcavationTile() }
    fun excavation() = excavation

    private var keyPosition = Random.nextInt(range)
    fun keyPosition() = keyPosition

    private var hasBeenExcavated = false
    fun hasBeenExcavated() = hasBeenExcavated

    fun completeExcavation() {

        hasBeenExcavated = true
    }

    fun leave() {

        CurrentLocation.changeLocation(exitToLocation)
    }

    fun reset() {

        hasBeenExcavated = false
        keyPosition = Random.nextInt(range)
        excavation = Array(range) { ExcavationTile() }
    }

    fun load(
        hasBeenExcavated: Boolean,
        keyPosition: Int,
        excavation: Array<ExcavationTile>
    )
    {

        this.hasBeenExcavated = hasBeenExcavated
        this.keyPosition = keyPosition
        this.excavation = excavation
    }

}