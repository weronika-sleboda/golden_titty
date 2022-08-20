package com.pregnantunicorn.merchantofgoldlakehorizon.models.temple_floors

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.hand_state.CurrentHandState
import com.pregnantunicorn.merchantofgoldlakehorizon.models.hand_state.HandState
import com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items.CurrentKeyItem
import com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items.KeyItem
import com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items.KeyItemType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.ActionFragment

class TempleFloor(
    val name: String,
    private val templeFloorName: TempleFloorName,
    private val requiredKeyItem: KeyItemType
)
{
    fun state(): String {

        return if(isConquered) { "Conquered" }

        else { "Unbeaten"}
    }

    private var isConquered = false
    fun isConquered() = isConquered

    private var isLocked = true
    fun isLocked() = isLocked

    fun conquer() {

        isConquered = true
    }

    val icon = IconFactory().pearlTittyDoor128()

    fun open(fragmentActivity: FragmentActivity): Boolean {

        if(CurrentHandState.handState() == HandState.KEY_ITEM
            && CurrentKeyItem.keyItemType() == requiredKeyItem) {

            CurrentTempleFloor.changeFloor(templeFloorName)

            fragmentActivity.supportFragmentManager.commit {

                replace<ActionFragment>(R.id.world_container)
            }

            return true
        }

        CurrentMessage.changeMessage(
            "Locked",
            R.drawable.padlock64,
            "The door is locked. You need to have a key."
        )

        return false
    }
}