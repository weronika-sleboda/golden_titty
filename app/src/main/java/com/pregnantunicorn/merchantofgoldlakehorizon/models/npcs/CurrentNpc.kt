package com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Friends
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues.MeiDialogs
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues.*

object CurrentNpc {

    const val JIN = 0
    const val KHAN = 1
    const val SOPHIA = 2
    const val MALIK = 3
    const val NIKITA = 4
    const val LEE = 5
    const val AALIYAH = 6
    const val MEI = 7
    const val PASHA = 8
    const val SERENITY = 9
    const val MAXIM = 10
    const val DANIEL = 11
    const val BRIANNA = 12
    const val ERICA = 13

    val npcs = arrayOf(

        Npc("Jin",
            R.drawable.jin128,
            { Merchant.friends()[Friends.JIN].friendshipToString() },
            { JinDialogs().getLine(Merchant.friends()[Friends.JIN].friendship()) },
            Friends.JIN
        ),

        Npc("Khan",
            R.drawable.khan128,
            { Merchant.friends()[Friends.KHAN].friendshipToString() },
            { KhanDialogs().getLine(Merchant.friends()[Friends.KHAN].friendship()) },
            Friends.KHAN
        ),

        Npc("Sophia",
            R.drawable.sophia128,
            { Merchant.friends()[Friends.SOPHIA].friendshipToString() },
            { SophiaDialogs().getLine(Merchant.friends()[Friends.SOPHIA].friendship()) },
            Friends.SOPHIA
        ),

        Npc("Malik",
            R.drawable.malik128,
            { Merchant.friends()[Friends.MALIK].friendshipToString() },
            { MalikDialogs().getLine(Merchant.friends()[Friends.MALIK].friendship()) },
            Friends.MALIK
        ),

        Npc("Nikita",
            R.drawable.nikita128,
            { Merchant.friends()[Friends.NIKITA].friendshipToString() },
            { NikitaDialogs().getLine(Merchant.friends()[Friends.NIKITA].friendship()) },
            Friends.NIKITA
        ),

        Npc("Lee",
            R.drawable.lee128,
            { Merchant.friends()[Friends.LEE].friendshipToString() },
            { LeeDialogs().getLine(Merchant.friends()[Friends.LEE].friendship()) },
            Friends.LEE
        ),

        Npc("Aaliyah",
            R.drawable.aalliyah128,
            { Merchant.friends()[Friends.AALIYAH].friendshipToString() },
            { AaliyahDialogs().getLine(Merchant.friends()[Friends.AALIYAH].friendship()) },
            Friends.AALIYAH
        ),

        Npc("Mei",
            R.drawable.mei128,
            { Merchant.friends()[Friends.MEI].friendshipToString() },
            { MeiDialogs().getLine(Merchant.friends()[Friends.MEI].friendship()) },
            Friends.MEI
        ),

        Npc("Pasha",
            R.drawable.pasha128,
            { Merchant.friends()[Friends.PASHA].friendshipToString() },
            { PashaDialogs().getLine(Merchant.friends()[Friends.PASHA].friendship()) },
            Friends.PASHA
        ),

        Npc("Serenity",
            R.drawable.serenity128,
            { Merchant.friends()[Friends.SERENITY].friendshipToString() },
            { SerenityDialogs().getLine(Merchant.friends()[Friends.SERENITY].friendship()) },
            Friends.SERENITY
        ),

        Npc("Maxim",
            R.drawable.maxim128,
            { Merchant.friends()[Friends.MAXIM].friendshipToString() },
            { MaximDialogs().getLine(Merchant.friends()[Friends.MAXIM].friendship()) },
            Friends.MAXIM
        ),

        Npc("Daniel",
            R.drawable.daniel128,
            { Merchant.friends()[Friends.DANIEL].friendshipToString() },
            { DanielDialogs().getLine(Merchant.friends()[Friends.DANIEL].friendship()) },
            Friends.DANIEL
        ),

        Npc("Brianna",
            R.drawable.brianna128,
            { Merchant.friends()[Friends.BRIANNA].friendshipToString() },
            { BrianaDialogs().getLine(Merchant.friends()[Friends.BRIANNA].friendship()) },
            Friends.BRIANNA
        ),

        Npc("Erica",
            R.drawable.erica128,
            { Merchant.friends()[Friends.ERICA].friendshipToString() },
            { EricaDialogs().getLine(Merchant.friends()[Friends.ERICA].friendship()) },
            Friends.ERICA
        ),
    )

    private var npc = npcs[JIN]
    fun npc() = npc

    fun changeNpc(index: Int) {

        npc = npcs[index]
    }

}