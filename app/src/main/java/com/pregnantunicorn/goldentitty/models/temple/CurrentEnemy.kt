package com.pregnantunicorn.goldentitty.models.temple

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory

object CurrentEnemy {

    private val donutTheDragon = Enemy(R.drawable.donut_the_dragon, "Donut The Dragon", 5, 1)
    private val sentino = Enemy(R.drawable.sentino64, "Sentino", 10, 2)
    private val darkRider = Enemy(R.drawable.dark_rider64, "Dark Rider", 15, 3)

    fun donut() = donutTheDragon
    fun sentino() = sentino
    fun darkRider() = darkRider

    private var enemyName = EnemyName.DONUT_THE_DRAGON
    fun enemyName() = enemyName

    fun enemy(): Enemy {

        return when(enemyName) {

            EnemyName.DONUT_THE_DRAGON-> donutTheDragon
            EnemyName.SENTINO -> sentino
            EnemyName.DARK_RIDER-> darkRider
        }
    }

    fun changeEnemyName(enemyName: EnemyName) {

        this.enemyName = enemyName
    }

    fun load(
        enemyName: EnemyName,
        donutHealth: Int,
        sentinoHealth: Int,
        darkRiderHealth: Int)
    {

        this.enemyName = enemyName
        this.donutTheDragon.load(donutHealth)
        this.sentino.load(sentinoHealth)
        this.darkRider.load(darkRiderHealth)
    }

    fun reset() {

        donutTheDragon.reset()
        sentino.reset()
        darkRider.reset()
    }
}