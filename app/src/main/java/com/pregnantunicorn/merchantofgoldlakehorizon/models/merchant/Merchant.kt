package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

object Merchant {

    private var energy = Status()
    private var persuasion = Status()
    private var charisma = Status()
    private var intelligence = Status()
    private var emerald = Gem()
    private var sapphire = Gem()
    private var ruby = Gem()

    private var foodBackpack = FoodBackpack()
    private var appearance = Appearance()
    private var friends = Friends()
    private var friendCounter = FriendCounter()

    private var goldenCoins = Money()

    fun persuasion() = persuasion
    fun energy() = energy
    fun charisma() = charisma
    fun intelligence() = intelligence

    fun emerald() = emerald
    fun sapphire() = sapphire
    fun ruby() = ruby

    fun food() = foodBackpack.foods
    fun appearance() = appearance
    fun friends() = friends.friends
    fun friendCounter() = friendCounter

    fun goldenCoins() = goldenCoins

}