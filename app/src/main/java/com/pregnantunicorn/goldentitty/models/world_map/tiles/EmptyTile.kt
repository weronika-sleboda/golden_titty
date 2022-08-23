package com.pregnantunicorn.goldentitty.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.day_cycle.CurrentDayCycle

class EmptyTile(
    private val background: () -> Int
) : Tile(false)
{
    override fun icon(): Int {

        return R.drawable.accuracy32
    }

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        //*** Do nothing
    }
}