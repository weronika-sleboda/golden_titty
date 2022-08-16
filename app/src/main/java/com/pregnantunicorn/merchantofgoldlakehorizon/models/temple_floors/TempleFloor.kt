package com.pregnantunicorn.merchantofgoldlakehorizon.models.temple_floors

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.ActionFragment

class TempleFloor(
    val name: String,
    private val templeFloorName: TempleFloorName
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

    fun unlock() {

        isLocked = false
    }

    fun conquer() {

        isConquered = true
    }

    val icon = IconFactory().pearlTittyDoor128()

    fun open(fragmentActivity: FragmentActivity): Boolean {

        if(!isLocked) {

            CurrentTempleFloor.changeFloor(templeFloorName)

            fragmentActivity.supportFragmentManager.commit {

                replace<ActionFragment>(R.id.world_container)
            }

            return true
        }

        CurrentMessage.changeMessage(
            "Locked",
            R.drawable.padlock64,
            "The door is locked."
        )

        return false
    }
}