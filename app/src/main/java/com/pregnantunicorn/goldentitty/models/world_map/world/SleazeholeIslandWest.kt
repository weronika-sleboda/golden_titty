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

            it[8] = ExcavationTile()


            it[4] = ConstructionTile(
                Buildings.building(BuildingType.CAMP_FIRE),
                CurrentEntrance.CAMP_FIRE
            )

            if(!CurrentNpc.jin().hasHouse()) {

                it[5] = NpcTile(R.drawable.jin64, CurrentNpc.JIN)
            }

            else { it[5] = EmptyTile { BackgroundFactory().beach() } }

            if(!CurrentNpc.saphonee().hasHouse()) {

                it[6] = NpcTile(R.drawable.saphonee64, CurrentNpc.SAPHONEE)
            }

            else { it[6] = EmptyTile { BackgroundFactory().beach() } }

            it[7] = SecretGateTile(
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


            it[12] = CampFireTile()
            it[13] = FishingSpotTile()
            it[14] = BattlefieldTile()
            it[15] = EmptyTile { BackgroundFactory().water()}
        }
)