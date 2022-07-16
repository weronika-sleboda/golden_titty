package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

object Merchant {

    private var energy = Condition()
    private var persuasion = Condition()
    private var charisma = Condition()
    private var intelligence = Condition()
    private var itemBackpack = ItemBackpack()
    private var foodBackpack = FoodBackpack()

    private var goldenCoins = Money(0)

    fun persuasion() = persuasion
    fun energy() = energy
    fun charisma() = charisma
    fun intelligence() = intelligence
    fun items() = itemBackpack.items
    fun food() = foodBackpack.foods

    fun goldenCoins() = goldenCoins

}