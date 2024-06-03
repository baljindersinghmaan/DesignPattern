package com.example.systemdesign

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.ManufacturingStatus
import com.example.systemdesign.enums.SuspensionTypes
import java.time.LocalDate
import java.util.UUID

class RoadBike(
    override var geometry: BicycleGeometries,
    override var color: BicyclePaintColors,
    override var suspension: SuspensionTypes
) : Bicycle(
    modelName = "Hillcrest",
) {
    override fun build() {
        println("Building road bike")
    }
}
