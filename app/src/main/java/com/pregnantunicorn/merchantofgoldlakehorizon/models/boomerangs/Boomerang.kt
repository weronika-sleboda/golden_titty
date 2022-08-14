package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

class Boomerang(
    val name: String,
    val icon: Int,
    val requiredAccuracyToString: String,
    val requiredAccuracy: Int,
    val speedInfo: String,
    val styleInfo: String,
    val hitInfo: String,
    val powerInfo: String,
    val speed: () -> Long,
    val hitAmount: () -> Int,
    val power: () -> Int,
    val boomerangStyle: () -> BoomerangStyle,
    private var owns: Boolean = false
)
{

    fun owns() = owns

    fun addToBackpack()  {

        owns = true
    }
}