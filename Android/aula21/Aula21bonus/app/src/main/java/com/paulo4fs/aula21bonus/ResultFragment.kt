package com.paulo4fs.aula21bonus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_result.*
import kotlinx.android.synthetic.main.fragment_result.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {
    lateinit var minhaView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        minhaView = inflater.inflate(R.layout.fragment_result, container, false)

        return minhaView
    }

    fun mostrarResultado(nome: String, idade: Int) {
        if (idade >= 0) {
            minhaView.tvResult.text = "$nome, sua idade é $idade"
        } else {
            minhaView.tvResult.text = "$nome ainda não nasceu"
        }
    }
}