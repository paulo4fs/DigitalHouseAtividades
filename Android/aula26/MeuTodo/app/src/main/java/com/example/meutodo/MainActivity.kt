package com.example.meutodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meutodo.R
import com.example.meutodo.home.view.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager

        manager.beginTransaction()
            .replace(R.id.framelayout, HomeFragment())
            .commit()
    }

}