package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

class Friend(val name: String)
{
    private var friendship = 0
    private var counter = 0
    private var friendAdded = false

    fun friendship() = friendship

    fun friendshipToString() = "$friendship"

    fun raiseFriendship() {

        val maxValue = 8

        friendship++

        if(friendship == maxValue) {

            Merchant.friendCounter().addFriend()
            friendAdded = true

        }

        if(friendship > maxValue) {

            friendship = maxValue
        }

    }

    fun friendHasBeenAdded() = friendAdded
}