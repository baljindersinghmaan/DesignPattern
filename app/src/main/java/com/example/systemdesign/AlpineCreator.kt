package com.example.systemdesign

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.SuspensionTypes

class AlpineCreator : BicycleCreator() {
    override fun createProduct(modelName: String): IBicycle {
        return when (modelName.toLowerCase()) {
            "palo duro canyon ranger" -> MountainBike(
                geometry = BicycleGeometries.Upright,
                color = BicyclePaintColors.White,
                suspension = SuspensionTypes.Full
            )

            "galveston cruiser" -> Cruiser(
                suspension = SuspensionTypes.Hardtail,
                color = BicyclePaintColors.Red,
                geometry = BicycleGeometries.Upright
            )
            else -> throw Exception("Invalid bicycle model")
        }
    }
}
