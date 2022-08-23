package com.pregnantunicorn.goldentitty.models.grab_objects

class GrabObject(
    val name: String,
    val icon: Int,
    val info: String,
    private val grabAlgorithm: () -> Unit,
)
{

    private var isLooted = false
    fun isLooted() = isLooted

    fun grab() {

        grabAlgorithm.invoke()
        isLooted = true
    }
}