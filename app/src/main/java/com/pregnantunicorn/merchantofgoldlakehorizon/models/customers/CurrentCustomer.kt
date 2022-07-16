package com.pregnantunicorn.merchantofgoldlakehorizon.models.suppliers

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.customers.Customer
import com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs.CurrentNpc

object CurrentCustomer {

    const val JIN = 0

    private val customers = arrayOf(

        Customer(
            "Jin (Customer)",
            R.drawable.jin128,
            "Any gems to sell? You can see my current demand and the reward for it above my head.",
            "This is exactly what I needed.",
            "Thank you. Come back if you have some more.",
            "Sorry, you don't meet my demand.",
            "You need to meet my demand exactly.",
            "You're not persuasive enough",
            "You don't have enough persuasion to change my mind.",
            "So what do you say about this one?",
            "This is my new deal.",
            10,
            5,
            15,
            10,
            5,
            CurrentNpc.JIN
        )
    )

    private var currentCustomer = customers[JIN]
    fun currentCustomer() = currentCustomer

    fun changeCustomer(index: Int) {

        currentCustomer = customers[index]
    }
}