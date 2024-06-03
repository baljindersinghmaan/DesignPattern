package com.example.systemdesign

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.SuspensionTypes

class DallasCreator : BicycleCreator() {
    override fun createProduct(modelName: String): IBicycle {
        return when (modelName.toLowerCase()) {
            "hillcrest" -> RoadBike(color = BicyclePaintColors.Blue,
                geometry = BicycleGeometries.Upright,
                suspension = SuspensionTypes.Hardtail,)
            "big bend" -> Recumbent(suspension = SuspensionTypes.Front,
                color = BicyclePaintColors.White,
                geometry = BicycleGeometries.Recumbent)
            else -> throw Exception("Invalid bicycle model")
        }
    }
}
