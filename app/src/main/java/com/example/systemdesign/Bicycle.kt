package com.example.systemdesign

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.systemdesign.enums.BicycleGeometries
import com.example.systemdesign.enums.BicyclePaintColors
import com.example.systemdesign.enums.ManufacturingStatus
import com.example.systemdesign.enums.SuspensionTypes
import java.time.LocalDate
import java.time.Year
import java.util.UUID

abstract class Bicycle constructor(
    protected val modelName: String = "",
    private var year: Int = LocalDate.now().year,
    private val serialNumber: String = UUID.randomUUID().toString(),
    protected val color: BicyclePaintColors,
    protected val geometry: BicycleGeometries,
    protected val suspension: SuspensionTypes
) {
    private var buildStatus: ManufacturingStatus? = null

    // You can add getter and setter methods or any other methods you need
}
