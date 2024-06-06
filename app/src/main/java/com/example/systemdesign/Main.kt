package com.example.systemdesign

import com.example.systemdesign.builder.Director
import com.example.systemdesign.builder.RoadBikeBuilder
import com.example.systemdesign.objectpool.WeldingArmPool

fun main(){
    println("Here's a program that controls some welding robots from a pool of 10.")

    val armPool = WeldingArmPool().apply {
        maxSize = 10
    }

    // That's it! We now have a pool of ten arms. (basically a squid)

    // Let's take one out and send it to station

    val arm01 = armPool.getArmFromPool()
    arm01.moveToStation(1)
    if (arm01.doWeld()) armPool.returnArmToPool(arm01)

    println("There are ${armPool.armsAvailable} arms available")


    for (i in 0 until 11) {
        try {
            val arm = armPool.getArmFromPool()
            arm.moveToStation(i + 1)
            arm.doWeld()
            println("There are ${armPool.armsAvailable} arms available")
            // Fail to send it back so we run out of arms
        } catch (ex: Exception) {
            println(ex.message)
        }
    }
}
