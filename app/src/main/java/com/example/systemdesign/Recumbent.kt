package com.example.systemdesign

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.SuspensionTypes

class Recumbent: Bicycle(
    modelName = "Big Bend",
    suspension = SuspensionTypes.Front,
    color = BicyclePaintColors.White,
    geometry = BicycleGeometries.Recumbent
)