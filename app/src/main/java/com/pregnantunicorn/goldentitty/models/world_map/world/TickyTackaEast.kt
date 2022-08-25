package com.pregnantunicorn.goldentitty.models.world_map.world

import com.pregnantunicorn.goldentitty.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.goldentitty.models.day_cycle.DayCycle
import com.pregnantunicorn.goldentitty.models.entrances.CurrentEntrance
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.key_items.CurrentKeyItem
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState
import com.pregnantunicorn.goldentitty.models.world_map.tiles.*

class TickyTackaEast: Location(
    "Ticky Tacka Island", Array(16) { EmptyTile { BackgroundFactory().beach() } as Tile }

        .also {

            it[0] = EntranceTile(
                CurrentEntrance.EXCAVATION_SITE_NR2,
                { IconFactory().excavationSite64() },
                {BackgroundFactory().beach() }
            )

            it[1] = EntranceTile(
                CurrentEntrance.EXCAVATION_SITE_NR3,
                { IconFactory().excavationSite64() },
                {BackgroundFactory().beach() }
            )

            it[2] = EntranceTile(
                CurrentEntrance.EXCAVATION_SITE_NR4,
                { IconFactory().excavationSite64() },
                {BackgroundFactory().beach() }
            )

            it[3] = EntranceTile(
                CurrentEntrance.EXCAVATION_SITE_NR5,
                { IconFactory().excavationSite64() },
                {BackgroundFactory().beach() }
            )

            it[4] = EntranceTile(
                CurrentEntrance.EASTERN_GATE,
                { IconFactory().secretGate64() },
                {BackgroundFactory().beach() }
            )

            it[8] = EntranceTile(
                CurrentEntrance.EXCAVATION_SITE_NR6,
                { IconFactory().excavationSite64() },
                {BackgroundFactory().beach() }
            )

            it[9] = EntranceTile(
                CurrentEntrance.EXCAVATION_SITE_NR7,
                { IconFactory().excavationSite64() },
                {BackgroundFactory().beach() }
            )

            if(CurrentHandState.handState() == HandState.KEY_ITEM &&
                CurrentDayCycle.dayCycle() == DayCycle.NIGHT &&
                CurrentKeyItem.keyItemType() == KeyItemType.STAFF_OF_ECLIPSE) {

                it[10] = EntranceTile(
                    CurrentEntrance.TEMPLE_RUINS,
                    { IconFactory().templeRuins64() },
                    {BackgroundFactory().beach() }
                )
            }

            else {

                it[10] = EmptyTile { BackgroundFactory().beach() }
            }

            if(CurrentHandState.handState() == HandState.KEY_ITEM &&
                CurrentKeyItem.keyItemType() == KeyItemType.CRYSTAL_OF_VISION) {

                it[11] = EntranceTile(
                    CurrentEntrance.CHIDINMAS_STATUE,
                    { IconFactory().chidinmaStatue64() },
                    {BackgroundFactory().beach() }
                )
            }

            else {

                it[11] = EmptyTile { BackgroundFactory().beach() }
            }

            it[12] = EmptyTile { BackgroundFactory().water()}
            it[13] = EmptyTile { BackgroundFactory().water()}
            it[14] = EmptyTile { BackgroundFactory().water()}
            it[15] = EmptyTile { BackgroundFactory().water()}
        }
)