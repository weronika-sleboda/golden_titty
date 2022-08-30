package com.pregnantunicorn.goldentitty.models.temple

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory

object CurrentEnemy {

    private val donutTheDragon = Enemy(R.drawable.donut_the_dragon, "Donut The Dragon", 5, 1)
    private val sentino = Enemy(R.drawable.sentino64, "Sentino", 10, 2)
    private val vladimir = Enemy(R.drawable.vladimir64, "Vladimir", 15, 3)

    fun donut() = donutTheDragon
    fun sentino() = sentino
    fun vladimir() = vladimir

    private var enemyName = EnemyName.DONUT_THE_DRAGON
    fun enemyName() = enemyName

    fun enemy(): Enemy {

        return when(enemyName) {

            EnemyName.DONUT_THE_DRAGON-> donutTheDragon
            EnemyName.SENTINO -> sentino
            EnemyName.VLADIMIR-> vladimir
        }
    }

    fun changeEnemyName(enemyName: EnemyName) {

        this.enemyName = enemyName
    }

    fun load(
        enemyName: EnemyName,
        donutHealth: Int,
        sentinoHealth: Int,
        vladimirHealth: Int)
    {

        this.enemyName = enemyName
        this.donutTheDragon.load(donutHealth)
        this.sentino.load(sentinoHealth)
        this.vladimir.load(vladimirHealth)
    }

    fun reset() {

        donutTheDragon.reset()
        sentino.reset()
        vladimir.reset()
    }
}