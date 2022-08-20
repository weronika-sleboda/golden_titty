package com.pregnantunicorn.merchantofgoldlakehorizon.models.shops

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.CurrentBoomerang

class BoomerangShopManager {

    private val shop = arrayOf(

        BoomerangShopItem(
            "Nomad",
            R.drawable.nomad_boomerang64,
            "Required accuracy: 3",
            "Speed: Normal",
            "Style: Unpredictable",
            "Hits: 2",
            "Power: 1",
            150
        )
        {
            (CurrentBoomerang.boomerangs[CurrentBoomerang.NOMAD].addToBackpack())
        },

        BoomerangShopItem(
            "Butterfly",
            R.drawable.butterfly_boomerang64,
            "Required accuracy: 3",
            "Speed: Normal",
            "Style: Zig Zag",
            "Hits: 1",
            "Power: 1",
            80
        )
        {
            (CurrentBoomerang.boomerangs[CurrentBoomerang.BUTTERFLY].addToBackpack())
        },


        BoomerangShopItem(
            "Pilgrim",
            R.drawable.pilgrim_boomerang64,
            "Required accuracy: 2",
            "Speed: Fast",
            "Style: Zig Zag",
            "Hits: 1",
            "Power: 1",
            250
        )
        {
            (CurrentBoomerang.boomerangs[CurrentBoomerang.PILGRIM].addToBackpack())
        },

        BoomerangShopItem(
            "Bandit",
            R.drawable.bandit_boomerang64,
            "Required accuracy: 5",
            "Speed: Fast",
            "Style: Unpredictable",
            "Hits: 2",
            "Power: 3",
            330
        )
        {
            (CurrentBoomerang.boomerangs[CurrentBoomerang.BANDIT].addToBackpack())
        },

        BoomerangShopItem(
            "Warrior",
            R.drawable.warrior_boomerang64,
            "Required accuracy: 3",
            "Speed: Normal",
            "Style: Zig Zag",
            "Hits: 1",
            "Power: 3",
            410
        )
        {
            (CurrentBoomerang.boomerangs[CurrentBoomerang.WARRIOR].addToBackpack())
        },

        BoomerangShopItem(
            "Seducer",
            R.drawable.seducer_boomerang64,
            "Required accuracy: 2",
            "Speed: Extremely Slow",
            "Style: Unpredictable",
            "Hits: 3",
            "Power: 1",
            380
        )
        {
            (CurrentBoomerang.boomerangs[CurrentBoomerang.SEDUCER].addToBackpack())
        },
    )

    fun name() = "Boomerang Shop"

    fun shopItems(): List<BoomerangShopItem> {

        val shopItems = mutableListOf<BoomerangShopItem>()

        val boomerangs = CurrentBoomerang.boomerangs

        if(!boomerangs[CurrentBoomerang.NOMAD].owns()) {

            shopItems.add(shop[0])
        }

        if(!boomerangs[CurrentBoomerang.BUTTERFLY].owns()) {

            shopItems.add(shop[1])
        }

        if(!boomerangs[CurrentBoomerang.PILGRIM].owns()) {

            shopItems.add(shop[2])
        }

        if(!boomerangs[CurrentBoomerang.BANDIT].owns()) {

            shopItems.add(shop[3])
        }

        if(!boomerangs[CurrentBoomerang.WARRIOR].owns()) {

            shopItems.add(shop[4])
        }

        if(!boomerangs[CurrentBoomerang.SEDUCER].owns()) {

            shopItems.add(shop[5])
        }

        return shopItems
    }
}