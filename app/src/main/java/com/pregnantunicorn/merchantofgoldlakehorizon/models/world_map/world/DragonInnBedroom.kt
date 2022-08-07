package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import android.graphics.drawable.Icon
import com.pregnantunicorn.merchantofgoldlakehorizon.models.bed.BedType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation.CurrentInvestigation
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class DragonInnBedroom : Location(
    "Dragon Inn (Bedroom)", Array(12) { EmptyTile { BackgroundFactory().woodenFloor() } as Tile }

        .also {

            it[4] = BedTile (
                BedType.TAVERN_BED,
                {IconFactory().tavernBed64() },
                { BackgroundFactory().woodenFloor() }
            )

            it[5] = InvestigationTile(
                CurrentInvestigation.DRAGON_INN_CHEST_MORNING,
                {IconFactory().tavernBed64() },
                { BackgroundFactory().woodenFloor() }
            )

    }
)