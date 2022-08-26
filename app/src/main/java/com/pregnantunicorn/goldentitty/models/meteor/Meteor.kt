package com.pregnantunicorn.goldentitty.models.meteor

import com.pregnantunicorn.goldentitty.models.resources.Resource

object Meteor {

    private var health = BodyCondition()
    private var energy = BodyCondition()

    fun isDead() = health.amountIsZero()

    fun health() = health
    fun energy() = energy



    fun reset() {

        health = BodyCondition()
        energy = BodyCondition()
    }

    fun setStatus(
        health: BodyCondition,
        energy: BodyCondition,
    )
    {
        this.health = health
        this.energy = energy
    }
}