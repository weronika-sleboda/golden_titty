package com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle

class IconFactory {

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

    fun firstClothingShop64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.first_clothing_shop64_morning }
            DayCycle.SUNSET -> { R.drawable.first_clothing_shop64_sunset}
            DayCycle.NIGHT -> { R.drawable.first_clothing_shop64_night}
        }
    }

    fun firstClothingDoor128(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.first_clothing_door128_morning }
            DayCycle.SUNSET -> { R.drawable.first_clothing_door128_sunset }
            DayCycle.NIGHT -> { R.drawable.first_clothing_door128_night }
        }
    }

    fun secondClothingShop64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.second_clothing_shop64_morning }
            DayCycle.SUNSET -> { R.drawable.second_clothing_shop64_sunset }
            DayCycle.NIGHT -> { R.drawable.second_clothing_shop64_night }
        }
    }

    fun secondClothingDoor128(): Int {

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

    fun column256(): Int  {

        return R.drawable.column256
    }

    fun boat64(): Int {

        return when(CurrentDayCycle.dayCycle()) {

            DayCycle.MORNING -> { R.drawable.boat64_morning }
            DayCycle.SUNSET -> { R.drawable.boat64_sunset }
            DayCycle.NIGHT -> { R.drawable.boat64_night }
        }
    }

    fun woodenHouse64(): Int {

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
    fun beach256(): Int = R.drawable.beach256
    fun goldenRobe256(): Int = R.drawable.golden_robe256
    fun desk256(): Int = R.drawable.desk256
    fun book256(): Int = R.drawable.book256
    fun theatreScene256(): Int = R.drawable.theatre256
    fun greenHouse256(): Int = R.drawable.green_house256
    fun forestAtNight256(): Int = R.drawable.forest256_night
    fun creator256(): Int = R.drawable.eye256

    fun divineAltar256(): Int = R.drawable.divine_altar256
    fun divineAltar128(): Int = R.drawable.divine_altar128
}