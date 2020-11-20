package com.example.meutodo.home.view

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.meutodo.R
import com.example.meutodo.home.repository.TarefaRepository
import com.example.meutodo.home.viewmodel.TarefaViewModel

class HomeFragment : Fragment() {
    lateinit var minhaView: View
    lateinit var viewModel: TarefaViewModel

    // TODO: Rename and change types of parameters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        minhaView = inflater.inflate(R.layout.fragment_home, container, false)
        return minhaView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(
            this,
            TarefaViewModel.TarefaViewModelFactory(TarefaRepository())
        ).get(TarefaViewModel::class.java)

        viewModel.listaDeTarefasData.observe(viewLifecycleOwner, {
            minhaView.findViewById<TextView>(R.id.textTarefa1).text = it[0].descricao
        })

        viewModel.obterTarefas()
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment()
    }
}