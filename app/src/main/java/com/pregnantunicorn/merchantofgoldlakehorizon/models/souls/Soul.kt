package com.pregnantunicorn.merchantofgoldlakehorizon.models.souls

class Soul(
    val name: String,
    val info: String,
    val icon: Int,
)
{

    private var isRescued = false
    fun isRescued() = isRescued

    fun rescue() {

        isRescued = true
    }
}