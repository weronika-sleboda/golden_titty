package com.pregnantunicorn.merchantofgoldlakehorizon.models.construction

object CurrentBuilding {

    private var buildingType = BuildingType.WORKSHOP

    fun changeBuildingType(buildingType: BuildingType) {

        this.buildingType = buildingType
    }

    fun building(): Building {

        return Buildings.building(buildingType)
    }
}