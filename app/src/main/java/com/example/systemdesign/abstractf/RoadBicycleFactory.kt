package com.example.systemdesign.abstractf

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.SuspensionTypes

class RoadBicycleFactory : IBicycleFactory {
    override fun createBicycleFrame(): IFrame {
        return RoadBikeFrame(

        )
    }

    override fun createBicycleHandlebars(): IHandlebars {
        TODO("Not yet implemented")
    }
}