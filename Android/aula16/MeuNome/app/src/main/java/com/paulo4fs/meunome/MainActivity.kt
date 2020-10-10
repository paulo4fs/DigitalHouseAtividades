package com.paulo4fs.meunome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnExibir.setOnClickListener { mudarNome(meuNome.text.toString()) }
    }

    private fun mudarNome(nome: String) {
        placeholder.text = nome
    }
}