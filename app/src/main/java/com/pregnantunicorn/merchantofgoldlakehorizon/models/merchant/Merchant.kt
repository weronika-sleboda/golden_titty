package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

import com.pregnantunicorn.merchantofgoldlakehorizon.models.items.ItemBackpack

object Merchant {

    private var appearance = Appearance()

    private var energy = Status()
    private var health = Status()
    private var charisma = Status()
    private var intelligence = Status()

    private var dates = Resource()
    private var coconuts = Resource()
    private var peaches = Resource()
    private var items = ItemBackpack()

    private var tittyCounter = TittyCounter()
    private var goldCoins = Money()

    fun isDead() = health.amountIsZero()

    fun health() = health
    fun energy() = energy
    fun charisma() = charisma
    fun intelligence() = intelligence

    fun dates() = dates
    fun coconuts() = coconuts
    fun peaches() = peaches
    fun appearance() = appearance

    fun items() = items.items

    fun goldCoins() = goldCoins
    fun tittyCounter() = tittyCounter

}