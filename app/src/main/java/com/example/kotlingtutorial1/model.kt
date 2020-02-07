package com.example.kotlingtutorial1

data class Hobby(var title:String)

object Suppliter{
    val hobbies= listOf<Hobby>(
        Hobby("Swiming"), Hobby("Reading"),
        Hobby("Footboll"),Hobby("Film Watchin"),
        Hobby("Sleeping"),Hobby("Walking"),
        Hobby("Swiming"), Hobby("Reading"),
        Hobby("Footboll"),Hobby("Film Watchin"),
        Hobby("Swiming"), Hobby("Reading"),
        Hobby("Footboll"),Hobby("Film Watchin")
    )

}