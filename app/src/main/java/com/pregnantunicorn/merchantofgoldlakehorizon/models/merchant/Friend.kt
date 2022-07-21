package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

class Friend(val name: String)
{
    private var friendship = 0
    private var counter = 0

    fun friendship() = friendship

    fun friendshipToString() = "$friendship"

    fun raiseFriendship() {

        val maxValue = 8

        if(friendship < maxValue) {

            counter++

            if(counter == 50) {

                friendship++

                counter = 0
            }
        }
    }
}