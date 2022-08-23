package com.pregnantunicorn.goldentitty.models.workshop

import com.pregnantunicorn.goldentitty.models.tools.Tools

class Workshop {

    fun blueprints(): List<Blueprint> {

        val blueprints = mutableListOf<Blueprint>()

        for(tool in Tools.tools) {

            if(!tool.owns()) {

                blueprints.add(Blueprint(tool))
            }
        }

        return blueprints
    }
}