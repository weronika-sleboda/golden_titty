package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.BoomerangPlaceName
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.inn.CurrentInnDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class Greeneria : Location(
    "Greeneria District", Array(12) { EmptyTile { BackgroundFactory().grass() } as Tile }

        .also {


            it[0] = PalmTile(BoomerangPlaceName.DATE_PALM)
            it[1] = PalmTile(BoomerangPlaceName.COCONUT_PALM)
            it[2] = PalmTile(BoomerangPlaceName.PEACH_PALM)

            it[4] = InnTile({IconFactory().tent64()},CurrentInnDoor.TENT)
            it[5] = ActionTile()
            it[7] = ChestTile()
            it[6] = InvestigationBuildingTile()

            it[8] = CarriageTile()

            it[10] = UniversityTile()
        }
)