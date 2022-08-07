package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

import com.pregnantunicorn.merchantofgoldlakehorizon.models.items.ItemBackpack

object Merchant {

    private var energy = Status()
    private var health = Status()
    private var charisma = Status()
    private var intelligence = Status()
    private var emerald = Gem()
    private var sapphire = Gem()
    private var ruby = Gem()
    private var items = ItemBackpack()

    private var foodBackpack = FoodBackpack()
    private var appearance = Appearance()
    private var friends = Friends()
    private var goldenCoins = Money()

    fun isDead() = health.amountIsZero()

    fun health() = health
    fun energy() = energy
    fun charisma() = charisma
    fun intelligence() = intelligence

    fun emerald() = emerald
    fun sapphire() = sapphire
    fun ruby() = ruby

    fun food() = foodBackpack.foods
    fun appearance() = appearance
    fun friends() = friends.friends

    fun items() = items.items

    fun goldenCoins() = goldenCoins

}