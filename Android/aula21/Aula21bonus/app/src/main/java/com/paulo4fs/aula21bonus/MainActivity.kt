package com.paulo4fs.aula21bonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_result.*
import java.util.*

class MainActivity : AppCompatActivity(), IClicou {
    val resultFragment = ResultFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager

        val transaction = manager.beginTransaction()
        transaction.add(R.id.anoFragment, AnoFragment())
        transaction.commit()

        val transaction2 = manager.beginTransaction()
        transaction2.replace(R.id.resultFragment, resultFragment)
        transaction2.commit()
    }

    override fun calcularIdade(nome: String, ano: Int) {
        val anoAtual = Calendar.getInstance().get(Calendar.YEAR)
        resultFragment.mostrarResultado(nome, anoAtual - ano)
    }
}