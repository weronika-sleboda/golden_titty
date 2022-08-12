package com.pregnantunicorn.merchantofgoldlakehorizon.models.entrances

import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Player
import com.pregnantunicorn.merchantofgoldlakehorizon.models.message.CurrentMessage

class Entrance(
    val name: String,
    val icon: () -> Int,
    val info: String,
    val buttonText: String,
    private var lockAlgorithm: () -> Boolean,
    private val enterAlgorithm: (FragmentActivity) -> Unit
)
{

    fun enter(activity: FragmentActivity): Boolean {

        if(lockAlgorithm.invoke()) {

            enterAlgorithm.invoke(activity)
            return true
        }

        return false
    }
}