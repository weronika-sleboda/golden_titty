package com.pregnantunicorn.goldentitty.models.world_map.world

import com.pregnantunicorn.goldentitty.models.construction.BuildingType
import com.pregnantunicorn.goldentitty.models.construction.Buildings
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.entrances.CurrentEntrance
import com.pregnantunicorn.goldentitty.models.npcs.CurrentNpc
import com.pregnantunicorn.goldentitty.models.world_map.tiles.*

class TickyTackaWest : Location(
    "Ticky Tacka Island", Array(16) { EmptyTile { BackgroundFactory().beach() } as Tile }

        .also {


            it[0] = EntranceTile(
                CurrentEntrance.COCONUT_PALM,
                {IconFactory().coconutPalm64() },
                {BackgroundFactory().grass()}
            )

            it[1] = EntranceTile(
                CurrentEntrance.TENT,
                {IconFactory().tent64() },
                {BackgroundFactory().grass()}
            )

            it[2] = EntranceTile(
                CurrentEntrance.CAVE,
                { IconFactory().cave64() },
                {BackgroundFactory().grass() }
            )

            it[3] = EntranceTile(
                CurrentEntrance.WOOD_PALM,
                { IconFactory().woodPalm64() },
                {BackgroundFactory().grass() }
            )

            it[4] = ConstructionTile(
                Buildings.building(BuildingType.CAMP_FIRE),
                CurrentEntrance.CAMP_FIRE
            )

            if(!CurrentNpc.jin().hasHouse()) {

                it[5] = NpcTile(IconFactory().jin64(), CurrentNpc.JIN)
            }

            else { it[5] = EmptyTile { BackgroundFactory().beach() } }

            if(!CurrentNpc.saphonee().hasHouse()) {

                it[6] = NpcTile(IconFactory().saphonee64(), CurrentNpc.SAPHONEE)
            }

            else { it[6] = EmptyTile { BackgroundFactory().beach() } }

            it[8] = ConstructionTile(
                Buildings.building(BuildingType.JINS_HUT),
                CurrentEntrance.JINS_HUT
            ) { BackgroundFactory().grass() }

            it[9] = ConstructionTile(
                Buildings.building(BuildingType.SAPHONEES_HUT),
                CurrentEntrance.SAPHONEES_HUT
            ) { BackgroundFactory().grass() }

            it[10] = ConstructionTile(
                Buildings.building(BuildingType.WORKSHOP),
                CurrentEntrance.WORKSHOP
            ) { BackgroundFactory().grass() }

            it[7] = ConstructionTile(
                Buildings.building(BuildingType.EXCAVATION_SITE_NR1),
                CurrentEntrance.EXCAVATION_SITE_NR1
            ) { BackgroundFactory().beach() }

            it[11] = EntranceTile(
                CurrentEntrance.WESTERN_GATE,
                { IconFactory().secretGate64() },
                {BackgroundFactory().grass() }
            )

            it[12] = EmptyTile { BackgroundFactory().water() }

            it[13] = ConstructionTile(
                Buildings.building(BuildingType.PIER),
                CurrentEntrance.PIER
            ) { BackgroundFactory().water() }

            it[14] = EmptyTile { BackgroundFactory().water()}
            it[15] = EmptyTile { BackgroundFactory().water()}
        }
)