package com.pregnantunicorn.merchantofgoldlakehorizon.models.rent

object RentTime {

    private var counter = 1
    private var timeToPay = false

    fun timeToPay() = timeToPay

    fun counterToString() = "$counter"

    fun raiseCounter() {

        if(counter == 1) {

            timeToPay = false
        }

        counter++

        if(counter == 7) {

            counter = 1
            timeToPay = true
        }
    }
}