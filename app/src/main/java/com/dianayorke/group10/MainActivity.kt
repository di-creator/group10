package com.dianayorke.group10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signInBtn: Button = findViewById(R.id.signInBtn)

        signInBtn.setOnClickListener{
            val intent = Intent(this, SignIn::class.java)

            startActivity(intent)
        }

        val signup: Button = findViewById(R.id.register)

        signup.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java)

            startActivity(intent)
        }
    }
}