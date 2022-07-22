package com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Friends
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues.JinDialogs
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues.KhanDialogs
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues.SophiaDialogs

object CurrentNpc {

    const val JIN = 0
    const val KHAN = 1
    const val SOPHIA = 2

    val npcs = arrayOf(

        Npc("Jin",
            R.drawable.jin128,
            { Merchant.friends()[Friends.JIN].friendshipToString() },
            { JinDialogs().getLine(Merchant.friends()[Friends.JIN].friendship()) },
        ),

        Npc("Khan",
            R.drawable.khan128,
            { Merchant.friends()[Friends.KHAN].friendshipToString() },
            { KhanDialogs().getLine(Merchant.friends()[Friends.KHAN].friendship()) },
        ),

        Npc("Sophia",
            R.drawable.sophia128,
            { Merchant.friends()[Friends.SOPHIA].friendshipToString() },
            { SophiaDialogs().getLine(Merchant.friends()[Friends.SOPHIA].friendship()) }
        )
    )

    private var npc = npcs[JIN]
    fun npc() = npc

    fun changeNpc(index: Int) {

        npc = npcs[index]
    }

}