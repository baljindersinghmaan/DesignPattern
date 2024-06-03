package com.example.systemdesign

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.ManufacturingStatus
import com.example.systemdesign.enums.SuspensionTypes

class MountainBike(
    override var geometry: BicycleGeometries,
    override var color: BicyclePaintColors,
    override var suspension: SuspensionTypes
) : Bicycle(
    modelName = "Palo Duro Canyon Ranger",

) {
    override fun build() {
        buildStatus = ManufacturingStatus.FrameManufactured
        println("Building mountain bike")
    }
}