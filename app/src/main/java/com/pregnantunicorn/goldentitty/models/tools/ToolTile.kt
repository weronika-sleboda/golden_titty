package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory

data class ToolTile(
    val background: () -> Int = { BackgroundFactory().boomerangTile() },
    val hitIcon: Int = R.drawable.energy32,
    val hitIconIsVisible: Boolean = false,
    val targetIcon: Int = R.drawable.energy32,
    val targetIsVisible: Boolean = false
)
