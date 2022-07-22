package com.pregnantunicorn.merchantofgoldlakehorizon.models.rent

object RentTime {

    private var counter = 1
    private var timeToPay = false

    fun timeToPay() = timeToPay

    fun raiseCounter() {

        counter++

        if(counter == 7) {

            counter = 1
            timeToPay = true
        }
    }
}