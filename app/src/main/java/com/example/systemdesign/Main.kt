package com.example.systemdesign

import com.example.systemdesign.builder.Director
import com.example.systemdesign.builder.RoadBikeBuilder

fun main(){
    val roadBikeBuilder = RoadBikeBuilder()
    val director = Director(roadBikeBuilder)

    val roadBike = director.make()
    println(roadBike.toString())

// Want a mountain bike instead? No problem!
   /* val mountainBikeBuilder = MountainBikeBuilder()
    director.changeBuilder(mountainBikeBuilder)

    val mountainBike = director.make()
    println(mountainBike.toString())*/


}
class Main {

    /*fun build() {
        println("Manufacturing a ${geometry} frame...")
        buildStatus = ManufacturingStatus.FrameManufactured
        printBuildStatus()

        println("Painting the frame ${color}")
        buildStatus = ManufacturingStatus.Painted
        printBuildStatus()

        if (suspension != SuspensionTypes.Hardtail) {
            println("Mounting the ${suspension} suspension.")
            buildStatus = ManufacturingStatus.SuspensionMounted
            printBuildStatus()
        }

        println("${LocalDate.now().year} $modelName Bicycle serial number $serialNumber manufacturing complete!")
        buildStatus = ManufacturingStatus.Complete
        printBuildStatus()
    }*/

    /*private fun printBuildStatus() {
        println("Current build status: $buildStatus")
    }*/

}