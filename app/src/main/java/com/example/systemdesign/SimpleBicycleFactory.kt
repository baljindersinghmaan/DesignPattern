package com.example.systemdesign

class SimpleBicycleFactory {

    fun createBicycle(bicycleType: String): Bicycle {
        return when (bicycleType.toLowerCase()) {
            "mountainbike" -> MountainBike()
            "cruiser" -> Cruiser()
            "recumbent" -> Recumbent()
            "roadbike" -> RoadBike()
            else -> throw Exception("Unknown bicycle type: $bicycleType")
        }
    }
}
