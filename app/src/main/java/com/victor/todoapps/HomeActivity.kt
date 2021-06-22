package com.victor.todoapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

// declearing variable






class HomeActivity : AppCompatActivity() {

    private lateinit var UsernameDsiplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        UsernameDsiplay = findViewById(R.id.UsernameDisplay)

        UsernameDsiplay.text = intent.getStringExtra("username")
    }

}