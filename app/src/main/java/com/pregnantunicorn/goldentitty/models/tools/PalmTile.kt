package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory

data class PalmTile(
    val background: () -> Int = { BackgroundFactory().boomerangTile() },
    val boomerangIcon: Int = R.drawable.energy32,
    val boomerangIsVisible: Boolean = false,
    val targetIcon: Int = R.drawable.energy32,
    val targetIsVisible: Boolean = false
)
