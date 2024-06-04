package com.example.systemdesign.abstractf

interface IBicycleFactory {
 fun createBicycleFrame() : IFrame
 fun createBicycleHandlebars() : IHandlebars
}