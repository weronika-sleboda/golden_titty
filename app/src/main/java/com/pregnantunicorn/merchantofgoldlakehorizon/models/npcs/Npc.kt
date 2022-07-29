package com.pregnantunicorn.merchantofgoldlakehorizon.models.npcs

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.items.CurrentItem

import com.pregnantunicorn.merchantofgoldlakehorizon.models.items.ItemType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class Npc(
    val name: String,
    val icon: Int,
    private val friendshipToString: () -> String,
    private val npcLine: () -> String,
    private val friendIndex: Int
)
{

    private val friendshipPrice = 1

    fun friendshipToString() = friendshipToString
    fun priceToString() = "$friendshipPrice"

    private var greeting = "Hello!"

    fun greeting(): String {

        return greeting
    }

    fun befriended() = Merchant.friends()[friendIndex].friendHasBeenAdded()

    fun befriend(): Boolean {

        if(Merchant.goldenCoins().hasAmount(friendshipPrice)) {

            Merchant.goldenCoins().loseAmount(friendshipPrice)
            Merchant.friends()[friendIndex].raiseFriendship()

            greeting = when(CurrentItem.item()) {

                ItemType.GEMS -> "Beautiful gems"
                ItemType.LOVE_LETTER -> "For me? Thanks"
                ItemType.NONE -> "Hello"
            }

            return true
        }

        return false
    }

    fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "You're Broke",
            R.drawable.broke64,
            "You don't have enough golden coins to befriend $name."
        )
    }
}