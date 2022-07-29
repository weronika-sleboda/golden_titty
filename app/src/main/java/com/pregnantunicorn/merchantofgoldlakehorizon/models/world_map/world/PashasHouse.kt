package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class PashasHouse: Location(
    "Pasha's House", Array(12) { EmptyRedTile() as Tile }.also {

        it[8] = BedTile(
            CurrentInvestigation.PASHAS_BED
        ) { BackgroundFactory().redCarpet() }

        it[0] = ClosetTile(
            CurrentInvestigation.PASHAS_CLOSET
        ) { BackgroundFactory().redCarpet() }

        it[2] = CupboardTile(
            CurrentInvestigation.PASHAS_CUPBOARD
        ) { BackgroundFactory().redCarpet() }

        it[3] = TableTile(
            CurrentInvestigation.PASHAS_TABLE
        ) { BackgroundFactory().redCarpet()}

        it[10] = GreeneriaExitTile (
            { IconFactory().houseDoor64() },
            { BackgroundFactory().redCarpet() }
        )
    }
)