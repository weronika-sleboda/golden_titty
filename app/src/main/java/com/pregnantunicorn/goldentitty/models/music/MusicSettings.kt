package com.pregnantunicorn.goldentitty.models.music

import android.media.MediaPlayer

object MusicSettings {

    private var onButton = true
    private var offButton = false

    fun onButton() = onButton
    fun offButton() = offButton

    fun checkOnButton() {

        onButton = true
        offButton = false
    }

    fun checkOffButton() {

        offButton = true
        onButton = false
    }

    fun reset() {

        checkOnButton()
    }
}