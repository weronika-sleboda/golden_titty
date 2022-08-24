package com.pregnantunicorn.goldentitty.models.story_line

abstract class Event {

    private var hasAlreadyHappened = false
    fun hasAlreadyHappened() = hasAlreadyHappened

    fun completeEvent() {

        hasAlreadyHappened = true
    }

    abstract fun proceed()
    abstract fun eventLine(): Act
}