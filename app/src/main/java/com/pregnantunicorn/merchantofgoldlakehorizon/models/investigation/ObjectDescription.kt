package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

class ObjectDescription(
    private var name: String,
    private var icon: () -> Int,
    private var info: String,
    private val newName: String,
    private val newIcon: () -> Int,
    private val newInfo: String,
)
{

    private val oldName = name
    private val oldIcon = icon

    private var buttonText: String = "Investigate"

    fun name() = name
    fun icon() = icon
    fun info() = info
    fun buttonText() = buttonText

    fun changeDescription() {

        name = newName
        info = newInfo
        icon = newIcon
        buttonText = "Take"
    }

    fun changeInfo() {

        name = oldName
        icon = oldIcon
        info = "There is nothing of value here..."
    }
}