package com.example.projectshoppe

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.projectshoppe.databinding.FragmentLoginUI1Binding
import com.example.projectshoppe.databinding.LoginUiBinding
import org.w3c.dom.Text

class Fragment_LoginUI1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment__login_u_i1, container, false)

        val textView:TextView = view.findViewById(R.id.lcenter_textLoginSMS)

        textView.setOnClickListener {


            val fragment = Fragment_LoginUI2()
            val transaction = parentFragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container,fragment)?.commit()

        }
        val textForgetpass:TextView = view.findViewById(R.id.lcenter_Forgetpass)

        textForgetpass.setOnClickListener {
            val x = Intent(activity,Activity_forgetPass::class.java)
            startActivity(x)


        }
        val textRegister:TextView = view.findViewById(R.id.lcenter_textRegister)

        textRegister.setOnClickListener {
            val x = Intent(activity,Activity_register::class.java)
            startActivity(x)
        }

        val checkpass:CheckBox = view.findViewById(R.id.lcenter_checkPass)
        val editpass:EditText = view.findViewById(R.id.lcenter_editPassword)

        checkpass.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked == true) {
                editpass.transformationMethod = HideReturnsTransformationMethod.getInstance()

            }
            else{
                editpass.transformationMethod = PasswordTransformationMethod.getInstance()
            }


        }




        return view
    }



}