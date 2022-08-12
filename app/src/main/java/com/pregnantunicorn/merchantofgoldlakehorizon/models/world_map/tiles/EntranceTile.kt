package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances.CurrentEntrance
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.ActionFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.EntranceFragment

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