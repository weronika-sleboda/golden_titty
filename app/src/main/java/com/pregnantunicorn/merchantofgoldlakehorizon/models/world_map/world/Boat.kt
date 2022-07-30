package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.cave.GemSupplierType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class Boat: Location(
    "Ship Orion", Array(12) { EmptyWoodenTile() as Tile }.also {

        it[10] = PearlCoastBeachExitTile (
            { IconFactory().stairsUp64() },
            { BackgroundFactory().woodenFloor() }
        )
    }
)