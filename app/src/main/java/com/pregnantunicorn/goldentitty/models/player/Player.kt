package com.pregnantunicorn.goldentitty.models.player

object Player {

    private var health = Status()
    private var energy = Status()
    private var iron = Resource()
    private var wood = Resource()

    fun isDead() = health.amountIsZero()

    fun health() = health
    fun energy() = energy
    fun iron() = iron
    fun wood() = wood

    fun reset() {

        health = Status()
        energy = Status()
        iron = Resource()
        wood = Resource()
    }

    fun setStatus(
        health: Status,
        energy: Status,
        iron: Resource,
        wood: Resource,
    )
    {
        this.health = health
        this.energy = energy
        this.iron = iron
        this.wood = wood
    }
}