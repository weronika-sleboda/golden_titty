package com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs

import com.pregnantunicorn.merchantofgoldlakehorizon.models.suppliers.CurrentCustomer

class Npc(
    val name: String,
    val icon: Int,
    private val customerIndex: Int,
    private val friendshipToString: () -> String,
    private val npcLine: () -> String
)
{

    fun friendshipToString() = friendshipToString.invoke()

    fun trade() {

        CurrentCustomer.changeCustomer(customerIndex)
    }

    fun greeting(): String {

        return npcLine.invoke()
    }
}