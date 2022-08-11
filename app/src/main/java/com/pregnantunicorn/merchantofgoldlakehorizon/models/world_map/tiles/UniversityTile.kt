package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.inn.BedType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.inn.CurrentBed
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.inn.CurrentInnDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.models.inn.InnDoor
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.BedFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.InnDoorFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.UniversityFragment

class UniversityTile : Tile(true)
{
    override fun icon() = IconFactory().university64()
    override fun background() = BackgroundFactory().grass()

    override fun onClick(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<UniversityFragment>(R.id.world_container)
        }
    }
}