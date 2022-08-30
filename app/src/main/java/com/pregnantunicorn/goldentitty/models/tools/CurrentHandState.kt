package com.pregnantunicorn.goldentitty.models.tools

import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.key_items.CurrentKeyItem

object CurrentHandState {

    private var handState = HandState.EMPTY
    fun handState() = handState

    fun changeHandState(newHandState: HandState) {

        handState = newHandState
    }

    fun fabIcon(): Int  {

        return when(handState) {

            HandState.EMPTY -> IconFactory().emptyHand64()

            HandState.BOOMERANG -> { CurrentBoomerang.boomerang().icon() }

            HandState.HAMMER -> { CurrentHammer.hammer().icon() }

            HandState.AXE -> { CurrentAxe.axe().icon() }

            HandState.SPEAR -> { CurrentSpear.spear().icon() }

            HandState.KNIFE -> { IconFactory().knife64()}

            HandState.SHOVEL -> { IconFactory().shovel64() }

            HandState.SWORD -> { CurrentSword.sword().icon() }

            else -> { CurrentKeyItem.keyItem().icon }
        }
    }

    fun load(currentHandState: HandState) {

        this.handState = currentHandState
    }

    fun reset() {

        handState = HandState.EMPTY
    }
}