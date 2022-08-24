package com.pregnantunicorn.goldentitty.models.npcs

import com.pregnantunicorn.goldentitty.R

object CurrentNpc {

    const val JIN = 0
    const val SAPHONEE = 1

    private var npcs = arrayOf(

        Npc(
            "Jin",
            R.drawable.jin128,
            { JinsGreetings().greeting() },
            { JinsGreetings().afterMeal() },
            { JinsGreetings().isFedLine() }
        ),

        Npc(
            "Saphonee",
            R.drawable.saphonee128,
            { SaphoneesGreetings().greeting() },
            { SaphoneesGreetings().afterMeal() },
            { SaphoneesGreetings().isFedLine() }
        ),
    )

    private var npc = npcs[JIN]
    fun npc() = npc

    fun changeNpc(npcIndex: Int) {

        npc = npcs[npcIndex]
    }

    fun reset() {

        npcs = arrayOf(

            Npc(
                "Jin",
                R.drawable.jin128,
                { JinsGreetings().greeting() },
                { JinsGreetings().afterMeal() },
                { JinsGreetings().isFedLine() }
            ),

            Npc(
                "Saphonee",
                R.drawable.saphonee128,
                { SaphoneesGreetings().greeting() },
                { SaphoneesGreetings().afterMeal() },
                { JinsGreetings().isFedLine() }
            ),
        )
    }

    fun npcs() = npcs

    fun jin() = npcs[JIN]
    fun saphonee() = npcs[SAPHONEE]
}