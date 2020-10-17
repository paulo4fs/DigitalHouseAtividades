package com.paulo4fs.aulafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager

        btnFragmentA.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.framelayout, MeuFragment())
            transaction.commit()
        }

        btnFragmentB.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.framelayout, GreenFragment())
            transaction.commit()
        }
    }
}