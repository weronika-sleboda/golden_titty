package com.pregnantunicorn.merchantofgoldlakehorizon.models.boomerangs

class BoomerangManager {

    fun boomerangs(): List<Boomerang> {

        val boomerangs = mutableListOf<Boomerang>()

        for(boomerang in CurrentBoomerang.boomerangs) {

            if(boomerang.owns()) {

                boomerangs.add(boomerang)
            }
        }

        return boomerangs
    }
}