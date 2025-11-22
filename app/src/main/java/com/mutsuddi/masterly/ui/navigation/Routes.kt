package com.mutsuddi.masterly.ui.navigation

import com.mutsuddi.masterly.data.model.Skill
import kotlin.random.Random

object Routes{
    const val HOME= "home_screen"
    const val DETAILS= "detail_screen"

    fun getSkills(): List<Skill>{
        val skillNames = listOf(
            "Guitar", "Cooking", "Painting", "Photography", "Writing",
            "Dancing", "Singing", "Yoga", "Swimming", "Cycling",
            "Gardening", "Public Speaking", "Knitting", "Meditation", "Coding"
        )
        return skillNames.map { skill->
            Skill(
                name = skill,
                completedHour = Random.nextInt(0,5000),
                targetHour = Random.nextInt(5000,10000)
            )
        }
    }
}