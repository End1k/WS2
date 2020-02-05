package com.newwalk.myapplication

class ElemInfo {
    var position: String = "Barnaul, ul Kvant"
    var type: String = "Bank office"
    var workinghours: String = "00:00 - 23:59"

    constructor() {}
    constructor(position: String, type: String, workinghours: String)
    {
        this.position = position
        this.type = type
        this.workinghours = workinghours
    }


}