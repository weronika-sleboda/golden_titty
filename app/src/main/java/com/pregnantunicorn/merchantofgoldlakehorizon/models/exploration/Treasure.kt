package com.pregnantunicorn.merchantofgoldlakehorizon.models.exploration

data class Treasure(
    val name: String,
    val icon: Int,
    val message: String,
    val acquire: () -> Unit
)
