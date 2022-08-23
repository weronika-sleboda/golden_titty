package com.pregnantunicorn.goldentitty.models.world_map.world

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.construction.BuildingType
import com.pregnantunicorn.goldentitty.models.construction.Buildings
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.entrances.CurrentEntrance
import com.pregnantunicorn.goldentitty.models.npcs.CurrentNpc
import com.pregnantunicorn.goldentitty.models.world_map.tiles.*

class SleazeholeIslandWest : Location(
    "Sleazehole Island", Array(16) { EmptyTile { BackgroundFactory().beach() } as Tile }

        .also {


            it[0] = CoconutPalm()

            it[1] = EntranceTile(
                CurrentEntrance.TENT,
                {IconFactory().tent64()},
                {BackgroundFactory().beach()}
            )

            it[2] = EntranceTile(
                CurrentEntrance.CAVE,
                { IconFactory().cave64() },
                {BackgroundFactory().beach() }
            )

            it[3] = WoodPalmTile()


            it[4] = ConstructionTile(
                Buildings.building(BuildingType.CAMP_FIRE),
                CurrentEntrance.CAMP_FIRE
            )

            it[5] = NpcTile(R.drawable.jin64, CurrentNpc.JIN)

            it[7] = LocationTile(
                LocationName.SLEAZEHOLE_ISLAND_EAST
            ) { BackgroundFactory().beach() }

            it[9] = ConstructionTile(
                Buildings.building(BuildingType.WORKSHOP),
                CurrentEntrance.WORKSHOP
            )

            it[10] = ConstructionTile(
                Buildings.building(BuildingType.CAFETERIA),
                CurrentEntrance.CAFETERIA
            )

            it[12] = EmptyTile { BackgroundFactory().water()}
            it[13] = EmptyTile { BackgroundFactory().water()}
            it[14] = EmptyTile { BackgroundFactory().water()}
            it[15] = EmptyTile { BackgroundFactory().water()}
        }
)