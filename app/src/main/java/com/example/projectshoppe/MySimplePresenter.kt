package com.example.projectshoppe

class MySimplePresenter(val repo:HelloRespository) {
    fun sayHello() = "${repo.giveHello()} from $this"
}