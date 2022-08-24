package com.pregnantunicorn.goldentitty.models.tools

class BackpackTools {

    fun tools(): List<Tool> {

        val tools = mutableListOf<Tool>()

        for(tool in Tools.tools()) {

            if(tool.owns()) {

                tools.add(tool)
            }
        }

        return tools
    }
}