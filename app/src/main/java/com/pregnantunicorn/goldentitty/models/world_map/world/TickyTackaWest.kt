package com.pregnantunicorn.goldentitty.models.world_map.world

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

            it[4] = EntranceTile(
                CurrentEntrance.CAMP_FIRE,
                { IconFactory().campFire64() },
                {BackgroundFactory().beach() }
            )

            if(!CurrentNpc.jin().hasHouse()) {

                it[5] = NpcTile(IconFactory().jin64(), CurrentNpc.JIN)
            }

            else { it[5] = EmptyTile { BackgroundFactory().beach() } }

            if(!CurrentNpc.saphonee().hasHouse()) {

                it[6] = NpcTile(IconFactory().sapphire64(), CurrentNpc.SAPHONEE)
            }

            else { it[6] = EmptyTile { BackgroundFactory().beach() } }

            it[8] = EntranceTile(
                CurrentEntrance.JINS_HUT,
                {IconFactory().jinsHut64()},
                {BackgroundFactory().grass()}
            )

            it[9] = EntranceTile(
                CurrentEntrance.SAPHONEES_HUT,
                {IconFactory().saphoneesHut64() },
                { BackgroundFactory().grass()}
            )

            it[10] = EntranceTile(
                CurrentEntrance.WORKSHOP,
                {IconFactory().workshop64() },
                { BackgroundFactory().grass()}
            )

            it[4] = EntranceTile(
                CurrentEntrance.EXCAVATION_SITE_NR1,
                {IconFactory().excavationSite64()},
                {BackgroundFactory().beach() }
            )

            it[11] = EntranceTile(
                CurrentEntrance.WESTERN_GATE,
                { IconFactory().secretGate64() },
                {BackgroundFactory().grass() }
            )

            it[12] = EmptyTile { BackgroundFactory().water() }

            it[13] = EntranceTile(
                CurrentEntrance.FISHING_SPOT,
                {IconFactory().pier64() },
                {BackgroundFactory().water()}
            )

            it[14] = EmptyTile { BackgroundFactory().water()}
            it[15] = EmptyTile { BackgroundFactory().water()}
        }
)