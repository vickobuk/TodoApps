package com.victor.todoapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


val validUsername:String = "admin"
val validPassword:String = "admin"

// layout variable
    private lateinit var UsernameInput: EditText
    private lateinit var  Passwordinput:EditText
    private lateinit var  SubmitButton :Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

         super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        UsernameInput = findViewById(R.id.UsernameInput)
        Passwordinput = findViewById(R.id.PasswordInput)
        SubmitButton = findViewById(R.id.submit)

        //working on button to see event
        SubmitButton.setOnClickListener{
            val username= UsernameInput.text.toString()
            val password= Passwordinput.text.toString()
            login(username,password)
        }

    }
    //this for login function
    fun login(Username:String,Password:String){
       if(isvalidCredentials(Username,Password)) {
     val intent : Intent = Intent(this,HomeActivity::class.java)//this to open home page
           intent.putExtra("username",Username)
           startActivity(intent)
       }else{
           //toast is use to popup message
           Toast.makeText(applicationContext,"Login not successfull",Toast.LENGTH_SHORT).show()
       }
    }
    private fun isvalidCredentials(Username:String,Password: String):Boolean{
        if( Password== validPassword)return true //this password without username and when enter
        return false

    }
}