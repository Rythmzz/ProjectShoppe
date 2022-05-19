package com.example.projectshoppe

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity:AppCompatActivity() {
//    val firstPresenter :MySimplePresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val Pre = get<MySimplePresenter>()
        val Pro = get<MySimplePresenter>()
        Log.i("AAA","${Pre.sayHello()} ${Pro.sayHello()}")
    }

}