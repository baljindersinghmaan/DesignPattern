package com.example.systemdesign.builder

import com.example.systemdesign.abstractf.IFrame
import com.example.systemdesign.abstractf.IHandlebars

class BicycleProduct : IBicycleProduct {
    override var frame: IFrame? = null
    override var suspension: ISuspension? = null
     override var handlebars: IHandlebars? = null
     override var driven: IDrivetrain? = null
    var drivetrain: IDrivetrain? = null
    override var seat: ISeat? = null
   // var brakes: IBrakes? = null

    override fun toString(): String {
        val fullDescription = StringBuilder("Here's your new bicycle:")
        frame?.let { fullDescription.appendLine(it.toString()) }
        suspension?.let { fullDescription.appendLine(it.toString()) }
        handlebars?.let { fullDescription.appendLine(it.toString()) }
        drivetrain?.let { fullDescription.appendLine(it.toString()) }
        seat?.let { fullDescription.appendLine(it.toString()) }
        // brakes?.let { fullDescription.appendLine(it.toString()) }

        return fullDescription.toString()
    }
}
