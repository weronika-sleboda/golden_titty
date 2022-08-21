package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory

data class PalmTile(
    val background: () -> Int = { BackgroundFactory().boomerangTile() },
    val boomerangIcon: Int = R.drawable.accuracy32,
    val boomerangIsVisible: Boolean = false,
    val targetIcon: Int = R.drawable.accuracy32,
    val targetIsVisible: Boolean = false
)
