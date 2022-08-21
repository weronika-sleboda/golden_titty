package com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle

class IconFactory {

    fun boomerang64() = R.drawable.boomerang64
    fun axe64() = R.drawable.axe64
    fun hammer64() = R.drawable.hammer64

    fun woodPalm64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.wood_palm64_morning }
            DayCycle.SUNSET -> { R.drawable.wood_palm64_sunset }
            DayCycle.NIGHT -> { R.drawable.wood_palm64_night }
        }
    }

    fun woodPalm128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.wood_palm128_morning }
            DayCycle.SUNSET -> { R.drawable.wood_palm128_sunset }
            DayCycle.NIGHT -> { R.drawable.wood_palm128_night }
        }
    }

    fun hut64Nr1(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.hut1_morning64 }
            DayCycle.SUNSET -> { R.drawable.hut1_sunset64 }
            DayCycle.NIGHT -> { R.drawable.hut1_night64 }
        }
    }

    fun hut128Nr1(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.hut1_morning128 }
            DayCycle.SUNSET -> { R.drawable.hut1_sunset128 }
            DayCycle.NIGHT -> { R.drawable.hut1_night128 }
        }
    }

    fun hut64Nr2(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.hut2_morning64 }
            DayCycle.SUNSET -> { R.drawable.hut2_sunset64 }
            DayCycle.NIGHT -> { R.drawable.hut2_night64 }
        }
    }

    fun hut128Nr2(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.hut2_morning128 }
            DayCycle.SUNSET -> { R.drawable.hut2_sunset128 }
            DayCycle.NIGHT -> { R.drawable.hut2_night128 }
        }
    }

    fun templeDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.temple_door128_morning}
            DayCycle.SUNSET -> { R.drawable.temple_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.temple_door128_night }
        }
    }

    fun temple64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.ruins128_morning}
            DayCycle.SUNSET -> { R.drawable.ruins128_sunset }
            DayCycle.NIGHT -> { R.drawable.ruins128_night }
        }
    }

    fun palace64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.palace64_morning }
            DayCycle.SUNSET -> { R.drawable.palace64_sunset }
            DayCycle.NIGHT -> { R.drawable.palace64_night }
        }
    }

    fun statue64(): Int {

        return when (CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> {
                R.drawable.statue64_morning
            }
            DayCycle.SUNSET -> {
                R.drawable.statue64_sunset
            }
            DayCycle.NIGHT -> {
                R.drawable.statue64_night
            }
        }
    }

    fun bigBungalow64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.big_bungalow64_morning }
            DayCycle.SUNSET -> { R.drawable.big_bungalow64_sunset }
            DayCycle.NIGHT -> { R.drawable.big_bungalow64_night }
        }
    }

    fun bungalow64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.bungalow64_morning }
            DayCycle.SUNSET -> { R.drawable.bungalow64_sunset }
            DayCycle.NIGHT -> { R.drawable.bungalow64_night }
        }
    }

    fun saintFluffyGrave128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.saint_fluffy_grave128_morning }
            DayCycle.SUNSET -> { R.drawable.saint_fluffy_grave128_sunset }
            DayCycle.NIGHT -> { R.drawable.saint_fluffy_grave128_night }
        }
    }

    fun cave64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.cave64_morning }
            DayCycle.SUNSET -> { R.drawable.cave64_sunset }
            DayCycle.NIGHT -> { R.drawable.cave64_night }
        }
    }

    fun bigHut64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.big_hut64_morning }
            DayCycle.SUNSET -> { R.drawable.big_hut64_sunset }
            DayCycle.NIGHT -> { R.drawable.big_hut64_night }
        }
    }

    fun hut64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.hut64_morning }
            DayCycle.SUNSET -> { R.drawable.hut64_sunset }
            DayCycle.NIGHT -> { R.drawable.hut64_night }
        }
    }

    fun datePalm64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.date_palm64_morning }
            DayCycle.SUNSET -> { R.drawable.date_palm64_sunset }
            DayCycle.NIGHT -> { R.drawable.date_palm64_night }
        }
    }

    fun coconutPalm64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.coconut_palm64_morning }
            DayCycle.SUNSET -> { R.drawable.coconut_palm64_sunset}
            DayCycle.NIGHT -> { R.drawable.coconut_palm64_night}
        }
    }

    fun peachPalm64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.peach_palm64_morning }
            DayCycle.SUNSET -> { R.drawable.peach_palm64_sunset }
            DayCycle.NIGHT -> { R.drawable.peach_palm64_night }
        }
    }

    fun ironChest64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.iron_chest64_morning }
            DayCycle.SUNSET -> { R.drawable.iron_chest64_sunset }
            DayCycle.NIGHT -> { R.drawable.iron_chest64_night }
        }
    }

    fun ironChest128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.iron_chest128_morning }
            DayCycle.SUNSET -> { R.drawable.iron_chest128_sunset }
            DayCycle.NIGHT -> { R.drawable.iron_chest128_night }
        }
    }

    fun curtains64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.curtains64_morning }
            DayCycle.SUNSET -> { R.drawable.curtains64_sunset }
            DayCycle.NIGHT -> { R.drawable.curtains64_night }
        }
    }

    fun curtains128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.curtains128_morning }
            DayCycle.SUNSET -> { R.drawable.curtains128_sunset }
            DayCycle.NIGHT -> { R.drawable.curtains128_night }
        }
    }

    fun sleepingBag128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.sleeping_bag128_morning }
            DayCycle.SUNSET -> { R.drawable.sleeping_bag128_sunset }
            DayCycle.NIGHT -> { R.drawable.sleeping_bag128_night }
        }
    }

    fun sleepingBag64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.sleeping_bag64_morning }
            DayCycle.SUNSET -> { R.drawable.sleeping_bag64_sunset }
            DayCycle.NIGHT -> { R.drawable.sleeping_bag64_night }
        }
    }

    fun palmTree64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.palm_tree64_morning }
            DayCycle.SUNSET -> { R.drawable.palm_tree64_sunset }
            DayCycle.NIGHT -> { R.drawable.palm_tree64_night }
        }
    }

    fun palmTree128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.palm_tree128_morning }
            DayCycle.SUNSET -> { R.drawable.palm_tree128_sunset }
            DayCycle.NIGHT -> { R.drawable.palm_tree128_night }
        }
    }

    fun roadSign64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.road_sign64_morning }
            DayCycle.SUNSET -> { R.drawable.road_sign64_sunset}
            DayCycle.NIGHT -> { R.drawable.road_sign64_night}
        }
    }

    fun harp128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.harp128_morning }
            DayCycle.SUNSET -> { R.drawable.harp128_sunset }
            DayCycle.NIGHT -> { R.drawable.harp128_night }
        }
    }

    fun harp64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.harp64_morning }
            DayCycle.SUNSET -> { R.drawable.harp64_sunset }
            DayCycle.NIGHT -> { R.drawable.harp64_night }
        }
    }

    fun houseDoor64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.npc_house_door64_morning}
            DayCycle.SUNSET -> { R.drawable.npc_house_door64_sunset}
            DayCycle.NIGHT -> { R.drawable.npc_house_door64_night}
        }
    }

    fun chest64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.chest64_morning}
            DayCycle.SUNSET -> { R.drawable.chest64_sunset}
            DayCycle.NIGHT -> { R.drawable.chest64_night}
        }
    }

    fun chest128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.chest128_morning}
            DayCycle.SUNSET -> { R.drawable.chest128_sunset}
            DayCycle.NIGHT -> { R.drawable.chest128_night}
        }
    }

    fun npcHouse64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.npc_house64_morning}
            DayCycle.SUNSET -> { R.drawable.npc_house64_sunset}
            DayCycle.NIGHT -> { R.drawable.npc_house64_night}
        }
    }

    fun column256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.column256_morning}
            DayCycle.SUNSET -> { R.drawable.column256_sunset}
            DayCycle.NIGHT -> { R.drawable.column256_night}
        }
    }

    fun campFire256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.camp_fire256_morning}
            DayCycle.SUNSET -> { R.drawable.camp_fire256_sunset}
            DayCycle.NIGHT -> { R.drawable.camp_fire256_night}
        }
    }

    fun cave128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.cave128_morning }
            DayCycle.SUNSET -> { R.drawable.cave128_sunset }
            DayCycle.NIGHT -> { R.drawable.cave128_night }
        }
    }

    fun houseDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.wooden_door128_morning }
            DayCycle.SUNSET -> { R.drawable.wooden_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.wooden_door128_night }
        }
    }

    fun tent64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.tent64_morning }
            DayCycle.SUNSET -> { R.drawable.tent64_sunset }
            DayCycle.NIGHT -> { R.drawable.tent64_night }
        }
    }

    fun tent128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.tent128_morning }
            DayCycle.SUNSET -> { R.drawable.tent128_sunset }
            DayCycle.NIGHT -> { R.drawable.tent128_night }
        }
    }

    fun campFire64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.camp_fire64_morning }
            DayCycle.SUNSET -> { R.drawable.camp_fire64_sunset }
            DayCycle.NIGHT -> { R.drawable.camp_fire64_night }
        }
    }

    fun campFire128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.camp_fire128_morning }
            DayCycle.SUNSET -> { R.drawable.camp_fire128_sunset }
            DayCycle.NIGHT -> { R.drawable.camp_fire128_night }
        }
    }

    fun column64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.column64_morning }
            DayCycle.SUNSET -> { R.drawable.column64_sunset }
            DayCycle.NIGHT -> { R.drawable.column64_night }
        }
    }

    fun column128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.column128_morning }
            DayCycle.SUNSET -> { R.drawable.column128_sunset }
            DayCycle.NIGHT -> { R.drawable.column128_night }
        }
    }

    fun meteorsHouse64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.wooden_house64_morning }
            DayCycle.SUNSET -> { R.drawable.wooden_house64_sunset }
            DayCycle.NIGHT -> { R.drawable.wooden_house64_night }
        }
    }

    fun aaliyah256(): Int = R.drawable.aaliyah256
    fun aaliyah128(): Int = R.drawable.aalliyah128

    fun nikita256(): Int = R.drawable.nikita256
    fun nikita128(): Int = R.drawable.nikita128

    fun brianna256(): Int = R.drawable.brianna256
    fun brianna128(): Int = R.drawable.brianna128

    fun daniel256(): Int = R.drawable.daniel256
    fun daniel128(): Int = R.drawable.daniel128
    fun malik256(): Int = R.drawable.malik256
    fun malik128(): Int = R.drawable.malik128

    fun maxim256(): Int = R.drawable.maxim256
    fun maxim128(): Int = R.drawable.maxim128

    fun serenity256(): Int = R.drawable.serenity256
    fun serenity128(): Int = R.drawable.serenity128
}