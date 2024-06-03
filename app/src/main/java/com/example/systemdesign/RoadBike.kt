package com.example.systemdesign

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.ManufacturingStatus
import com.example.systemdesign.enums.SuspensionTypes
import java.time.LocalDate
import java.util.UUID

class RoadBike : Bicycle(
    modelName = "Hillcrest",
    color = BicyclePaintColors.Blue,
    geometry = BicycleGeometries.Upright,
    suspension = SuspensionTypes.Hardtail,
)
