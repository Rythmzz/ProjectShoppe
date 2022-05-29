package com.example.projectshoppe

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.projectshoppe.databinding.FragmentLoginUI2Binding

class Fragment_LoginUI2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment__login_u_i2, container, false)
        val textView: TextView = view.findViewById(R.id.lcenter_textLoginAccount)
        textView.setOnClickListener {


            val fragment = Fragment_LoginUI1()
            val transaction = parentFragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container,fragment)?.commit()

        }
        val textRegister:TextView = view.findViewById(R.id.lcenter_textRegister)

        textRegister.setOnClickListener {
            val x = Intent(activity,Activity_register::class.java)
            startActivity(x)
        }

        return view
    }

}