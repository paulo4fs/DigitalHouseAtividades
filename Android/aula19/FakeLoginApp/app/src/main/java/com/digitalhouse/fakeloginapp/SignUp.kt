package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_sign_up.*
import java.lang.Exception

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnReturnLogin.setOnClickListener {
            finish()
        }
        btnSignupSignup.setOnClickListener {
            val name = edtNameSignUp.text.toString()
            val email = edtEmailSignUp.text.toString()
            val password = edtPasswordSignUp.text.toString()

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Existem campos vazios", Toast.LENGTH_SHORT).show()
            } else {
                try {
                    UserService.register(name, email, password)
                    Toast.makeText(this, "Usuário cadastrado", Toast.LENGTH_SHORT).show()
                    finish()
                } catch (e: Exception) {
                    Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
        checkbox.setOnCheckedChangeListener { _, isChecked ->
            btnSignupSignup.isEnabled = isChecked
        }
    }
}