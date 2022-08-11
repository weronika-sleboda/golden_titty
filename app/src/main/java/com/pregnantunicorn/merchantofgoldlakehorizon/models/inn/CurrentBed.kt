package com.pregnantunicorn.merchantofgoldlakehorizon.models.inn

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

object CurrentBed {

    private fun sleepingBag(): Bed {

        return Bed({ IconFactory().sleepingBag128() }, 1)
    }

    private fun doubleBed(): Bed {

        return Bed({ IconFactory().bed128() }, 0)
    }

    private var bed: Bed = sleepingBag()
    fun bed() = bed

    fun changeBed(bedType: BedType) {

        bed = when(bedType) {

            BedType.DOUBLE_BED -> doubleBed()
            BedType.SLEEPING_BAG -> sleepingBag()
        }
    }
}