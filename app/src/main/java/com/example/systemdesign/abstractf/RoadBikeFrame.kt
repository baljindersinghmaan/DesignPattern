package com.example.systemdesign.abstractf

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.ManufacturingStatus
import com.example.systemdesign.enums.SuspensionTypes

class RoadBikeFrame(

) : Frame() {
    override var modelName: String = "Road Bike Model Name"
    override val year: Int = 2023
    override val serialNumber: String = "1212787sdgghsdg"
    override var geometry: BicycleGeometries = BicycleGeometries.Upright
    override var color:  BicyclePaintColors = BicyclePaintColors.Red
    override var suspension : SuspensionTypes = SuspensionTypes.Hardtail
    override var buildStatus: ManufacturingStatus = ManufacturingStatus.Specified
    override fun build() {
        println("Model Name: $modelName year: $year serialNumber: $serialNumber" )
    }
}