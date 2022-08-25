package com.pregnantunicorn.goldentitty.models.temple

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
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
    private val enemyName: EnemyName,
    private val templeFloorNumber: TempleFloorNumber
)
{

    fun icon() = IconFactory().templeDoor64()

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

            TempleFloors.changeTempleFloor(templeFloorNumber)
            CurrentEnemy.changeEnemyName(enemyName)
            return true
        }

        CurrentMessage.changeMessage(
            "Locked",
            R.drawable.padlock64,
            "The door is locked. You need a key."
        )

        return false
    }

    fun beat() {

        CurrentMessage.changeMessage(
            "$rewardName acquired",
            rewardIcon,
            "The enemy dropped a key item."
        )

        KeyItems.getKeyItem(reward).add()
    }
}