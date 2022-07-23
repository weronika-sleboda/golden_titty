package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

import android.content.Context
import androidx.fragment.app.FragmentActivity

interface Investigation {

    fun execute(context: Context, activity: FragmentActivity)
}