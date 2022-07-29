package com.pregnantunicorn.merchantofgoldlakehorizon.models.robes

class RobeManager {

    fun robes(): List<Robe> {

        val robes= mutableListOf<Robe>()

        for(robe in RobeCloset.robes) {

            if(robe.owns()) {

                robes.add(robe)
            }
        }

        return robes
    }
}