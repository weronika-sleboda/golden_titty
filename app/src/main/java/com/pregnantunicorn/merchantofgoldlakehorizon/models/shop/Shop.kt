package com.pregnantunicorn.merchantofgoldlakehorizon.models.shop

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

class Shop(
    val name: String,
    val icon: Int,
    private val price: Int,
    val shopAlgorithm: () -> Unit
)
{

    fun priceToString() = "$price"

    private lateinit var dialogMessage: DialogMessage
    fun dialogMessage() = dialogMessage

    fun buy() {

        if(Merchant.goldenCoins().hasAmount(price)) {

            Merchant.goldenCoins().loseAmount(price)
            shopAlgorithm.invoke()

            dialogMessage = DialogMessage(
                "$name acquired",
                icon,
                "$name has been added to your backpack."
            )
        }

        else {

            dialogMessage = DialogMessage(
                "Too expensive",
                R.drawable.golden_coin_64,
                "You don't have enough golden coins."
            )
        }
    }
}