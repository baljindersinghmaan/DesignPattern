package com.example.systemdesign.builder

class RoadDrivetrain : IDrivetrain {
    override var crankLength: Float = 15f
    override var frontCassetteCogs: Int = 10
    override var rearCassetteCogs: Int = 40
    override var chainLinkCount: Float = 10f
    override var isEnclosed: Boolean = true
}