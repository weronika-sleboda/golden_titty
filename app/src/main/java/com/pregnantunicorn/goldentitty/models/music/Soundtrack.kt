package com.pregnantunicorn.goldentitty.models.music

import android.content.Context
import android.media.MediaPlayer
import com.pregnantunicorn.goldentitty.R

object Soundtrack {

    private var eventTheme: MediaPlayer? = null
    private var openingTheme: MediaPlayer? = null
    private var morningTheme: MediaPlayer? = null
    private var sunsetTheme: MediaPlayer? = null
    private var nightTheme: MediaPlayer? = null

    private var currentSoundtrack = SoundtrackName.OPENING_THEME

    fun changeSoundtrack(soundtrackName: SoundtrackName) {

        currentSoundtrack = soundtrackName
    }

    fun playMusic(context: Context) {

        when(currentSoundtrack) {

            SoundtrackName.OPENING_THEME -> playOpeningTheme(context)
            SoundtrackName.EVENT_THEME -> playEventTheme(context)
            SoundtrackName.SUNSET_THEME -> playSunsetTheme(context)
            SoundtrackName.NIGHT_THEME -> playNightTheme(context)
            SoundtrackName.MORNING_THEME -> playMorningTheme(context)
        }
    }

    private fun playOpeningTheme(context: Context) {

        if(morningTheme != null) {

            morningTheme?.stop()
            morningTheme?.release()
            morningTheme = null
        }

        if(sunsetTheme != null) {

            sunsetTheme?.stop()
            sunsetTheme?.release()
            sunsetTheme = null
        }

        if(nightTheme != null) {

            nightTheme?.stop()
            nightTheme?.release()
            nightTheme = null
        }

        if(eventTheme != null) {

            eventTheme?.stop()
            eventTheme?.release()
            eventTheme = null
        }

        if(openingTheme == null) {

            openingTheme = MediaPlayer.create(context, R.raw.golden_titty_story_theme)
            openingTheme?.isLooping = true
            openingTheme?.start()
        }
    }

    private fun playEventTheme(context: Context) {

        if(morningTheme != null) {

            morningTheme?.stop()
            morningTheme?.release()
            morningTheme = null
        }

        if(sunsetTheme != null) {

            sunsetTheme?.stop()
            sunsetTheme?.release()
            sunsetTheme = null
        }

        if(nightTheme != null) {

            nightTheme?.stop()
            nightTheme?.release()
            nightTheme = null
        }

        if(openingTheme != null) {

            openingTheme?.stop()
            openingTheme?.release()
            openingTheme= null
        }

        if(eventTheme == null) {

            eventTheme = MediaPlayer.create(context, R.raw.opening_theme)
            eventTheme?.isLooping = true
            eventTheme?.start()
        }
    }

    private fun playMorningTheme(context: Context) {

        if(openingTheme != null) {

            openingTheme?.stop()
            openingTheme?.release()
            openingTheme = null
        }

        if(sunsetTheme != null) {

            sunsetTheme?.stop()
            sunsetTheme?.release()
            sunsetTheme = null
        }

        if(nightTheme != null) {

            nightTheme?.stop()
            nightTheme?.release()
            nightTheme = null
        }

        if(eventTheme != null) {

            eventTheme?.stop()
            eventTheme?.release()
            eventTheme = null
        }

        if(morningTheme == null) {

            morningTheme = MediaPlayer.create(context, R.raw.golden_titty_morning)
            morningTheme?.isLooping = true
            morningTheme?.start()
        }
    }

    private fun playSunsetTheme(context: Context) {

        if(morningTheme != null) {

            morningTheme?.stop()
            morningTheme?.release()
            morningTheme = null
        }

        if(openingTheme != null) {

            openingTheme?.stop()
            openingTheme?.release()
            openingTheme = null
        }

        if(nightTheme != null) {

            nightTheme?.stop()
            nightTheme?.release()
            nightTheme = null
        }

        if(eventTheme != null) {

            eventTheme?.stop()
            eventTheme?.release()
            eventTheme = null
        }

        if(sunsetTheme == null) {

            sunsetTheme = MediaPlayer.create(context, R.raw.golden_titty_sunset_theme)
            sunsetTheme?.isLooping = true
            sunsetTheme?.start()
        }
    }

    private fun playNightTheme(context: Context) {

        if(morningTheme != null) {

            morningTheme?.stop()
            morningTheme?.release()
            morningTheme = null
        }

        if(sunsetTheme != null) {

            sunsetTheme?.stop()
            sunsetTheme?.release()
            sunsetTheme = null
        }

        if(openingTheme != null) {

            openingTheme?.stop()
            openingTheme?.release()
            openingTheme = null
        }

        if(eventTheme != null) {

            eventTheme?.release()
            eventTheme = null
        }

        if(nightTheme == null) {

            nightTheme = MediaPlayer.create(context, R.raw.golden_titty_night_theme)
            nightTheme?.isLooping = true
            nightTheme?.start()
        }
    }

    fun stopMusic() {

        stopEventTheme()
        stopOpeningTheme()
        stopMorningTheme()
        stopNightTheme()
        stopSunsetTheme()
    }

    fun play() {

        when(currentSoundtrack) {

            SoundtrackName.OPENING_THEME -> playOpeningTheme()
            SoundtrackName.EVENT_THEME -> playEventTheme()
            SoundtrackName.MORNING_THEME -> playMorningTheme()
            SoundtrackName.SUNSET_THEME -> playSunsetTheme()
            SoundtrackName.NIGHT_THEME -> playNightTheme()
        }
    }

    private fun playEventTheme() {

        if(eventTheme != null) {

            eventTheme?.start()
        }
    }

    private fun playOpeningTheme() {

        if(openingTheme != null) {

            openingTheme?.start()
        }
    }

    private fun playMorningTheme() {

        if(morningTheme != null) {

            morningTheme?.start()
        }
    }

    private fun playSunsetTheme() {

        if(sunsetTheme != null) {

            sunsetTheme?.start()
        }
    }

    private fun playNightTheme() {

        if(nightTheme != null) {

            nightTheme?.start()
        }
    }

    private fun stopEventTheme() {

        if(eventTheme != null) {

            eventTheme?.pause()
        }
    }

    private fun stopOpeningTheme() {

        if(openingTheme != null) {

            openingTheme?.pause()
        }
    }

    private fun stopMorningTheme() {

        if(morningTheme != null) {

            morningTheme?.pause()
        }
    }

    private fun stopSunsetTheme() {

        if(sunsetTheme != null) {

            sunsetTheme?.pause()
        }
    }

    private fun stopNightTheme() {

        if(nightTheme != null) {

            nightTheme?.pause()
        }
    }
}