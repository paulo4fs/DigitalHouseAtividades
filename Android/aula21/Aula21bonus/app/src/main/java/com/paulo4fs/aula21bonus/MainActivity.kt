package com.paulo4fs.aula21bonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_result.*
import kotlinx.android.synthetic.main.fragment_result.view.*
import java.util.*

class MainActivity : AppCompatActivity(), IClicou {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager

        val transaction = manager.beginTransaction()
        transaction.add(R.id.anoFragment, AnoFragment())
        transaction.commit()

        val transaction2 = manager.beginTransaction()
        transaction2.replace(R.id.resultContainer, ResultFragment())
        transaction2.commit()
    }

    override fun calcularIdade(nome: String, ano: Int) {
        var idade = Calendar.getInstance().get(Calendar.YEAR) - ano

        var resultado =
            if (idade >= 0) "$nome, sua idade é $idade ano(s)" else "$nome ainda não nasceu"

        val resultFragment = ResultFragment(resultado)

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.resultContainer, resultFragment)
        transaction.commit()
    }
}