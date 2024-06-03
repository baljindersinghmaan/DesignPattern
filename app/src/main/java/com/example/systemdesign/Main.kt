package com.example.systemdesign

fun main(){
    val bicycleFactory = SimpleBicycleFactory()
    try {
        val bikeToBuild = bicycleFactory.createBicycle("Motion")
        bikeToBuild.build()
    } catch (e: Exception) {
        println(errorText)
    }

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