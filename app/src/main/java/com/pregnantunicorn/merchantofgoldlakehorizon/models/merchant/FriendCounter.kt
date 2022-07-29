package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

class FriendCounter {

    private var friends = 0
    private val maxFriends = 14

    fun friendsToString() = "$friends"

    fun addFriend() {

        friends++

        if(friends > maxFriends) {

            friends = maxFriends
        }
    }
}