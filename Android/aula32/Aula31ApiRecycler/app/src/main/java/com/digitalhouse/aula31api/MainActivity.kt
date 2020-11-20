package com.digitalhouse.aula31api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.digitalhouse.aula31api.listagem.view.ListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, ListFragment())
            .commit()
    }
}



