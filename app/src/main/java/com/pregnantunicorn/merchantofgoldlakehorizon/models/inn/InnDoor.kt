package com.pregnantunicorn.merchantofgoldlakehorizon.models.inn

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class InnDoor(
    val name: String,
    val icon: () -> Int,
    val info: String,
    private val price: Int,
    private val bedType: BedType
)
{
    fun priceToString() = "$price"

    fun enter(): Boolean {

        if(Merchant.goldCoins().hasAmount(price)) {

            Merchant.goldCoins().loseAmount(price)
            CurrentBed.changeBed(bedType)
            return true
        }

        CurrentMessage.changeMessage(
            "Too Expensive",
            R.drawable.golden_coin_64,
            "You don't have enough gold coins."
        )

        return false
    }
}