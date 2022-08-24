package com.pregnantunicorn.goldentitty.models.temple

class Enemy(
    val icon: Int,
    val name: String,
    val maxHealth: Int,
    val damage: Int
)
{

    private var health = maxHealth
    fun health() = health

    fun loseHealth(amount: Int) {

        health -= amount

        if(health < 0) {

            health = 0
        }
    }
}