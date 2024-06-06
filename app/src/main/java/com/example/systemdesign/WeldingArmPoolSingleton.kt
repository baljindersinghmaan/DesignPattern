package com.example.systemdesign

import com.example.systemdesign.objectpool.WeldingArm
import java.util.*

class WeldingArmPoolSingleton private constructor() {
    private var maxSize = 10
    private lateinit var pool: MutableList<WeldingArm>

    init {
        reset()
    }

    companion object {
        private var instance: WeldingArmPoolSingleton? = null

        val instanceSingleton: WeldingArmPoolSingleton
            get() {
                if (instance == null) {
                    instance = WeldingArmPoolSingleton()
                }
                return instance!!
            }
    }

    val armsAvailable: Int
        get() = pool.size

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
