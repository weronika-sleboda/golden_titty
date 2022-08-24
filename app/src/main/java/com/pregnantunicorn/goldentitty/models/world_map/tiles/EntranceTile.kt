package com.pregnantunicorn.goldentitty.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.entrances.CurrentEntrance
import com.pregnantunicorn.goldentitty.views.fragments.EntranceFragment

class EntranceTile(
    private val entranceIndex: Int,
    private val icon: () -> Int,
    private val background: () -> Int
): Tile(true)
{
    override fun icon() = icon.invoke()

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        CurrentEntrance.changeEntrance(entranceIndex)

        activity.supportFragmentManager.commit {

            replace<EntranceFragment>(R.id.world_container)
        }
    }
}