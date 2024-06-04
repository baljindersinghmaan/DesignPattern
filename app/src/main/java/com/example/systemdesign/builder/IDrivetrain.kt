package com.example.systemdesign.builder

interface IDrivetrain {
    var crankLength: Float
    var frontCassetteCogs: Int
    var rearCassetteCogs: Int
    var chainLinkCount: Float
    // var shifter: ShifterTypes
    var isEnclosed: Boolean
}
