package com.example.projectshoppe

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import com.example.projectshoppe.databinding.LoginUiBinding
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity:AppCompatActivity() {

//    val firstPresenter :MySimplePresenter by inject()


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


//        replaceFragment(Fragment_LoginUI1())
        }
//

//        val Pre = get<MySimplePresenter>()
//        val Pro = get<MySimplePresenter>()
//        Log.i("AAA","${Pre.sayHello()} ${Pro.sayHello()}")
    }

//    private fun replaceFragment(fragment:Fragment) {
//
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.Main_Frame,fragment)
//        fragmentTransaction.commit()
//
//    }

