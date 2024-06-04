package com.example.systemdesign.builder

interface IBicycleBuilder {
    fun reset()
    fun buildFrame()
    fun buildHandleBars()
    fun buildSeat()
    fun buildSuspension()
    fun buildDriveTrain()
    fun buildBrakes()
    fun getProduct(): IBicycleProduct
}
