package com.example.systemdesign.abstractf

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.ManufacturingStatus
import com.example.systemdesign.enums.SuspensionTypes

class RoadBikeFrame(
    override var modelName: String,
    override val year: Int = 0 ,
    override val serialNumber: String = "",
    override var geometry: BicycleGeometries ,
    override var color: BicyclePaintColors,
    override var suspension: SuspensionTypes,
    override var buildStatus: ManufacturingStatus = ManufacturingStatus.Specified
) : Frame() {
    override fun build() {
        println("Model Name: $modelName year: $year serialNumber: $serialNumber" )
    }
}