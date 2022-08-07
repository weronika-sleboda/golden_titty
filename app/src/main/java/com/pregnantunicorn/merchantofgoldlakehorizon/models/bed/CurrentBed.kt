package com.pregnantunicorn.merchantofgoldlakehorizon.models.bed

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory

object CurrentBed {

    private fun sleepingBag(): Bed {

        return Bed({ IconFactory().sleepingBag128() }, 3)
    }

    private fun tavernBed(): Bed {

        return Bed({ IconFactory().bed128() }, 1)
    }

    private var bed: Bed = sleepingBag()
    fun bed() = bed

    fun changeBed(bedType: BedType) {

        bed = when(bedType) {

            BedType.TAVERN_BED -> tavernBed()
            BedType.SLEEPING_BAG -> sleepingBag()
        }
    }
}