package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory

class CaveTile : Tile(true)
{
    enum class State {

        READY,
        CRASHED,
        FINISHED,
    }

    private var icon = R.drawable.sapphire_stone64

    override fun icon(): Int {

        return icon
    }

    override fun background() = BackgroundFactory().volcano()

    override fun onClick(activity: FragmentActivity) {


    }

    private var state = State.READY
    fun state() = state
}