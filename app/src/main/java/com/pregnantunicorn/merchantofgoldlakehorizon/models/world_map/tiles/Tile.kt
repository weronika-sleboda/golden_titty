package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity

abstract class Tile(
    private val iconIsVisible: Boolean = false,
)
{
    fun iconIsVisible() = iconIsVisible
    abstract fun icon(): Int
    abstract fun background(): Int
    abstract fun onClick(activity: FragmentActivity)
}