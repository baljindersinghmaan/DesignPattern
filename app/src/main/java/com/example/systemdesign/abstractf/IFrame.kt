package com.example.systemdesign.abstractf

import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.ManufacturingStatus
import com.example.systemdesign.enums.SuspensionTypes

interface IFrame {
    var modelName: String
    val year: Int
    val serialNumber: String
    var geometry: BicycleGeometries
    var color: BicyclePaintColors
    var suspension: SuspensionTypes
    var buildStatus: ManufacturingStatus

    fun build()
}