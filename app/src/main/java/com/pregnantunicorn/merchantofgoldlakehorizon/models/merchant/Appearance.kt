package com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant

import com.pregnantunicorn.merchantofgoldlakehorizon.R

class Appearance {

    private var icon = R.drawable.meteor64_white_robe
    fun icon() = icon

    fun changeAppearance(icon: Int) {

        this.icon = icon
    }
}