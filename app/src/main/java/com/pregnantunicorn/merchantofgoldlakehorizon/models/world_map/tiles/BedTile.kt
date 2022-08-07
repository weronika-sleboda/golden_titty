package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.bed.BedType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.bed.CurrentBed
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.BedFragment

class BedTile(
    private val bedType: BedType,
    private val icon: () -> Int,
    private val background: () -> Int,
) : Tile(true)
{
    override fun icon() = icon.invoke()

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        CurrentBed.changeBed(bedType)

        activity.supportFragmentManager.commit {

            replace<BedFragment>(R.id.world_container)
        }
    }
}