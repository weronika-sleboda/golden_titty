package com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.events

import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.Act

abstract class Event {

    private var hasAlreadyHappened = false
    fun hasAlreadyHappened() = hasAlreadyHappened

    protected fun completeEvent() {

        hasAlreadyHappened = true
    }

    abstract fun proceed()
    abstract fun eventLine(): Act
}