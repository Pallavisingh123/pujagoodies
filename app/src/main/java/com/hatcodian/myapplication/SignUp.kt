package com.hatcodian.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }


    fun signin(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        // start your next activity
        startActivity(intent)
    }
    fun Signup(view: View) {

        val intent = Intent(this, HomeActivity::class.java)
        // start your next activity
        startActivity(intent)
    }
}