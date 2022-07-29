package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

abstract class ObjectDescription(
    protected var name: String,
    protected var icon: () -> Int,
    protected var info: String,
)
{

    protected var buttonText: String = "Investigate"

    fun name() = name
    fun icon() = icon
    fun info() = info
    fun buttonText() = buttonText

    abstract fun changeDescription()
    abstract fun changeInfo()
}