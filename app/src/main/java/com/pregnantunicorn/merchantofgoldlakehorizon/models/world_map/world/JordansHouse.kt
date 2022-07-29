package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class JordansHouse: Location(
    "Jordan's House", Array(12) { EmptyPinkTile() as Tile }.also {

        it[2] = BedTile(
            CurrentInvestigation.JORDANS_BED
        ) { BackgroundFactory().pinkCarpet()}

        it[1] = CupboardTile(
            CurrentInvestigation.JORDANS_CUPBOARD
        ) { BackgroundFactory().pinkCarpet() }

        it[0] = ClosetTile(
            CurrentInvestigation.JORDANS_CLOSET
        ) { BackgroundFactory().pinkCarpet() }

        it[3] = TableTile(
            CurrentInvestigation.JORDANS_TABLE
        ) { BackgroundFactory().pinkCarpet() }

        it[10] = GreeneriaExitTile (
            { IconFactory().houseDoor64() },
            { BackgroundFactory().pinkCarpet() }
        )
    }
)