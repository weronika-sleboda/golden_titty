package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import android.graphics.drawable.Icon
import com.pregnantunicorn.merchantofgoldlakehorizon.models.bed.BedType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.BoomerangPlaceName
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class Greeneria : Location(
    "Greeneria District", Array(12) { EmptyTile { BackgroundFactory().grass() } as Tile }

        .also {


            it[0] = PalmTile(BoomerangPlaceName.DATE_PALM)
            it[1] = PalmTile(BoomerangPlaceName.COCONUT_PALM)
            it[2] = PalmTile(BoomerangPlaceName.PEACH_PALM)
            it[3] = PearlTittyAltarTile(BoomerangPlaceName.PEARL_TITTY_ALTAR)
            it[8] = CarriageTile()
            it[9] = BedTile()
        }
)