package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

object Merchant {

    private var energy = Status()
    private var persuasion = Status()
    private var charisma = Status()
    private var intelligence = Status()
    private var itemBackpack = ItemBackpack()
    private var foodBackpack = FoodBackpack()
    private var appearance = Appearance()
    private var friends = Friends()

    private var goldenCoins = Money()

    fun persuasion() = persuasion
    fun energy() = energy
    fun charisma() = charisma
    fun intelligence() = intelligence
    fun items() = itemBackpack.items
    fun food() = foodBackpack.foods
    fun appearance() = appearance
    fun friends() = friends.friends

    fun goldenCoins() = goldenCoins

}