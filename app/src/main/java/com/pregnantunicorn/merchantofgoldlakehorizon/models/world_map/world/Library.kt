package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.books.BookcaseType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class Library : Location(
    "Library", Array(12) { EmptyCaveTile() as Tile }.also {

        it[0] = BookcaseTile(BookcaseType.HISTORY)
        it[1] = BookcaseTile(BookcaseType.TECHNOLOGY)
        it[2] = BookcaseTile(BookcaseType.FOREIGN)
        it[3] = BookcaseTile(BookcaseType.RELIGION)

        it[10] = PearlCoastExitTile(
            { IconFactory().houseDoor64() },
            { BackgroundFactory().volcano() }
        )
    }
)