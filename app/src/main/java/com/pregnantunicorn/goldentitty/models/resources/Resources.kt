package com.pregnantunicorn.goldentitty.models.resources

object Resources {

    private var iron = Resource()
    private var wood = Resource()

    fun iron() = iron
    fun wood() = wood

    fun reset() {

        iron.reset()
        wood.reset()
    }

    fun load(iron: Int, wood: Int) {

        this.iron.load(iron)
        this.wood.load(wood)
    }
}