package com.experiment.experiment

import org.springframework.stereotype.Component

@Component
class Address  {
    private var city:String = "default"
    private var pinCode:Int = -1

    constructor(city: String, pinCode: Int) {
        this.city = city
        this.pinCode = pinCode
    }
    constructor()


    override fun toString(): String {
        return "Address(city='$city', pinCode=$pinCode)"
    }

}