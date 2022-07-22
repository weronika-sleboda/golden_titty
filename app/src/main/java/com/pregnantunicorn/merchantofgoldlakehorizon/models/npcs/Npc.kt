package com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs

class Npc(
    val name: String,
    val icon: Int,
    private val friendshipToString: () -> String,
    private val npcLine: () -> String
)
{

    fun friendshipToString() = friendshipToString.invoke()

    fun greeting(): String {

        return npcLine.invoke()
    }
}