package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit

data class Door(
    val buildingName: String,
    val buildingInfo: String,
    val closingInfo: String,
    val icon: () -> Int,
    val open: () -> Unit
)

