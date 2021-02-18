package com.example.firebaseauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userId= intent.getStringExtra("User-id")
        val email= intent.getStringExtra("email")
        txt_email.text="Email:: $email"
        txt_userId.text="userID:: $userId"
        logout.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}