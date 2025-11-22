package com.mutsuddi.masterly.data.model

import kotlin.random.Random


data class Skill(
    val name:String,
    val completedHour: Int,
    val targetHour: Int
){
    fun progress():Int{
        if (completedHour ==0 ) return 0
        return  ((completedHour.toFloat()/targetHour.toFloat())*100).toInt()
    }
}

