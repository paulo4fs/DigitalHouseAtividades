package com.paulo4fs.novatelaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val intent = Intent(this, nova_tela::class.java)
            Toast.makeText(this, "bora lá", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        checkVoceDeseja.setOnCheckedChangeListener { _, isChecked ->
            btn.isEnabled = isChecked
        }
    }
}