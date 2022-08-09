package com.pregnantunicorn.merchantofgoldlakehorizon.models.cave

import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

object Supplier  {

    private var tiles = Array(8) { CaveTile() }

    fun tiles() = tiles

    fun tileState(position: Int) = tiles[position]

    fun renew() {

        tiles = Array(8) { CaveTile() }
    }
}
