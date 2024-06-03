package com.example.systemdesign

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.SuspensionTypes

class Cruiser : Bicycle (
    modelName = "Galven Cruiser",
    suspension = SuspensionTypes.Hardtail,
    color = BicyclePaintColors.Red,
    geometry = BicycleGeometries.Upright
)