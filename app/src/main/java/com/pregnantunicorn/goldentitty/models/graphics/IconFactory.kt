package com.pregnantunicorn.goldentitty.models.graphics

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.goldentitty.models.day_cycle.DayCycle

class IconFactory {

    fun chidinmaStatue256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.chidinmas_statue256_morning }
            DayCycle.SUNSET -> { R.drawable.chidinmas_statue256_sunset }
            DayCycle.NIGHT -> { R.drawable.chidinmas_statue256_night }
        }
    }

    fun chidinmaStatue64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.chidinmas_statue64_morning }
            DayCycle.SUNSET -> { R.drawable.chidinmas_statue64_sunset }
            DayCycle.NIGHT -> { R.drawable.chidinma_statue64_night }
        }
    }


    fun chidinmaStatue128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.chidinmas_statue128_morning }
            DayCycle.SUNSET -> { R.drawable.chidinmas_statue128_sunset }
            DayCycle.NIGHT -> { R.drawable.chidinmas_statue128_night }
        }
    }

    fun ladder128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.ladder128_morning }
            DayCycle.SUNSET -> { R.drawable.ladder128_sunset }
            DayCycle.NIGHT -> { R.drawable.ladder128_night }
        }
    }

    fun coconutPalm64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.coconut_palm64_morning }
            DayCycle.SUNSET -> { R.drawable.coconut_palm64_sunset }
            DayCycle.NIGHT -> { R.drawable.coconut_palm64_night }
        }
    }

    fun coconutPalm128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.coconut_palm128_morning }
            DayCycle.SUNSET -> { R.drawable.coconut_palm128_sunset }
            DayCycle.NIGHT -> { R.drawable.coconut_palm128_night }
        }
    }

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

    fun secretGate256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.secret_gate256_morning}
            DayCycle.SUNSET -> { R.drawable.secret_gate256_sunset }
            DayCycle.NIGHT -> { R.drawable.secret_gate128_night }
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

    fun excavationSite256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.excavation_site256_morning }
            DayCycle.SUNSET -> { R.drawable.excavation_site256_sunset }
            DayCycle.NIGHT -> { R.drawable.excavation_site256_night }
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

    fun jinsHut256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.jins_hut256_morning }
            DayCycle.SUNSET -> { R.drawable.jins_hut256_sunset }
            DayCycle.NIGHT -> { R.drawable.jins_hut256_night }
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

    fun saphoneesHut256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.saphonees_hut256_morning }
            DayCycle.SUNSET -> { R.drawable.saphonees_hut256_sunset }
            DayCycle.NIGHT -> { R.drawable.saphonees_hut256_night }
        }
    }


    fun pier64(): Int {

        return when (CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.pier64_morning }
            DayCycle.SUNSET -> { R.drawable.pier64_sunset }
            DayCycle.NIGHT -> { R.drawable.pier64_night }
        }
    }

    fun pier128(): Int {

        return when (CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.pier128_morning }
            DayCycle.SUNSET -> { R.drawable.pier128_sunset }
            DayCycle.NIGHT -> { R.drawable.pier128_night }
        }
    }

    fun pier256(): Int {

        return when (CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.pier256_morning }
            DayCycle.SUNSET -> { R.drawable.pier256_sunset }
            DayCycle.NIGHT -> { R.drawable.pier256_night }
        }
    }

    fun energy32() = R.drawable.energy32
    fun energy64() = R.drawable.energy64
    fun health32() = R.drawable.health32
    fun health64() = R.drawable.health64
    fun wood64() = R.drawable.wood64
    fun wood32() = R.drawable.wood32
    fun iron32() = R.drawable.iron32
    fun iron64() = R.drawable.iron64
    fun fish32() = R.drawable.fish32
    fun fish64() = R.drawable.fish64
    fun coconut32() = R.drawable.coconut32
    fun coconut64() = R.drawable.coconut64
    fun friedFish64() = R.drawable.fried_fish64
    fun coconutWater64() = R.drawable.coconut_water64

    //*** OTHER

    fun mouth64() = R.drawable.mouth64
    fun fire64() = R.drawable.fire64
    fun info64() = R.drawable.info64
    fun questionMark64() = R.drawable.question_mark64
    fun warning64() = R.drawable.warning64
    fun stars64() = R.drawable.stars64
    fun conqueredFloor64() = R.drawable.conquered_floor64
    fun skull256() = R.drawable.skull256
    fun shamanicNecklace64() = R.drawable.shamanic_necklace64
    fun crystalOfVision64() = R.drawable.crystal_of_vision
    fun staffOfEclipse64() = R.drawable.staff_of_eclipse
    fun emerald64() = R.drawable.emerald64
    fun ruby64() = R.drawable.ruby64
    fun sapphire64() = R.drawable.sapphire64
    fun key64() = R.drawable.key64
    fun target64() = R.drawable.target64
    fun night64() = R.drawable.night64
    fun sunset64() = R.drawable.sunset64
    fun morning64() = R.drawable.morning64
    fun smash128() = R.drawable.smash128
    fun lift128() = R.drawable.lift128
    fun dig128() = R.drawable.dig128
    fun fail64() = R.drawable.fail64
    fun padlock64() = R.drawable.padlock64
    fun emptyHand64() = R.drawable.empty_hand64
    fun hourglass64() = R.drawable.hourglass64

    //*** TOOLS

    fun shovel64() = R.drawable.shovel64
    fun knife64() = R.drawable.knife64
    fun barbarianSpear64() = R.drawable.barbarian_spear64
    fun mercenarySpear64() = R.drawable.mercenary_spear64
    fun kingSpear64() = R.drawable.king_spear64
    fun banditSword64() = R.drawable.bandit_sword64
    fun warriorSword64() = R.drawable.warrior_sword64
    fun assassinSword64() = R.drawable.assassin_sword64
    fun nomadBoomerang64() = R.drawable.nomad_boomerang64
    fun bananaBoomerang64() = R.drawable.banana_boomerang64
    fun shamanBoomerang64() = R.drawable.shaman_boomerang64
    fun cavemanHammer64() = R.drawable.caveman_hammer64
    fun pilgrimHammer64() = R.drawable.pilgrim_hammer64
    fun knockoutHammer64() = R.drawable.knockout_hammer64
    fun chieftainAxe64() = R.drawable.chieftain_axe64
    fun merchantAxe64() = R.drawable.merchant_axe64
    fun dwarfAxe64() = R.drawable.dwarf_axe64

    //*** NPCS

    fun jin64() = R.drawable.jin64
    fun jin128() = R.drawable.jin128
    fun jin256() = R.drawable.jin256
    fun saphonee64() = R.drawable.saphonee64
    fun saphonee128() = R.drawable.saphonee128
    fun saphonee256() = R.drawable.saphonee256
    fun meteor64() = R.drawable.meteor64
    fun meteor128() = R.drawable.meteor128
    fun meteor256() = R.drawable.meteor256
    fun pasha64() = R.drawable.pasha64
    fun pasha128() = R.drawable.pasha128
    fun pasha256() = R.drawable.pasha256
    fun sentino64() = R.drawable.sentino64
    fun sentino128() = R.drawable.sentino128
    fun sentino256() = R.drawable.sentino256
    fun darkRider64() = R.drawable.dark_rider64
    fun darkRider128() = R.drawable.dark_rider128
    fun darkRider256() = R.drawable.dark_rider256

    fun constructionSite64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.construction_site64_morning }
            DayCycle.SUNSET -> { R.drawable.construction_site64_sunset }
            DayCycle.NIGHT -> { R.drawable.construction_site64_night }
        }
    }

    fun workshop64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.workshop64_morning }
            DayCycle.SUNSET -> { R.drawable.workshop64_sunset }
            DayCycle.NIGHT -> { R.drawable.workshop64_night }
        }
    }

    fun workshop128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.workshop128_morning }
            DayCycle.SUNSET -> { R.drawable.workshop128_sunset }
            DayCycle.NIGHT -> { R.drawable.workshop128_night }
        }
    }

    fun workshop256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.workshop256_morning }
            DayCycle.SUNSET -> { R.drawable.workshop256_sunset }
            DayCycle.NIGHT -> { R.drawable.workshop256_night }
        }
    }

    fun templeRuins64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.temple_ruins64_morning}
            DayCycle.SUNSET -> { R.drawable.temple_ruins64_sunset }
            DayCycle.NIGHT -> { R.drawable.temple_ruins64_night }
        }
    }

    fun templeRuins128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.temple_ruins128_morning}
            DayCycle.SUNSET -> { R.drawable.temple_ruins128_sunset }
            DayCycle.NIGHT -> { R.drawable.temple_ruins128_night }
        }
    }

    fun templeRuins256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.temple_ruins256_morning }
            DayCycle.SUNSET -> { R.drawable.temple_ruins256_sunset }
            DayCycle.NIGHT -> { R.drawable.temple_ruins256_night }
        }
    }

    fun cave64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.cave64_morning }
            DayCycle.SUNSET -> { R.drawable.cave64_sunset }
            DayCycle.NIGHT -> { R.drawable.cave64_night }
        }
    }

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

    fun harp128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.harp128_morning }
            DayCycle.SUNSET -> { R.drawable.harp128_sunset }
            DayCycle.NIGHT -> { R.drawable.harp128_night }
        }
    }

    fun woodenDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.wooden_door128_morning }
            DayCycle.SUNSET -> { R.drawable.wooden_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.wooden_door128_night }
        }
    }

    fun cave128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.cave128_morning }
            DayCycle.SUNSET -> { R.drawable.cave128_sunset }
            DayCycle.NIGHT -> { R.drawable.cave128_night }
        }
    }

    fun tent64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.tent64_morning }
            DayCycle.SUNSET -> { R.drawable.tent64_sunset }
            DayCycle.NIGHT -> { R.drawable.tent64_night }
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

    fun campFire256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.camp_fire256_morning}
            DayCycle.SUNSET -> { R.drawable.camp_fire256_sunset}
            DayCycle.NIGHT -> { R.drawable.camp_fire256_night}
        }
    }
}