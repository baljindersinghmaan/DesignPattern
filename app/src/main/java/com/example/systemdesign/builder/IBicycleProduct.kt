package com.example.systemdesign.builder

import com.example.systemdesign.abstractf.IFrame
import com.example.systemdesign.abstractf.IHandlebars

interface IBicycleProduct {
    var frame: IFrame?
    var suspension: ISuspension?
    var handlebars : IHandlebars?
    var driven : IDrivetrain?
    var seat: ISeat?
}