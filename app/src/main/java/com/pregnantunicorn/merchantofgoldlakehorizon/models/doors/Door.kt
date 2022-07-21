package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit

abstract class Door(
    val buildingName: String,
    val buildingInfo: String,
    val closingInfo: String
)
{
    abstract fun icon(): Int
    abstract fun open(activity: FragmentActivity)
}
