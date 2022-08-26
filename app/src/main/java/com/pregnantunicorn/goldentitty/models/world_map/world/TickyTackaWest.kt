package com.pregnantunicorn.goldentitty.models.world_map.world

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.construction.BuildingType
import com.pregnantunicorn.goldentitty.models.construction.Buildings
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.entrances.CurrentEntrance
import com.pregnantunicorn.goldentitty.models.npcs.LadySilvia
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

            if(!LadySilvia.ladySilvia().hasHouse()) {

                it[5] = NpcTile(R.drawable.lady_silvia64)
            }

            else { it[5] = EmptyTile { BackgroundFactory().beach() } }


            it[8] = ConstructionTile(
                Buildings.building(BuildingType.LADY_SILVIAS_HUT),
                CurrentEntrance.LADY_SILVIAS_HUT
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