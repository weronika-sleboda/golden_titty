package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.bed.BedType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.bed.CurrentBed
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.BedFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.CaveFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.SneakFragment

class BedTile: Tile(true)
{
    override fun icon() = IconFactory().meteorsHouse64()

    override fun background() = BackgroundFactory().grass()

    override fun onClick(activity: FragmentActivity) {

        CurrentBed.changeBed(BedType.TAVERN_BED)

        activity.supportFragmentManager.commit {

            replace<BedFragment>(R.id.world_container)
        }
    }
}