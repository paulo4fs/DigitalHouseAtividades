package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLoginLogin.setOnClickListener {
            val email = edtEmailLogin.text.toString()
            val password = edtPasswordLogin.text.toString()
            val user = UserService.logIn(email, password)
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Existem campos vazios", Toast.LENGTH_SHORT).show()
            } else if (user == null) {
                Toast.makeText(this, "Email ou Senha errados", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Bem Vindo!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, WelcomeActivity::class.java)
                intent.putExtra("name", user.name)
                startActivity(intent)
            }
        }

        btnSignupLogin.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }
}