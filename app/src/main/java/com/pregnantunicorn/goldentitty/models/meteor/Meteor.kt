package com.pregnantunicorn.goldentitty.models.meteor

object Meteor {

    private var health = BodyCondition()
    private var energy = BodyCondition()

    fun isDead() = health.amountIsZero()

    fun health() = health
    fun energy() = energy



    fun reset() {

        health.reset()
        energy.reset()
    }

    fun loadStatus(
        health: Int,
        energy: Int,
    )
    {
        this.health.load(health)
        this.energy.load(energy)
    }
}