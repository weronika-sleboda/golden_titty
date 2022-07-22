package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

class Hourglass {

    private var deadline = 90
    private var dayCycleNumber = 1

    fun dayCycleNumberToString() = "$dayCycleNumber"

    fun nextDayCycle() {

        dayCycleNumber++

        if(dayCycleNumber > deadline) {

            dayCycleNumber = deadline
        }
    }
}