package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.Tile

data class BoomerangTile(
    val background: () -> Int = { BackgroundFactory().boomerangTile() },
    val boomerangIcon: Int = R.drawable.accuracy32,
    val boomerangIsVisible: Boolean = false,
    val targetIcon: Int = R.drawable.accuracy32,
    val targetIsVisible: Boolean = false
)
