package com.pregnantunicorn.merchantofgoldlakehorizon.models.player

object Player {

    private var health = Status()
    private var accuracy = Status()
    private var agility = Status()
    private var stealth = Status()

    private var stone = Resource()
    private var wood = Resource()

    private var dates = Resource()
    private var coconuts = Resource()
    private var peaches = Resource()
    private var cappuccino = Resource()
    private var smoothie = Resource()
    private var herbalTea = Resource()


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

    fun stone() = stone
    fun wood() = wood
}