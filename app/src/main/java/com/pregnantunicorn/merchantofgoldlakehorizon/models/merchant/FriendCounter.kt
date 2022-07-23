package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world.CurrentMap

class FriendCounter {

    private var friends = 0
    private val maxFriends = 14

    fun friendsToString() = "$friends"

    fun addFriend() {

        friends++

        if(friends == maxFriends) {

            CurrentMap.revealDivineGate()
        }

        if(friends > maxFriends) {

            friends = maxFriends
        }
    }
}