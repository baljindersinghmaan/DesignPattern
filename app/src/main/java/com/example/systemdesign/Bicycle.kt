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

import java.util.*

 abstract class Bicycle (
  override var modelName: String = "",
  override var year: Int = LocalDate.now().year,
  override var serialNumber: String = UUID.randomUUID().toString(),
  override var buildStatus: ManufacturingStatus = ManufacturingStatus.Specified
 ) : IBicycle {
  // Properties with default initial values


}

