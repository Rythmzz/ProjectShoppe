package com.example.projectshoppe

interface HelloRespository {
    fun giveHello():String
}
class HelloRespositoryImpl() :HelloRespository {
    override fun giveHello(): String = "Hello Koin"
}

