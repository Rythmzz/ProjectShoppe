package com.example.projectshoppe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectshoppe.databinding.ActivityLoginBinding

class Activity_Login : AppCompatActivity() {
//    private lateinit var binding:Fragment_LoginUI1
//    private lateinit var binding2:Fragment_LoginUI2
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)
        supportFragmentManager.beginTransaction().replace(R.id.nav_container,Fragment_LoginUI1()).commit()

    }
}