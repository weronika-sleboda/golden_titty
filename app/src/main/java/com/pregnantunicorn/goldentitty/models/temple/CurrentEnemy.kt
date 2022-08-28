package com.pregnantunicorn.goldentitty.models.temple

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory

object CurrentEnemy {

    private val donutTheDragon = Enemy(R.drawable.donut_the_dragon, "Donut The Dragon", 10, 1)
    private val sentino = Enemy(R.drawable.sentino64, "Sentino", 15, 2)
    private val vladimir = Enemy(R.drawable.vladimir64, "Vladimir", 20, 3)

    private var enemyName = EnemyName.DONUT_THE_DRAGON

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
}