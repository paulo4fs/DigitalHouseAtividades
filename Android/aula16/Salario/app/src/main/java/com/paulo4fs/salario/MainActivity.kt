package com.paulo4fs.salario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalcular.setOnClickListener {
            calcularSalario(
                horasTrabalhadas.text.toString(),
                valorDaHora.text.toString()
            )
        }
    }

    fun calcularSalario(horas: String, valor: String) {
        if (horas.isNullOrBlank() || valor.isNullOrBlank()) {
            txtSalario.text = "R$ XXXXX,XX"
        } else if (horas.toDouble() > 0 && valor.toDouble() > 0) {
            txtSalario.text = "R$ ${horas.toDouble() * valor.toDouble()}"
        }
    }
}