package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.Tile

open class Location(
    val name: String,
    val map: Array<Tile>
)