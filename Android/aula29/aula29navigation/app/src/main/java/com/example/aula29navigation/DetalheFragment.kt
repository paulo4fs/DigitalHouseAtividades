package com.example.aula29navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.Navigation

class DetalheFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalhe, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            var bundle = bundleOf(KEY_NOME to "Paulo", KEY_IDADE to 20)
            navController.navigate(R.id.segundoFragment, bundle)
        }
    }

    companion object {
        const val KEY_NOME = "Nome"
        const val KEY_IDADE = "Idade"
    }
}