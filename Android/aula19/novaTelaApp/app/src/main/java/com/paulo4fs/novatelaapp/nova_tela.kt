package com.paulo4fs.novatelaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_nova_tela.*

class nova_tela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova_tela)

        btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            Toast.makeText(this, "bora VOLTAR lá", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}