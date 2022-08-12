package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.BoomerangPlaceName
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances.CurrentEntrance
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class Greeneria : Location(
    "Greeneria District", Array(12) { EmptyTile { BackgroundFactory().grass() } as Tile }

        .also {


            it[0] = PalmTile(BoomerangPlaceName.DATE_PALM)
            it[1] = PalmTile(BoomerangPlaceName.COCONUT_PALM)
            it[2] = PalmTile(BoomerangPlaceName.PEACH_PALM)

            it[3] = EntranceTile(CurrentEntrance.TENT,
                { IconFactory().tent64() },
                { BackgroundFactory().grass() }
            )

            it[4] = EntranceTile(CurrentEntrance.TEMPLE_OF_LAST_DAY_ATTENTION_SEEKING,
                { IconFactory().pearlTittyTemple64() },
                { BackgroundFactory().grass() }
            )

            it[5] = EntranceTile(CurrentEntrance.TEMPLE_OF_TITTIES_AND_LEGS,
                { IconFactory().pearlTittyTemple64() },
                { BackgroundFactory().grass() }
            )

            it[6] = EntranceTile(CurrentEntrance.TEMPLE_OF_MOST_TRUE_TRUTH,
                { IconFactory().pearlTittyTemple64() },
                { BackgroundFactory().grass() }
            )

            it[7] = EntranceTile(CurrentEntrance.TEMPLE_OF_GRAND_BOOTY,
                { IconFactory().pearlTittyTemple64() },
                { BackgroundFactory().grass() }
            )

            it[8] = EntranceTile(CurrentEntrance.TEMPLE_OF_MONOTITTEISM,
                { IconFactory().pearlTittyTemple64() },
                { BackgroundFactory().grass() }
            )

            it[9] = CarriageTile()

            it[11] = UniversityTile()

            it[10] = EntranceTile(CurrentEntrance.TEMPLE_OF_LATTER_DAY_VAGINA_RAPTURE,
                { IconFactory().pearlTittyTemple64() },
                { BackgroundFactory().grass() }
            )
        }
)