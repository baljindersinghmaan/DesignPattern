package com.example.systemdesign

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.SuspensionTypes

class Cruiser(
    override var geometry: BicycleGeometries,
    override var color: BicyclePaintColors,
    override var suspension: SuspensionTypes
) : Bicycle (
    modelName = "Galven Cruiser",

) {
    override fun build() {
        TODO("Not yet implemented")
    }
}