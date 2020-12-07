package com.example.rickfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), IClick {

    //instancio meus fragments

    //atribuo meu supportManager para a variavel manager
    private val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //passo para minha função o id do meu container e meu fragment inicializado

        val transaction = manager.beginTransaction()
        transaction.replace(R.id.FragmentCard, FragmentCard())
        transaction.commit()
    }
}