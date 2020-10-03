package com.paulo4fs.parouimpar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnConverter.setOnClickListener { converter(temperaturaC.text.toString()) }
    }

    fun converter(tempC: String) {
        val tempF = ((tempC.toDouble() * 9) / 5) + 32
        temperaturaF.text = "$tempF ºF"
    }
}