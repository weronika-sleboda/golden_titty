package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.doors.CurrentDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class PearlCoastBeach : Location(
    "Pearl Coast Beach", Array(16) { EmptyWaterTile() as Tile }.also {

        it[0] = EmptyBeachTile()
        it[1] = EmptyBeachTile()
        it[2] = BeachParasolTile(CurrentInvestigation.UPPER_BEACH_PARASOL)
        it[5] = EmptyBeachTile()
        it[6] = EmptyBeachTile()
        it[8] = EmptyBeachTile()
        it[9] = BeachParasolTile(CurrentInvestigation.LOWER_BEACH_PARASOL)

        it[4] = PearlCoastExitTile(
            { IconFactory().roadSign64() },
            { BackgroundFactory().beach() }
        )

        it[7] = when(CurrentDayCycle.dayCycle()) {

            DayCycle.NIGHT -> BuildingTile(
                doorIndex = CurrentDoor.BOAT,
                icon = {IconFactory().boat64()},
                background = { BackgroundFactory().water()}
            )

            else -> { EmptyWaterTile() }
        }
    }
)