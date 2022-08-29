package com.pregnantunicorn.goldentitty.models.temple

import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.key_items.CurrentKeyItem
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType
import com.pregnantunicorn.goldentitty.models.key_items.KeyItems
import com.pregnantunicorn.goldentitty.models.message.CurrentMessage
import com.pregnantunicorn.goldentitty.models.story_line.Event
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.tools.CurrentHandState
import com.pregnantunicorn.goldentitty.models.tools.HandState

class TempleFloor(
    val name: String,
    private val keyItemType: KeyItemType,
    private val reward: KeyItemType,
    private val rewardIcon: Int,
    private val rewardName: String,
    private val enemyName: EnemyName,
    private val templeFloorNumber: TempleFloorNumber,
    val eventOpening: Event,
    val eventDeath: Event,
    val eventEnding: Event,
    val eventOpeningTitle: EventTitle,
    val eventEndingTitle: EventTitle
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

        if(CurrentHandState.handState() == HandState.KEY_ITEM &&
            CurrentKeyItem.keyItemType() == keyItemType) {

            TempleFloors.changeTempleFloor(templeFloorNumber)
            CurrentEnemy.changeEnemyName(enemyName)
            return true
        }

        CurrentMessage.changeMessage(
            "Locked",
            IconFactory().padlock64(),
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

        conquered = true
        KeyItems.getKeyItem(reward).add()
    }

    fun reset() {

        conquered = false
    }

    fun load(conquered: Boolean) {

        this.conquered = conquered
    }
}