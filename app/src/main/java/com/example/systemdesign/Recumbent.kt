package com.example.systemdesign

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.SuspensionTypes

class Recumbent(
    override var geometry: BicycleGeometries,
    override var color: BicyclePaintColors,
    override var suspension: SuspensionTypes
) : Bicycle(
    modelName = "Big Bend",

) {
    override fun build() {
        print("Building recumbent bike")
    }
}