package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

object CurrentMap {

    private val city = Map("Goldlake", Array(36) {

        EmptyGrassTile() as Tile }.also {

            it[0] = TradingHouseTile()
            it[1] = LibraryTile()
            it[2] = UniversityTile()
            it[3] = ClothingShop1Tile()
            it[8] = ClothingShop2Tile()
            it[9] = ColumnTile()
            it[10] = TheatreTile()
            it[11] = ArenaTile()
            it[12] = EmptyBeachTile()
            it[13] = EmptyWaterTile()
            it[14] = BoatTile()
            it[15] = EmptyBeachTile()
            it[16] = EmptyBeachTile()
            it[17] = CampFireTile()
            it[18] = TentTile()
            it[19] = EmptyBeachTile()
            it[24] = SonnyHouseTile()
            it[25] = DivineTempleTile()
            it[26] = CaveTile()
            it[31] = EmptyVolcanoTile()
            it[32] = EmptyVolcanoTile()
            it[33] = EmptyVolcanoTile()
            it[34] = VolcanoTile()
            it[35] = HereticTempleTile()

        }
    )

    private var worldMap = city

    fun worldMap() = worldMap

}