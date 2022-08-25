package com.pregnantunicorn.goldentitty.models.death

object DeathReason {

    private var gameOverCause: GameOverCause = GameOverCause.HUNGRY_METEOR

    fun deathReason(): String {

        return when(gameOverCause) {

            GameOverCause.HUNGRY_METEOR -> "You died from hunger..."
            GameOverCause.HUNGRY_JIN -> "Jin died form hunger..."
            GameOverCause.HUNGRY_SAPHONEE -> "Saphonee died from hunger..."
            GameOverCause.METEOR_KILLED -> "You have been killed by the enemy..."
            GameOverCause.SAPHONEE_JIN_HUNGRY -> "Your colleagues died from hunger..."
            GameOverCause.EVERYONE_HUNGRY -> "Everyone is dead..."
        }
    }

    fun changeGameOverCause(gameOverCause: GameOverCause) {

        this.gameOverCause = gameOverCause
    }
}