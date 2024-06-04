package com.example.systemdesign

fun main(){
    val bicycleFactory = SimpleBicycleFactory()
    try {
        bicycleFactory.createBicycle("Motion")

    } catch (e: Exception) {
        println(e)

    }

}
