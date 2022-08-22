package com.pregnantunicorn.merchantofgoldlakehorizon.models.tools

import com.pregnantunicorn.merchantofgoldlakehorizon.R
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

            HandState.BOOMERANG -> { CurrentBoomerang.boomerang().icon() }

            HandState.HAMMER -> { CurrentHammer.hammer().icon() }

            HandState.AXE -> { CurrentAxe.axe().icon() }

            else -> { CurrentKeyItem.keyItem().icon }
        }
    }
}