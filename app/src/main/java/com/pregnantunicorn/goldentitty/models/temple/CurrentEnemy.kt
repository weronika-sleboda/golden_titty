package com.pregnantunicorn.goldentitty.models.temple

import com.pregnantunicorn.goldentitty.models.graphics.IconFactory

object CurrentEnemy {

    private fun pasha() = Enemy(IconFactory().pasha64(), "Pasha", 10, 1)
    private fun sentino() = Enemy(IconFactory().sentino64(), "Sentino", 20, 2)
    private fun darkRider() = Enemy(IconFactory().darkRider64(), "Dark Rider", 30, 3)

    private var enemyName = EnemyName.PASHA

    fun enemy(): Enemy {

        return when(enemyName) {

            EnemyName.PASHA -> pasha()
            EnemyName.SENTINO -> sentino()
            EnemyName.DARK_RIDER -> darkRider()
        }
    }

    fun changeEnemyName(enemyName: EnemyName) {

        this.enemyName = enemyName
    }
}