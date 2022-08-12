package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

object Player {

    private var health = Status()
    private var accuracy = Status()
    private var agility = Status()
    private var stealth = Status()

    private var dates = Resource()
    private var coconuts = Resource()
    private var peaches = Resource()

    private var tittyCounter = TittyCounter()
    private var goldCoins = Money()

    fun isDead() = health.amountIsZero()
    fun health() = health
    fun accuracy() = accuracy
    fun agility() = agility
    fun stealth() = stealth

    fun dates() = dates
    fun coconuts() = coconuts
    fun peaches() = peaches
    fun goldCoins() = goldCoins
    fun tittyCounter() = tittyCounter

}