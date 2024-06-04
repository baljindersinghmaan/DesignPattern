package com.example.systemdesign.builder

class Director(private var builder: IBicycleBuilder) {

    fun changeBuilder(builder: IBicycleBuilder) {
        this.builder = builder
    }

    fun make(): IBicycleProduct {
        builder.apply {
            buildFrame()
            buildHandleBars()
            buildSeat()
            buildSuspension()
            buildDriveTrain()
            buildBrakes()
        }
        return builder.getProduct()
    }
}
