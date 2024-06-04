package com.example.systemdesign.builder

import com.example.systemdesign.abstractf.IHandlebars

class RoadBikeHandlebars: IHandlebars {
    override var length: Float = 12f
    override var diameter: Float = 12f
    override var isDropped: Boolean = true
    override var riseAngle: Float = 21f
}