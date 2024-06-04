package com.example.systemdesign

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.SuspensionTypes

class MountainBike : Bicycle(
    modelName = "Palo Duro Canyon Ranger",
    suspension = SuspensionTypes.Full,
    color = BicyclePaintColors.Black,
    geometry = BicycleGeometries.Upright

)
