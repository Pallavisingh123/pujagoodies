package com.hatcodian.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        }


    fun Signup(view: View) {
        val intent = Intent(this, SignUp::class.java)
        // start your next activity
        startActivity(intent)

    }

    fun signin(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        // start your next activity
        startActivity(intent)

    }
}