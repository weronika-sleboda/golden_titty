package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

class Door(
    val buildingName: String,
    val buildingInfo: String,
    val doorIcon: Int,
    val doorAlgorithm: () -> Unit
)
