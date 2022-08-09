package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

class Boomerang(
    val name: String,
    val icon: Int,
    val speedInfo: String,
    val styleInfo: String,
    val hitInfo: String,
    val energyInfo: String,
    val speed: Long,
    val hitAmount: Int,
    val energy: Int,
    var boomerangStyleName: BoomerangStyleName,
    private var owns: Boolean = false
)
{

    fun owns() = owns

    fun addToBackpack()  {

        owns = true
    }
}