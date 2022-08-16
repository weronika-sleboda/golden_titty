package com.pregnantunicorn.merchantofgoldlakehorizon.models.hand_state

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs.CurrentBoomerang
import com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items.CurrentKeyItem

object CurrentHandState {

    private var handState = HandState.EMPTY
    fun handState() = handState

    fun changeHandState(newHandState: HandState) {

        handState = newHandState
    }

    fun fabIcon(): Int  {

        return when(handState) {

            HandState.EMPTY -> R.drawable.grab64

            HandState.BOOMERANG  -> { CurrentBoomerang.boomerang().icon }

            else -> { CurrentKeyItem.keyItem().icon }
        }
    }
}