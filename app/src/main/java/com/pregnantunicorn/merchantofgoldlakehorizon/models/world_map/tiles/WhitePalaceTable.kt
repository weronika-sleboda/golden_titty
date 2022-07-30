package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.CurrentDayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.day_cycle.DayCycle
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.ClothingShopFragment
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.FoodShopFragment

class WhitePalaceTable: Tile(true)
{
    override fun icon(): Int {

        return IconFactory().table64()
    }

    override fun background() = BackgroundFactory().whiteFloor()

    override fun onClick(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<FoodShopFragment>(R.id.world_container)
        }
    }
}