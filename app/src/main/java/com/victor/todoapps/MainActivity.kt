package com.victor.todoapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


val username:String = "admin"
val password:String = "admin"

    private lateinit var UsernameInput:EditText
    private lateinit var  Passwordinput:EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

         super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}