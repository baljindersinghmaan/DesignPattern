package com.example.systemdesign.builder

import com.example.systemdesign.abstractf.RoadBikeFrame

class RoadBikeBuilder : IBicycleBuilder {
    private var bicycle: BicycleProduct = BicycleProduct()

    init {
        reset()
    }

    override fun reset() {
        bicycle = BicycleProduct()
    }

    override fun buildFrame() {
        bicycle.frame = RoadBikeFrame()
    }

    override fun buildHandleBars() {
        bicycle.handlebars = RoadBikeHandlebars()
    }

    override fun buildSeat() {
        bicycle.seat = GenericSeat()
    }

    override fun buildSuspension() {
        bicycle.suspension = HardTailSuspension()
    }

    override fun buildDriveTrain() {
        bicycle.drivetrain = RoadDrivetrain()
    }

    override fun buildBrakes() {
        // bicycle.brakes = CaliperBrakes()
    }

    override fun getProduct(): IBicycleProduct {
        return bicycle
    }
}
