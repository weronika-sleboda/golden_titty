package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory

data class ToolTile(
    val background: () -> Int = { BackgroundFactory().boomerangTile() },
    val hitIcon: Int = IconFactory().energy32(),
    val hitIconIsVisible: Boolean = false,
    val targetIcon: Int = IconFactory().energy32(),
    val targetIsVisible: Boolean = false
)
