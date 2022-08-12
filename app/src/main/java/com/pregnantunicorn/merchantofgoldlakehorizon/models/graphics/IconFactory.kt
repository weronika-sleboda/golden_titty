package com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle

class IconFactory {

    fun pearlTittyTemple64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.pearl_titty_temple64_morning }
            DayCycle.SUNSET -> { R.drawable.pearl_titty_temple64_sunset }
            DayCycle.NIGHT -> { R.drawable.pearl_titty_temple64_night }
        }
    }

    fun pearlTittyDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.pearl_titty_door128_morning }
            DayCycle.SUNSET -> { R.drawable.pearl_titty_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.pearl_titty_door128_night }
        }
    }

    fun palmLeaf64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.palme_leaf64_morning }
            DayCycle.SUNSET -> { R.drawable.palm_leaf64_sunset }
            DayCycle.NIGHT -> { R.drawable.palm_leaf64_night }
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

    fun tavernBed64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.bed64_morning }
            DayCycle.SUNSET -> { R.drawable.bed64_sunset }
            DayCycle.NIGHT -> { R.drawable.bed64_night }
        }
    }

    fun tavernBed128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.bed128_morning }
            DayCycle.SUNSET -> { R.drawable.bed128_sunset }
            DayCycle.NIGHT -> { R.drawable.bed128_night }
        }
    }

    fun steeringWheel128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.steering_wheel128_morning }
            DayCycle.SUNSET -> { R.drawable.steering_wheel128_sunset }
            DayCycle.NIGHT -> { R.drawable.steering_wheel128_night }
        }
    }

    fun steeringWheel64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.steering_wheel64_morning }
            DayCycle.SUNSET -> { R.drawable.steering_wheel64_sunset }
            DayCycle.NIGHT -> { R.drawable.steering_wheel64_night }
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

    fun stairsUp128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.stairs_up128_morning }
            DayCycle.SUNSET -> { R.drawable.stairs_up128_sunset }
            DayCycle.NIGHT -> { R.drawable.stairs_up128_night }
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

    fun stairsUp64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.stairs_up64_morning }
            DayCycle.SUNSET -> { R.drawable.stairs_up64_sunset }
            DayCycle.NIGHT -> { R.drawable.stairs_up64_night }
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

    fun beachParasol128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.beach_parasol128_morning }
            DayCycle.SUNSET -> { R.drawable.beach_parasol128_sunset }
            DayCycle.NIGHT -> { R.drawable.beach_parasol128_night }
        }
    }

    fun beachParasol64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.beach_parasol64_morning }
            DayCycle.SUNSET -> { R.drawable.beach_parasol64_sunset }
            DayCycle.NIGHT -> { R.drawable.beach_parasol64_night }
        }
    }

    fun goldenCoin128() = R.drawable.golden_coin128

    fun merchantHall64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.merchant_hall64_morning }
            DayCycle.SUNSET -> { R.drawable.merchant_hall64_sunset }
            DayCycle.NIGHT -> { R.drawable.merchant_hall64_night }
        }
    }

    fun roadSign64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.road_sign64_morning }
            DayCycle.SUNSET -> { R.drawable.road_sign64_sunset}
            DayCycle.NIGHT -> { R.drawable.road_sign64_night}
        }
    }

    fun meteorsAltar128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.meteors_altar128_morning }
            DayCycle.SUNSET -> { R.drawable.meteors_altar128_sunset }
            DayCycle.NIGHT -> { R.drawable.meteors_altar128_night }
        }
    }

    fun meteorsAltar64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.meteors_altar64_morning }
            DayCycle.SUNSET -> { R.drawable.meteors_altar64_sunset }
            DayCycle.NIGHT -> { R.drawable.meteors_altar64_night }
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

    fun desk64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.desk64_morning }
            DayCycle.SUNSET -> { R.drawable.desk64_sunset }
            DayCycle.NIGHT -> { R.drawable.desk64_night }
        }
    }


    fun bed64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.bed64_morning }
            DayCycle.SUNSET -> { R.drawable.bed64_sunset }
            DayCycle.NIGHT -> { R.drawable.bed64_night }
        }
    }

    fun houseDoor64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.npc_house_door64_morning}
            DayCycle.SUNSET -> { R.drawable.npc_house_door64_sunset}
            DayCycle.NIGHT -> { R.drawable.npc_house_door64_night}
        }
    }

    fun bookcase64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.bookcase64_morning}
            DayCycle.SUNSET -> { R.drawable.bookcase64_sunset}
            DayCycle.NIGHT -> { R.drawable.bookcase64_night}
        }
    }

    fun bookcase128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.bookcase128_morning}
            DayCycle.SUNSET -> { R.drawable.bookcase128_sunset}
            DayCycle.NIGHT -> { R.drawable.bookcase128_night}
        }
    }

    fun closet64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.closet64_morning}
            DayCycle.SUNSET -> { R.drawable.closet64_sunset}
            DayCycle.NIGHT -> { R.drawable.closet64_night}
        }
    }

    fun closet128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.closet128_morning}
            DayCycle.SUNSET -> { R.drawable.closet128_sunset}
            DayCycle.NIGHT -> { R.drawable.closet128_night}
        }
    }

    fun cupboard64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.cupboard64_morning}
            DayCycle.SUNSET -> { R.drawable.cupboard64_sunset}
            DayCycle.NIGHT -> { R.drawable.cupboard64_night}
        }
    }

    fun cupboard128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.cupboard128_morning}
            DayCycle.SUNSET -> { R.drawable.cupboard128_sunset}
            DayCycle.NIGHT -> { R.drawable.cupboard128_night}
        }
    }

    fun table64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.table64_morning}
            DayCycle.SUNSET -> { R.drawable.table64_sunset}
            DayCycle.NIGHT -> { R.drawable.table64_night}
        }
    }
    fun table128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.table128_morning}
            DayCycle.SUNSET -> { R.drawable.table128_sunset}
            DayCycle.NIGHT -> { R.drawable.table128_night}
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

    fun beach256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.beach256_morning}
            DayCycle.SUNSET -> { R.drawable.beach256_sunset}
            DayCycle.NIGHT -> { R.drawable.beach256_night}
        }
    }

    fun volcano256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.volcano256_morning}
            DayCycle.SUNSET -> { R.drawable.volcano256_sunset}
            DayCycle.NIGHT -> { R.drawable.volcano256_night}
        }
    }

    fun column256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.column256_morning}
            DayCycle.SUNSET -> { R.drawable.column256_sunset}
            DayCycle.NIGHT -> { R.drawable.column256_night}
        }
    }

    fun volcanoArea256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.volcano_area256_morning}
            DayCycle.SUNSET -> { R.drawable.volcano_area256_sunset}
            DayCycle.NIGHT -> { R.drawable.volcano_area256_night}
        }
    }

    fun fountain256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.fountain256_morning}
            DayCycle.SUNSET -> { R.drawable.fountain256_sunset}
            DayCycle.NIGHT -> { R.drawable.fountain256_night}
        }
    }

    fun campFire256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.camp_fire256_morning}
            DayCycle.SUNSET -> { R.drawable.camp_fire256_sunset}
            DayCycle.NIGHT -> { R.drawable.camp_fire256_night}
        }
    }

    fun carriage64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.carriage64_morning}
            DayCycle.SUNSET -> { R.drawable.carriage64_sunset}
            DayCycle.NIGHT -> { R.drawable.carriage64_night}
        }
    }

    fun carriage128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.carriage128_morning}
            DayCycle.SUNSET -> { R.drawable.carriage128_sunset}
            DayCycle.NIGHT -> { R.drawable.carriage128_night}
        }
    }


    fun carriage256(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.carriage256_morning}
            DayCycle.SUNSET -> { R.drawable.carriage256_sunset}
            DayCycle.NIGHT -> { R.drawable.carriage256_night}
        }
    }

    fun divineGate64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.divine_gate64_morning}
            DayCycle.SUNSET -> { R.drawable.divine_gate64_sunset}
            DayCycle.NIGHT -> { R.drawable.divine_gate64_night}
        }
    }

    fun divineGate128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.divine_gate128_morning}
            DayCycle.SUNSET -> { R.drawable.divine_gate128_sunset}
            DayCycle.NIGHT -> { R.drawable.divine_gate128_night}
        }
    }

    fun bush64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.bush64_morning}
            DayCycle.SUNSET -> { R.drawable.bush64_sunset}
            DayCycle.NIGHT -> { R.drawable.bush64_night}
        }
    }

    fun bush128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.bush128_morning}
            DayCycle.SUNSET -> { R.drawable.bush128_sunset}
            DayCycle.NIGHT -> { R.drawable.bush128_night}
        }
    }

    fun footprints64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.footprints64_morning}
            DayCycle.SUNSET -> { R.drawable.footprints64_sunset}
            DayCycle.NIGHT -> { R.drawable.footprints64_night}
        }
    }

    fun footprints128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.footprints128_morning}
            DayCycle.SUNSET -> { R.drawable.footprints128_sunset}
            DayCycle.NIGHT -> { R.drawable.footprints128_night}
        }
    }


    fun soil128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.soil128_morning}
            DayCycle.SUNSET -> { R.drawable.soil128_sunset}
            DayCycle.NIGHT -> { R.drawable.soil128_night}
        }
    }

    fun soil64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.soil64_morning }
            DayCycle.SUNSET -> { R.drawable.soil64_sunset }
            DayCycle.NIGHT -> { R.drawable.soil64_night }
        }
    }

    fun occultCircle128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.occult_circle128_morning}
            DayCycle.SUNSET -> { R.drawable.occult_circle128_sunset}
            DayCycle.NIGHT -> { R.drawable.occult_circle128_night }
        }
    }

    fun occultCircle64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.occult_circle64_morning}
            DayCycle.SUNSET -> { R.drawable.occult_circle64_sunset}
            DayCycle.NIGHT -> { R.drawable.occult_circle64_night}
        }
    }

    fun fountain64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.fountain64_morning}
            DayCycle.SUNSET -> { R.drawable.fountain64_sunset}
            DayCycle.NIGHT -> { R.drawable.fountain64_night }
        }
    }

    fun fountain128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.fountain128_morning}
            DayCycle.SUNSET -> { R.drawable.fountain128_sunset}
            DayCycle.NIGHT -> { R.drawable.fountain128_night }
        }
    }

    fun cherryTree64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.cherry_tree64_morning}
            DayCycle.SUNSET -> { R.drawable.cherry_tree64_sunset}
            DayCycle.NIGHT -> { R.drawable.cherry_tree64_night }
        }
    }

    fun cherryTree128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.cherry_tree128_morning}
            DayCycle.SUNSET -> { R.drawable.cherry_tree128_sunset}
            DayCycle.NIGHT -> { R.drawable.cherry_tree128_night }
        }
    }

    fun dayCycleIcon64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.morning64}
            DayCycle.SUNSET -> { R.drawable.sunset64}
            DayCycle.NIGHT -> { R.drawable.night64 }
        }
    }

    fun dayCycleIcon32(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.morning32}
            DayCycle.SUNSET -> { R.drawable.sunset32}
            DayCycle.NIGHT -> { R.drawable.night32 }
        }
    }

    fun forest64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.forest64_morning}
            DayCycle.SUNSET -> { R.drawable.forest64_sunset}
            DayCycle.NIGHT -> { R.drawable.forest64_night }
        }
    }

    fun forest128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.forest128_morning }
            DayCycle.SUNSET -> { R.drawable.forest128_sunset }
            DayCycle.NIGHT -> { R.drawable.forest128_night }
        }
    }

    fun cave64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.cave64_morning}
            DayCycle.SUNSET -> { R.drawable.cave64_sunset }
            DayCycle.NIGHT -> { R.drawable.cave64_night }
        }
    }

    fun cave128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.cave128_morning }
            DayCycle.SUNSET -> { R.drawable.cave128_sunset }
            DayCycle.NIGHT -> { R.drawable.cave128_night }
        }
    }

    fun divineTemple64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.divine_temple64_morning }
            DayCycle.SUNSET -> { R.drawable.divine_temple64_sunset }
            DayCycle.NIGHT -> { R.drawable.divine_temple64_night }
        }
    }

    fun divineDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.divine_door128_morning }
            DayCycle.SUNSET -> { R.drawable.divine_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.divine_door128_night }
        }
    }

    fun hereticTemple64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.heretic_temple64_morning }
            DayCycle.SUNSET -> { R.drawable.heretic_temple64_sunset }
            DayCycle.NIGHT -> { R.drawable.heretic_temple64_night }
        }
    }

    fun hereticDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.heretic_dorr128_morning }
            DayCycle.SUNSET -> { R.drawable.heretic_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.heretic_door128_night }
        }
    }

    fun arena64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.arena64_morning }
            DayCycle.SUNSET -> { R.drawable.arena64_sunset }
            DayCycle.NIGHT -> { R.drawable.arena64_night }
        }
    }

    fun arenaDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.arena_gate128_morning }
            DayCycle.SUNSET -> { R.drawable.arena_gate128_sunset }
            DayCycle.NIGHT -> { R.drawable.arena_gate128_night }
        }
    }

    fun boatLadder128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.ladder128_morning }
            DayCycle.SUNSET -> { R.drawable.ladder128_sunset }
            DayCycle.NIGHT -> { R.drawable.ladder128_night }
        }
    }

    fun library64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.library64_morning }
            DayCycle.SUNSET -> { R.drawable.library64_sunset }
            DayCycle.NIGHT -> { R.drawable.library64_sunset }
        }
    }

    fun libraryDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.library_door128_morning }
            DayCycle.SUNSET -> { R.drawable.library_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.library_door128_night }
        }
    }

    fun houseDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.wooden_door128_morning }
            DayCycle.SUNSET -> { R.drawable.wooden_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.wooden_door128_night }
        }
    }

    fun university64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.university64_morning }
            DayCycle.SUNSET -> { R.drawable.university64_sunset }
            DayCycle.NIGHT -> { R.drawable.university64_night }
        }
    }

    fun universityDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.university_door128_morning }
            DayCycle.SUNSET -> { R.drawable.university_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.university_door128_night }
        }
    }

    fun tavern64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.first_clothing_shop64_morning }
            DayCycle.SUNSET -> { R.drawable.first_clothing_shop64_sunset}
            DayCycle.NIGHT -> { R.drawable.first_clothing_shop64_night}
        }
    }

    fun tavernDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.first_clothing_door128_morning }
            DayCycle.SUNSET -> { R.drawable.first_clothing_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.first_clothing_door128_night }
        }
    }

    fun clothingShop64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.second_clothing_shop64_morning }
            DayCycle.SUNSET -> { R.drawable.second_clothing_shop64_sunset }
            DayCycle.NIGHT -> { R.drawable.second_clothing_shop64_night }
        }
    }

    fun clothingShopDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.second_clothing_door128_morning }
            DayCycle.SUNSET -> { R.drawable.second_clothing_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.second_clothing_door128_night }
        }
    }

    fun theatre64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.theatre64_morning }
            DayCycle.SUNSET -> { R.drawable.theathre64_sunset }
            DayCycle.NIGHT -> { R.drawable.theatre64_night }
        }
    }

    fun theatreDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.theatre_door128_morning }
            DayCycle.SUNSET -> { R.drawable.theatre_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.theatre_door128_night }
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

    fun goldenPalace64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.golden_castle64_morning }
            DayCycle.SUNSET -> { R.drawable.golden_castle64_sunset }
            DayCycle.NIGHT -> { R.drawable.golden_castle64_night }
        }
    }

    fun goldenDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.golden_door128_morning }
            DayCycle.SUNSET -> { R.drawable.golden_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.golden_door128_night }
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

    fun volcano64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.volcano64_morning }
            DayCycle.SUNSET -> { R.drawable.volcano64_sunset }
            DayCycle.NIGHT -> { R.drawable.volcano64_night }
        }
    }

    fun volcano128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.volcano128_morning }
            DayCycle.SUNSET -> { R.drawable.volcano128_sunset }
            DayCycle.NIGHT -> { R.drawable.volcano128_night }
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

    fun boat64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.boat64_morning }
            DayCycle.SUNSET -> { R.drawable.boat64_sunset }
            DayCycle.NIGHT -> { R.drawable.boat64_night }
        }
    }

    fun meteorsHouse64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.wooden_house64_morning }
            DayCycle.SUNSET -> { R.drawable.wooden_house64_sunset }
            DayCycle.NIGHT -> { R.drawable.wooden_house64_night }
        }
    }

    fun bed128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.double_bed128_morning }
            DayCycle.SUNSET -> { R.drawable.double_bed128_sunset }
            DayCycle.NIGHT -> { R.drawable.double_bed128_night }
        }
    }

    fun aaliyah256(): Int = R.drawable.aaliyah256
    fun aaliyah128(): Int = R.drawable.aalliyah128

    fun mei256(): Int = R.drawable.mei256
    fun mei128(): Int = R.drawable.mei128

    fun nikita256(): Int = R.drawable.nikita256
    fun nikita128(): Int = R.drawable.nikita128

    fun brianna256(): Int = R.drawable.brianna256
    fun brianna128(): Int = R.drawable.brianna128

    fun daniel256(): Int = R.drawable.daniel256
    fun daniel128(): Int = R.drawable.daniel128

    fun erica256(): Int = R.drawable.erica256
    fun erica128(): Int = R.drawable.erica128

    fun jin256(): Int = R.drawable.jin256
    fun jin128(): Int = R.drawable.jin128

    fun khan256(): Int = R.drawable.khan256
    fun khan128(): Int = R.drawable.khan128

    fun lee256(): Int = R.drawable.lee256
    fun lee128(): Int = R.drawable.lee128

    fun malik256(): Int = R.drawable.malik256
    fun malik128(): Int = R.drawable.malik128

    fun maxim256(): Int = R.drawable.maxim256
    fun maxim128(): Int = R.drawable.maxim128

    fun pasha256(): Int = R.drawable.pasha256
    fun pasha128(): Int = R.drawable.pasha128

    fun serenity256(): Int = R.drawable.serenity256
    fun serenity128(): Int = R.drawable.serenity128

    fun sophia256(): Int = R.drawable.sophia256
    fun sophia128(): Int = R.drawable.sophia128

    fun mysteriousPerson256(): Int = R.drawable.mysterious_person256
    fun mysteriousPerson128(): Int = R.drawable.mysterious_person128

    fun shadowAltar256(): Int = R.drawable.shadow_altar256
    fun boatBar256(): Int = R.drawable.boat_bar256
    fun goldenRobe256(): Int = R.drawable.golden_robe256
    fun desk256(): Int = R.drawable.desk256
    fun theatreScene256(): Int = R.drawable.theatre256
    fun greenHouse256(): Int = R.drawable.green_house256
    fun forestAtNight256(): Int = R.drawable.forest256_night
    fun creator256(): Int = R.drawable.eye256

    fun divineAltar256(): Int = R.drawable.divine_altar256
    fun divineAltar128(): Int = R.drawable.divine_altar128
}