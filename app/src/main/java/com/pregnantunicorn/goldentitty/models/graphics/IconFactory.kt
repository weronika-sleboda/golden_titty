package com.pregnantunicorn.goldentitty.models.graphics

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.goldentitty.models.day_cycle.DayCycle

class IconFactory {

    fun templeDoor256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.temple_door256_morning}
            DayCycle.SUNSET -> { R.drawable.temple_door256_sunset }
            DayCycle.NIGHT -> { R.drawable.temple_door256_night }
        }
    }

    fun templeDoor64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.temple_door64_morning}
            DayCycle.SUNSET -> { R.drawable.temple_door64_sunset }
            DayCycle.NIGHT -> { R.drawable.temple_door64_night }
        }
    }

    fun templeDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.temple_door128_morning}
            DayCycle.SUNSET -> { R.drawable.temple_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.temple_door128_night }
        }
    }

    fun secretGate128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.secret_gate128_morning}
            DayCycle.SUNSET -> { R.drawable.secret_gate128_sunset }
            DayCycle.NIGHT -> { R.drawable.secret_gate128_night }
        }
    }

    fun secretGate64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.secret_gate64_morning}
            DayCycle.SUNSET -> { R.drawable.secret_gate64_sunset }
            DayCycle.NIGHT -> { R.drawable.secret_gate64_night }
        }
    }

    fun ladder64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.ladder64_morning }
            DayCycle.SUNSET -> { R.drawable.ladder64_sunset }
            DayCycle.NIGHT -> { R.drawable.ladder64_night }
        }
    }

    fun excavationSite64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.excavation_site64_morning }
            DayCycle.SUNSET -> { R.drawable.excavation_site64_sunset }
            DayCycle.NIGHT -> { R.drawable.excavation_site64_night }
        }
    }

    fun excavationSite128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.excavation_site128_morning }
            DayCycle.SUNSET -> { R.drawable.excavation_site128_sunset }
            DayCycle.NIGHT -> { R.drawable.excavation_site128_night }
        }
    }

    fun meteorsHut64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.meteors_hut64_morning }
            DayCycle.SUNSET -> { R.drawable.meteors_hut64_sunset }
            DayCycle.NIGHT -> { R.drawable.meteors_hut64_night }
        }
    }

    fun meteorsHut128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.meteors_hut128_morning }
            DayCycle.SUNSET -> { R.drawable.meteors_hut128_sunset }
            DayCycle.NIGHT -> { R.drawable.meteors_hut128_night }
        }
    }

    fun jinsHut64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.jins_hut64_morning }
            DayCycle.SUNSET -> { R.drawable.jins_hut64_sunset }
            DayCycle.NIGHT -> { R.drawable.jins_hut64_night }
        }
    }

    fun jinsHut128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.jins_hut128_morning }
            DayCycle.SUNSET -> { R.drawable.jins_hut128_sunset }
            DayCycle.NIGHT -> { R.drawable.jins_hut128_night }
        }
    }

    fun saphoneesHut64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.saphonees_hut64_morning }
            DayCycle.SUNSET -> { R.drawable.saphonees_hut64_sunset }
            DayCycle.NIGHT -> { R.drawable.saphonees_hut64_night }
        }
    }

    fun saphoneesHut128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.saphonees_hut128_morning }
            DayCycle.SUNSET -> { R.drawable.saphonees_hut128_sunset }
            DayCycle.NIGHT -> { R.drawable.saphonees_hut128_night }
        }
    }

    fun pier64(): Int {

        return when (CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> {
                R.drawable.pier64_morning
            }

            DayCycle.SUNSET -> {
                R.drawable.pier64_sunset
            }

            DayCycle.NIGHT -> {
                R.drawable.pier64_night
            }
        }
    }

    fun pier128(): Int {

        return when (CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> {
                R.drawable.pier128_morning
            }

            DayCycle.SUNSET -> {
                R.drawable.pier128_sunset
            }

            DayCycle.NIGHT -> {
                R.drawable.pier128_night
            }
        }
    }

    fun shovel64() = R.drawable.shovel64
    fun knife64() = R.drawable.knife64

    fun barbarianSpear64() = R.drawable.barbarian_spear
    fun mercenarySpear64() = R.drawable.mercenary_spear
    fun kingSpear64() = R.drawable.king_spear

    fun eat64() = R.drawable.eat64

    fun energy32() = R.drawable.energy32
    fun energy64() = R.drawable.energy64
    fun energy128() = R.drawable.energy128

    fun health32() = R.drawable.health32
    fun health64() = R.drawable.health64
    fun health128() = R.drawable.health64

    fun nomadBoomerang64() = R.drawable.nomad_boomerang64
    fun bananaBoomerang64() = R.drawable.banana_boomerang64
    fun shamanBoomerang64() = R.drawable.shaman_boomerang64

    fun cavemanHammer64() = R.drawable.caveman_hammer64
    fun pilgrimHammer64() = R.drawable.pilgrim_hammer64
    fun knockoutHammer64() = R.drawable.knockout_hammer64

    fun chieftainAxe64() = R.drawable.chieftain_axe64
    fun merchantAxe64() = R.drawable.merchant_axe64
    fun dwarfAxe64() = R.drawable.dwarf_axe64

    fun saphonee64() = R.drawable.saphonee64
    fun saphonee128() = R.drawable.saphonee128
    fun saphonee256() = R.drawable.saphonee256

    fun constructionSite64() = R.drawable.construction_site64

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

    fun hut64Nr3(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.hut3_morning64 }
            DayCycle.SUNSET -> { R.drawable.hut3_sunset64 }
            DayCycle.NIGHT -> { R.drawable.hut3_night64 }
        }
    }

    fun hut128Nr3(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.hut3_morning128 }
            DayCycle.SUNSET -> { R.drawable.hut3_sunset128 }
            DayCycle.NIGHT -> { R.drawable.hut3_night128 }
        }
    }

    fun hut64Nr4(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.hut4_morning64 }
            DayCycle.SUNSET -> { R.drawable.hut4_sunset64 }
            DayCycle.NIGHT -> { R.drawable.hut4_night64 }
        }
    }

    fun hut128Nr4(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.hut4_morning128 }
            DayCycle.SUNSET -> { R.drawable.hut4_sunset128 }
            DayCycle.NIGHT -> { R.drawable.hut4_night128 }
        }
    }

    fun hut64Nr5(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.hut5_morning64 }
            DayCycle.SUNSET -> { R.drawable.hut5_sunset64 }
            DayCycle.NIGHT -> { R.drawable.hut5_night64 }
        }
    }

    fun hut128Nr5(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.hut5_morning128 }
            DayCycle.SUNSET -> { R.drawable.hut5_sunset128 }
            DayCycle.NIGHT -> { R.drawable.hut5_night128 }
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

    fun woodPalm64(): Int {

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

    fun maxim256(): Int = R.drawable.maxim256
    fun maxim128(): Int = R.drawable.maxim128

    fun serenity256(): Int = R.drawable.serenity256
    fun serenity128(): Int = R.drawable.serenity128
}