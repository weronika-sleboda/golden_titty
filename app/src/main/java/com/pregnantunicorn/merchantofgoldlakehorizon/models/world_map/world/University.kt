package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.world

import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.skill_upgrade.CurrentSkillManager
import com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles.*

class University : Location(
    "University", Array(12) { EmptyBlueTile() as Tile }.also {

        it[0] = UniversityDeskTile(CurrentSkillManager.ENERGY)
        it[1] = UniversityDeskTile(CurrentSkillManager.PERSUASION)
        it[2] = UniversityDeskTile(CurrentSkillManager.CHARISMA)
        it[3] = UniversityDeskTile(CurrentSkillManager.INTELLIGENCE)

        it[10] = PearlCoastExitTile(
            { IconFactory().houseDoor64() },
            { BackgroundFactory().blueCarpet() }
        )
    }
)