package com.pregnantunicorn.goldentitty.models.file_manager

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pregnantunicorn.goldentitty.models.excavation.CurrentExcavationSite
import com.pregnantunicorn.goldentitty.models.excavation.ExcavationNumber
import com.pregnantunicorn.goldentitty.models.excavation.ExcavationTile
import com.pregnantunicorn.goldentitty.models.story_line.events.*

class EventFile {

    companion object {

        private const val STATUE_EVENT = "statue_event"
        private const val TEMPLE_EVENT = "temple_event"
        private const val DONUT_OPENING = "donut_opening"
        private const val SENTINO_OPENING = "sentino_opening"
        private const val VLADIMIR_OPENING = "vladimir opening"
        private const val GATE_EVENT = "gate_event"
    }

    fun save(sharedPreferences: SharedPreferences) {

        val gson = Gson()
        val statueEvent = gson.toJson(StatueEvent.event.hasAlreadyHappened())
        val templeEvent = gson.toJson(TempleEvent.event.hasAlreadyHappened())
        val donutOpening = gson.toJson(FirstFloorOpeningEvent.event.hasAlreadyHappened())
        val sentinoOpening = gson.toJson(SecondFloorOpeningEvent.event.hasAlreadyHappened())
        val vladimirOpening = gson.toJson(ThirdFloorOpeningEvent.event.hasAlreadyHappened())
        val gateEvent = gson.toJson(WesternGateEvent.event.hasAlreadyHappened())


        val statueEventStorage = sharedPreferences.edit().putString(
            STATUE_EVENT, statueEvent
        )

        val templeEventStorage = sharedPreferences.edit().putString(
            TEMPLE_EVENT, templeEvent
        )

        val donutEventStorage = sharedPreferences.edit().putString(
            DONUT_OPENING, donutOpening
        )

        val sentinoEventStorage = sharedPreferences.edit().putString(
            SENTINO_OPENING, sentinoOpening
        )

        val vladimirEventStorage = sharedPreferences.edit().putString(
            VLADIMIR_OPENING, vladimirOpening
        )

        val gateEventStorage = sharedPreferences.edit().putString(
            GATE_EVENT, gateEvent
        )


        statueEventStorage.apply()
        templeEventStorage.apply()
        donutEventStorage.apply()
        sentinoEventStorage.apply()
        vladimirEventStorage.apply()
        gateEventStorage.apply()
    }

    fun load(sharedPreferences: SharedPreferences) {

        val gson = Gson()

        val statueEvent = sharedPreferences.getString(STATUE_EVENT, null)
        val templeEvent = sharedPreferences.getString(TEMPLE_EVENT, null)
        val donutOpening = sharedPreferences.getString(DONUT_OPENING, null)
        val sentinoOpening = sharedPreferences.getString(SENTINO_OPENING, null)
        val vladimirOpening = sharedPreferences.getString(VLADIMIR_OPENING, null)
        val gateEvent = sharedPreferences.getString(GATE_EVENT, null)


        val type = Boolean::class.java

        StatueEvent.event.load(gson.fromJson(statueEvent, type))
        TempleEvent.event.load(gson.fromJson(templeEvent, type))
        FirstFloorOpeningEvent.event.load(gson.fromJson(donutOpening, type))
        SecondFloorOpeningEvent.event.load(gson.fromJson(sentinoOpening, type))
        ThirdFloorOpeningEvent.event.load(gson.fromJson(vladimirOpening, type))
        WesternGateEvent.event.load(gson.fromJson(gateEvent, type))
    }

    fun reset() {

        OpeningEvent.event.reset()
        EndingEvent.event.reset()
        CampFireEvent.event.reset()
        ExcavationSiteEvent.event.reset()
        FirstFloorEndingEvent.event.reset()
        FirstFloorOpeningEvent.event.reset()
        FirstFloorDeathEvent.event.reset()
        SecondFloorEndingEvent.event.reset()
        SecondFloorOpeningEvent.event.reset()
        SecondFloorDeathEvent.event.reset()
        ThirdFloorEndingEvent.event.reset()
        ThirdFloorOpeningEvent.event.reset()
        ThirdFloorDeathEvent.event.reset()
        PierEvent.event.reset()
        TeamsDeathEvent.event.reset()
        WesternGateEvent.event.reset()
        WorkshopEvent.event.reset()
        TempleEvent.event.reset()
        StatueEvent.event.reset()
        LadySilviasHutEvent.event.reset()
        LadySilviasDeathEvent.event.reset()
    }
}