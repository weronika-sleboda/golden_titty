package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.key_items.CurrentKeyItem

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

            HandState.SPEAR -> { CurrentSpear.spear().icon() }

            HandState.KNIFE -> { R.drawable.knife64 }

            HandState.SHOVEL -> { R.drawable.shovel64 }

            HandState.SWORD -> { CurrentSword.sword().icon() }

            else -> { CurrentKeyItem.keyItem().icon }
        }
    }
}