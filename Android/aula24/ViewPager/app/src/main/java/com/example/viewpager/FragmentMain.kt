package com.example.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentMain : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("TEXTO")
            param2 = it.getBoolean("EH MAIOR DE IDADE")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val minhaView = inflater.inflate(R.layout.fragment_main, container, false)

        minhaView.findViewById<TextView>(R.id.tvFragment).text = param1

        return minhaView
    }

    companion object {
        @JvmStatic
        fun newInstance(texto: String, ehMaiorDeIdade: Boolean) =
            FragmentMain().apply {
                arguments = Bundle().apply {
                    putString("TEXTO", texto)
                    putBoolean("EH MAIOR DE IDADE", ehMaiorDeIdade)
                }
            }
    }
}