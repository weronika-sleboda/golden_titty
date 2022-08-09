package com.pregnantunicorn.merchantofgoldlakehorizon.models.cave

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.ResourceUpdateType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class GemSupplier(
    val icon: Int,
    val name: String,
    val info: String,
    val resourceUpdateType: ResourceUpdateType,
    private val algorithm: () -> Unit
)
{

    fun dig(): Boolean {

        val energy = 1

        if(Merchant.energy().hasAmount(energy)) {

            Merchant.energy().loseAmount(energy)
            algorithm.invoke()
            return true
        }

        CurrentMessage.changeMessage(
            "No Energy",
            R.drawable.energy64,
            "You have run out of energy."
        )

        return false
    }

}