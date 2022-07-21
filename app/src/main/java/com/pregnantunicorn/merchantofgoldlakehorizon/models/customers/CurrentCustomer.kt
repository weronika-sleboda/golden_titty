package com.pregnantunicorn.merchantofgoldlakehorizon.models.suppliers

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.customers.Customer
import com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs.CurrentNpc
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues.JinDialogs
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues.KhanDialogs
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.dialogues.SophiaDialogs

object CurrentCustomer {

    const val JIN = 0
    const val KHAN = 1
    const val SOPHIA = 2

    private val customers = arrayOf(

        Customer(
            "Jin (Customer)",
            R.drawable.jin128,
            JinDialogs().welcomeLine(),
            { JinDialogs().thankYouLine() },
            { JinDialogs().demandNotMetLine() },
            { JinDialogs().noPersuasionLine() },
            { JinDialogs().dealChangedLine() },
            5,
            CurrentNpc.JIN
        ),

        Customer(
            "Khan (Customer)",
            R.drawable.khan128,
            KhanDialogs().welcomeLine(),
            { KhanDialogs().thankYouLine() },
            { KhanDialogs().demandNotMetLine() },
            { KhanDialogs().noPersuasionLine() },
            { KhanDialogs().dealChangedLine() },
            7,
            CurrentNpc.KHAN
        ),

        Customer(
            "Sophia (Customer)",
            R.drawable.sophia128,
            SophiaDialogs().welcomeLine(),
            { SophiaDialogs().thankYouLine() },
            { SophiaDialogs().demandNotMetLine() },
            { SophiaDialogs().noPersuasionLine() },
            { SophiaDialogs().dealChangedLine() },
            3,
            CurrentNpc.SOPHIA
        )
    )

    private var currentCustomer = customers[JIN]
    fun currentCustomer() = currentCustomer

    fun changeCustomer(index: Int) {

        currentCustomer = customers[index]
    }
}