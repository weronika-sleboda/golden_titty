package com.pregnantunicorn.goldentitty.models.player

class StoryProgress {

    private var progress = 0
    private val maxProgress = 12

    fun progress() = progress
    fun progressToString() = "$progress/$maxProgress"

    fun increaseProgress() {

        progress++

        if(progress > maxProgress) {

            progress = maxProgress
        }
    }

    fun gameIsCompleted() = progress == maxProgress
}