package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

import android.content.Context
import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.dialog_messages.DialogMessage
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class InvestigationObject(
    private val requiredIntelligence: Int,
    private val objectDescription: ObjectDescription,
    private val algorithm: () -> Unit,
)
{
    private var isInvestigated = false
    fun isInvestigated() = isInvestigated

    private var isEmpty = false
    fun isEmpty() = isEmpty

    fun name() = objectDescription.name()
    fun icon() = objectDescription.icon().invoke()
    fun info() = objectDescription.info()
    fun buttonText() = objectDescription.buttonText()

    fun requiredIntelligenceToString() = "$requiredIntelligence"

    private var counter = 0

    fun investigate(): Boolean {

        if(counter == 1) {

            objectDescription.changeInfo()
            algorithm.invoke()
            isEmpty = true
            return true
        }

        if(Merchant.intelligence().hasAmount(requiredIntelligence) && counter == 0) {

            Merchant.intelligence().loseAmount(requiredIntelligence)
            objectDescription.changeDescription()
            isInvestigated = true
            counter++
            return true
        }

        return false
    }

    fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "No Intelligence",
            R.drawable.intelligence64,
            "You don't have enough intelligence to do investigation."
        )
    }
}