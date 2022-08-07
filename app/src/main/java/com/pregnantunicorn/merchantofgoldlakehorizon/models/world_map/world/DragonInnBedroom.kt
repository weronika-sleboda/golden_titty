package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import android.graphics.drawable.Icon
import com.pregnantunicorn.merchantofgoldlakehorizon.models.bed.BedType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class DragonInnBedroom : Location(
    "Dragon Inn (Bedroom)", Array(12) { EmptyTile { BackgroundFactory().woodenFloor() } as Tile }

        .also {

            it[0] = BedTile (
                BedType.TAVERN_BED,
                {IconFactory().tavernBed128() },
                { BackgroundFactory().woodenFloor() }
            )
    }
)