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
    val name: String,
    val icon: () -> Int,
    private val whatHappenedInfo: String,
    private val investigation: Investigation,
    private val requiredIntelligence: Int,

)
{
    private var isInvestigated = false
    fun isInvestigated() = isInvestigated
    private var info = "???"

    fun info() = info

    fun requiredIntelligenceToString() = "$requiredIntelligence"

    fun investigate(context: Context, activity: FragmentActivity): Boolean {

        if(Merchant.intelligence().hasAmount(requiredIntelligence)) {

            CoroutineScope(Dispatchers.IO).launch {

                Merchant.intelligence().loseAmount(requiredIntelligence)
                info = whatHappenedInfo
                isInvestigated = true

                withContext(Dispatchers.Main) {

                    investigation.execute(context, activity)
                    return@withContext
                }
            }

            return true
        }

        else {

            return false
        }
    }

    fun dialogMessage(): DialogMessage {

        return DialogMessage(
            "No Intelligence",
            R.drawable.intelligence64,
            "You don't have enough intelligence to do investigation."
        )
    }
}