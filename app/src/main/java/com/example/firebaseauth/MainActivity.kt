package com.example.firebaseauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.LogManager

class MainActivity : AppCompatActivity() {
    override fun onStart() {
        super.onStart()
        val  firebaseUser = FirebaseAuth.getInstance().currentUser

        //check if user is null
        if (firebaseUser == null) {
            val intent = Intent(this, LoginActivity::class.java)

            startActivity(intent)
            finish()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firebaseAuth=FirebaseAuth.getInstance()

        logout.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}