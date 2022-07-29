package com.pregnantunicorn.merchantofgoldlakehorizon.models.souls

import com.pregnantunicorn.merchantofgoldlakehorizon.R

object SoulManager {

    const val KHAN = 0
    const val NIKITA = 1
    const val PASHA = 2
    const val AALIYAH = 3
    const val ERICA = 4
    const val JORDAN = 5

    val souls = arrayOf(

        Soul("Khan", "Info: Local bandit", R.drawable.khan64),
        Soul("Nikita", "Info: Heretic", R.drawable.nikita64),
        Soul("Pasha", "Info: Heretic priest", R.drawable.pasha64),
        Soul("Aaliyah", "Info: Tourist ", R.drawable.aaliyah64),
        Soul("Erica","Info: Former friend", R.drawable.erica64),
        Soul("Jordan", "Info: Local artist", R.drawable.jordan64)
    )

    fun rescueSoul(soulName: SoulName)  {

        when(soulName) {

            SoulName.KHAN -> souls[KHAN].rescue()
            SoulName.AALIYAH -> souls[AALIYAH].rescue()
            SoulName.ERICA -> souls[ERICA].rescue()
            SoulName.JORDAN -> souls[JORDAN].rescue()
            SoulName.NIKITA -> souls[NIKITA].rescue()
            SoulName.PASHA -> souls[PASHA].rescue()
        }
    }
}