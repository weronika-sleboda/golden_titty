package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.BoomerangPlaceName
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances.CurrentEntrance
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.BoomerangShopFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.PearlTittyFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.SleepingBagFragment

class Greeneria : Location(
    "Greeneria District", Array(12) { EmptyTile { BackgroundFactory().grass() } as Tile }

        .also {


            it[0] = PalmTile(BoomerangPlaceName.DATE_PALM)
            it[1] = PalmTile(BoomerangPlaceName.COCONUT_PALM)
            it[2] = PalmTile(BoomerangPlaceName.PEACH_PALM)
            it[3] = PearlTittyTile()
            it[4] = BedTile()
            it[5] = BoomerangShopTile()
        }
)