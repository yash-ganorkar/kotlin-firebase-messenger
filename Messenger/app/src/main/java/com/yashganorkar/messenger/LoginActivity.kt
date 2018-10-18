package com.yashganorkar.messenger

import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        button_login.setOnClickListener {
            //check into firebase for authentication

            val email = email_login.text.toString()
            val password = password_login.text.toString()

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { }
                    .addOnFailureListener { }
        }

        dont_have_an_account_textview.setOnClickListener {
            //go back to registration

            finish()
        }
    }
}