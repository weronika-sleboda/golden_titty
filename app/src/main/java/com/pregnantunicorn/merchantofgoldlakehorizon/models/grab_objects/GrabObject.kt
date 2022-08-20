package com.pregnantunicorn.merchantofgoldlakehorizon.models.grab_objects

data class GrabObject(
    val name: String,
    val icon: Int,
    val info: String,
    val grabAlgorithm: () -> Unit,
)