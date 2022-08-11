package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.inn.CurrentInnDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.InnDoorFragment

class InnTile(
    private val icon: () -> Int,
    private val innDoorIndex: Int
) : Tile(true)
{
    override fun icon() = icon.invoke()
    override fun background() = BackgroundFactory().grass()

    override fun onClick(activity: FragmentActivity) {

        CurrentInnDoor.changeInnDoor(innDoorIndex)

        activity.supportFragmentManager.commit {

            replace<InnDoorFragment>(R.id.world_container)
        }
    }
}