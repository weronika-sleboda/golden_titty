package com.pregnantunicorn.merchantofgoldlakehorizon.models.player

object Player {

    private var health = Status()
    private var accuracy = Status()
    private var agility = Status()
    private var stealth = Status()

    private var dates = Resource()
    private var coconuts = Resource()
    private var peaches = Resource()
    private var cappuccino = Resource()
    private var smoothie = Resource()
    private var herbalTea = Resource()

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
    fun cappuccino() = cappuccino
    fun smoothie() = smoothie
    fun herbalTea() = herbalTea

    fun goldCoins() = goldCoins
    fun tittyCounter() = tittyCounter

}