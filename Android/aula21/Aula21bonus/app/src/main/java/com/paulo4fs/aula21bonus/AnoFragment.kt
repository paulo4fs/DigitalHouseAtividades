package com.paulo4fs.aula21bonus

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.fragment_ano.*
import kotlinx.android.synthetic.main.fragment_ano.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [AnoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AnoFragment : Fragment() {
    lateinit var iClicou: IClicou

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_ano, container, false)

        view.btn.setOnClickListener {
            var nomeText: String = view.textInputFieldNome.text.toString()
            val anoText: String = view.textInputFieldAno.text.toString()
            iClicou.calcularIdade(nomeText, anoText.toInt())
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        iClicou = context as IClicou
    }
}