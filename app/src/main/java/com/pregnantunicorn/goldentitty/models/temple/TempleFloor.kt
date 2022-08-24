package com.pregnantunicorn.goldentitty.models.temple

import com.pregnantunicorn.goldentitty.models.key_items.CurrentKeyItem
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType
import com.pregnantunicorn.goldentitty.models.key_items.KeyItems
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage

class TempleFloor(
    val name: String,
    private val keyItemType: KeyItemType,
    private val reward: KeyItemType,
    private val rewardIcon: Int,
    private val rewardName: String,
)
{

    private var conquered = false
    fun conquered() = conquered

    fun state(): String {

        return if(conquered) {

            "State: Conquered"
        }

        else {

            "State: Unbeaten"
        }
    }

    fun open(): Boolean {

        if(CurrentKeyItem.keyItemType() == keyItemType) {

            return true
        }

        return false
    }

    fun beat() {

        CurrentMessage.changeMessage(
            "$rewardName acquired",
            rewardIcon,
            "The enemy dropped a key item."
        )

        KeyItems.getKeyItem(keyItemType).add()
    }
}