package com.pregnantunicorn.goldentitty.models.world_map.world

import com.pregnantunicorn.goldentitty.models.construction.BuildingType
import com.pregnantunicorn.goldentitty.models.construction.Buildings
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

            it[0] = ConstructionTile(
                Buildings.building(BuildingType.EXCAVATION_SITE_NR2),
                CurrentEntrance.EXCAVATION_SITE_NR2
            )

            it[1] = ConstructionTile(
                Buildings.building(BuildingType.EXCAVATION_SITE_NR3),
                CurrentEntrance.EXCAVATION_SITE_NR3
            )

            it[2] = ConstructionTile(
                Buildings.building(BuildingType.EXCAVATION_SITE_NR4),
                CurrentEntrance.EXCAVATION_SITE_NR4
            )

            it[3] = ConstructionTile(
                Buildings.building(BuildingType.EXCAVATION_SITE_NR5),
                CurrentEntrance.EXCAVATION_SITE_NR5
            )

            it[4] = EntranceTile(
                CurrentEntrance.EASTERN_GATE,
                { IconFactory().secretGate64() },
                {BackgroundFactory().beach() }
            )

            it[8] = ConstructionTile(
                Buildings.building(BuildingType.EXCAVATION_SITE_NR6),
                CurrentEntrance.EXCAVATION_SITE_NR6
            )

            it[9] = ConstructionTile(
                Buildings.building(BuildingType.EXCAVATION_SITE_NR7),
                CurrentEntrance.EXCAVATION_SITE_NR7
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