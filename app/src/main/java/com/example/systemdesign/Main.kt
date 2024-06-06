package com.example.systemdesign

import com.example.systemdesign.builder.Director
import com.example.systemdesign.builder.RoadBikeBuilder
import com.example.systemdesign.objectpool.WeldingArmPool

fun main(){
    println("Here's a program that controls some welding robots from a pool of 10")
    println("This one uses a singleton version of the object pool making it impossible to instantiate more than once.")

    // note the new keyword doesn't work by design.  uncomment the following line if you don't believe me.
    // var armPoolSingleton = WeldingArmPoolSingleton()

    // instead you need the static instance property.  it's getter handles the singleton instance for you.
    val armPoolSingleton = WeldingArmPoolSingleton.instanceSingleton

    val arm01 = armPoolSingleton.getArmFromPool()
    arm01.moveToStation(1)
    if (arm01.doWeld()) armPoolSingleton.returnArmToPool(arm01)

    println("There are ${armPoolSingleton.armsAvailable} arms available")

    // now try it again.  it's pointing to the same single instance.  if it weren't there would be 10.

    val armPoolSingleton2 = WeldingArmPoolSingleton.instanceSingleton
    println("There are ${armPoolSingleton2.armsAvailable} arms available")
}
