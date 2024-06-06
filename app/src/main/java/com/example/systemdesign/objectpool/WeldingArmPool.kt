package com.example.systemdesign.objectpool

import java.util.*

class WeldingArmPool {
    var maxSize = 10
    private lateinit var pool: MutableList<WeldingArm>

    val armsAvailable: Int
        get() = pool.size

    constructor() {
        reset()
    }

    constructor(maxSize: Int) {
        this.maxSize = maxSize
        reset()
    }

    fun reset() {
        pool = ArrayList()
        for (i in 0 until maxSize) {
            pool.add(WeldingArm())
        }
    }

    fun getArmFromPool(): WeldingArm {
        return if (armsAvailable > 0) {
            val returnArm = pool.removeAt(0)
            returnArm
        } else {
            throw Exception("You are out of arms. Return some to the pool and try again.")
        }
    }

    fun returnArmToPool(arm: WeldingArm) {
        arm.currentPosition = 0 // not at any station
        pool.add(arm)
    }
}
