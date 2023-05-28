package com.example.mahdi0120

interface Destinations {
    val Route:String
}
object Home:Destinations{
    override val Route = "Home"
}
object Second:Destinations{
    override val Route = "Second/{username}/{password}"
}