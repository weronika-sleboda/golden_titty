package com.pregnantunicorn.goldentitty.models.tutorial

object Tutorial {

    private var needed = true
    fun needed() = needed

    fun reset() {

        needed = true
    }

    fun noNeedForTutorial() {

        needed = false
    }
}