package com.pregnantunicorn.merchantofgoldlakehorizon.models.robes

class Robe(
    val name: String,
    val info: String,
    val icon: Int,
    val robeType: RobeType,
    val algorithm: () -> Unit,
    private var owns: Boolean = true
)
{

    fun owns() = owns

    fun add() {

        owns = true
    }

    fun remove() {

        owns  = false
    }
}