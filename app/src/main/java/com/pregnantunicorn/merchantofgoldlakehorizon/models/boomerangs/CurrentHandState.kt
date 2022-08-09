package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

import com.pregnantunicorn.merchantofgoldlakehorizon.R

object CurrentHandState {

    private var handState = HandState.EMPTY
    fun handState() = handState

    fun changeHandState(newHandState: HandState) {

        handState = newHandState
    }

    fun fabIcon(): Int  {

        return when(handState) {

            HandState.EMPTY -> R.drawable.grab64

            else  -> { CurrentBoomerang.boomerang().icon }
        }
    }
}