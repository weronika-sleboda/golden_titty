package com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs

import com.pregnantunicorn.merchantofgoldlakehorizon.R

object CurrentNpc {

    const val JIN = 0

    val npcs = arrayOf(

        Npc(
            "Jin",
            R.drawable.jin128,
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "0"
        )
    )

    private var npc = npcs[JIN]
    fun npc() = npc

    fun changeNpc(index: Int) {

        npc = npcs[index]
    }

}