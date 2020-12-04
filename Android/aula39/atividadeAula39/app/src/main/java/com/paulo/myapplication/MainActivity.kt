package com.paulo.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.myapplication.view.TarefaFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, TarefaFragment())
            .commit()
    }
}