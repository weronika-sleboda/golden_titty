package com.pregnantunicorn.goldentitty.models.story_line

abstract class Event {

    private var hasAlreadyHappened = false
    fun hasAlreadyHappened() = hasAlreadyHappened

    fun completeEvent() {

        hasAlreadyHappened = true
    }

    fun load(hasAlreadyHappened: Boolean) {

        this.hasAlreadyHappened = hasAlreadyHappened
    }

    abstract fun eventTitle(): EventTitle
    abstract fun proceed()
    abstract fun eventLine(): Act

    fun reset() {

        hasAlreadyHappened = false
    }
}