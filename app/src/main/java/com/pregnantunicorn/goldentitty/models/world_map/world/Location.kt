package com.pregnantunicorn.goldentitty.models.world_map.world
import com.pregnantunicorn.goldentitty.models.world_map.tiles.Tile

open class Location(
    val name: String,
    val map: Array<Tile>
)