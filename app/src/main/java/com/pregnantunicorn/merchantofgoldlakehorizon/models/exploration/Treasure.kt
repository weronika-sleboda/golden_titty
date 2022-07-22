package com.pregnantunicorn.merchantofgoldlakehorizon.models.exploration

import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.GemUpdateType

data class Treasure(
    val name: String,
    val icon: Int,
    val message: String,
    val acquire: () -> Unit,
    val gemUpdateType: GemUpdateType = GemUpdateType.NONE
)
