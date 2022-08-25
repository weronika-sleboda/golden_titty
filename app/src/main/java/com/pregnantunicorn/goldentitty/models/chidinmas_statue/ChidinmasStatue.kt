package com.pregnantunicorn.goldentitty.models.chidinmas_statue

class ChidinmasStatue {

    companion object {

        private var emeraldInserted = false
        private var sapphireInserted = false
        private var rubyInserted = false
    }

    fun emeraldInserted() = emeraldInserted
    fun sapphireInserted() = sapphireInserted
    fun rubyInserted() = rubyInserted

    fun insertRuby() {

        rubyInserted = true
    }

    fun insertSapphire() {

        sapphireInserted = true
    }

    fun insertEmerald() {

        emeraldInserted = true
    }

    fun puzzleIsSolved() = emeraldInserted && rubyInserted && sapphireInserted
}