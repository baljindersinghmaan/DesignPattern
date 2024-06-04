package com.example.systemdesign.abstractf

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.ManufacturingStatus
import com.example.systemdesign.enums.SuspensionTypes

class MountainBikeFrame(



) : Frame() {
    override var modelName: String = "Palo Duro Canyon Ranger"

    override val year: Int = 2021
    override val serialNumber: String =""
    override var geometry: BicycleGeometries
        get() = TODO("Not yet implemented")
        set(value) {}
    override var color: BicyclePaintColors
        get() = TODO("Not yet implemented")
        set(value) {}
    override var suspension: SuspensionTypes
        get() = TODO("Not yet implemented")
        set(value) {}
    override var buildStatus: ManufacturingStatus
        get() = TODO("Not yet implemented")
        set(value) {}


    override fun build() {
        println("Model Name: $modelName year: $year serialNumber: $serialNumber" )
    }
}