package com.pregnantunicorn.merchantofgoldlakehorizon.models.doors

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

object CurrentInnDoor {

    private fun goldenPalaceDoor(): InnDoor {

        return InnDoor(
            "Golden Palace",
            "This is the place where you can rent a bedroom at morning and sunset and restore your status.",
            "Closed At Night",
            { IconFactory().goldenDoor128() },
            25
        )
    }

    private fun campEntrance(): InnDoor {

        return InnDoor(
            "Camp",
            "This is the place where you can rent a bedroom at night and restore your status.",
            "Open At Night",
            { IconFactory().tent128() },
            25
        )
    }

    private var paidDoor = goldenPalaceDoor()
    fun paidDoor() = paidDoor

    fun changeToGoldenPalaceDoor() {

        paidDoor = goldenPalaceDoor()
    }

    fun changeToCampEntrance() {

        paidDoor = campEntrance()
    }
}