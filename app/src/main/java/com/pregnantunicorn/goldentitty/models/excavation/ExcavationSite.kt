package com.pregnantunicorn.goldentitty.models.excavation

import kotlin.random.Random

class ExcavationSite(
    val name: String,
    val addKeyAlgorithm: () -> Unit
)
{

    private val range = 24
    private val excavation = Array<ExcavationTile>(range) { ExcavationTile() }
    fun excavation() = excavation

    private val keyPosition = Random.nextInt(range)
    fun keyPosition() = keyPosition

    private var hasBeenExcavated = false
    fun hasBeenExcavated() = hasBeenExcavated

    fun completeExcavation() {

        hasBeenExcavated = true
    }
}