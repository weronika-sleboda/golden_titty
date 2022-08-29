package com.pregnantunicorn.goldentitty.models.construction

object CurrentBuilding {

    private var buildingType = BuildingType.WORKSHOP
    fun buildingType() = buildingType

    fun changeBuildingType(buildingType: BuildingType) {

        this.buildingType = buildingType
    }

    fun building(): Building {

        return Buildings.building(buildingType)
    }

    fun load(buildingType: BuildingType) {

        this.buildingType = buildingType
    }
}