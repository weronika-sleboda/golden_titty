package com.pregnantunicorn.goldentitty.models.story_line

import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName

abstract class Event {

    private var hasAlreadyHappened = false
    fun hasAlreadyHappened() = hasAlreadyHappened

    fun completeEvent() {

        hasAlreadyHappened = true
    }

    abstract fun proceed()
    abstract fun eventLine(): Act
}