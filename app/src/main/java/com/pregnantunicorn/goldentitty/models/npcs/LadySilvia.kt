package com.pregnantunicorn.goldentitty.models.npcs

import com.pregnantunicorn.goldentitty.R

object LadySilvia {

    private var ladySilvia = Npc(
        "Lady Silvia",
        R.drawable.lady_silvia128,
        { LadySilviaGreetings().greeting() },
        { LadySilviaGreetings().afterMeal() },
        { LadySilviaGreetings().isFedLine() },
        { LadySilviaGreetings().advice() }
    )

    fun ladySilvia() = ladySilvia


    fun reset() {

        ladySilvia = Npc(
            "Lady Silvia",
            R.drawable.lady_silvia128,
            { LadySilviaGreetings().greeting() },
            { LadySilviaGreetings().afterMeal() },
            { LadySilviaGreetings().isFedLine() },
            { LadySilviaGreetings().advice() }
        )
    }
}