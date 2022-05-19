package com.example.projectshoppe

import org.koin.dsl.module

val appModule = module {

    single<HelloRespository> {HelloRespositoryImpl()}

    factory { MySimplePresenter(get()) }



}