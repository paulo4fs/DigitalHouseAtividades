package com.paulo.myapplication.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import com.paulo.myapplication.R
import com.paulo.myapplication.adapter.TarefaAdapter
import com.paulo.myapplication.db.AppDatabase
import com.paulo.myapplication.entity.TarefaEntity
import com.paulo.myapplication.repository.TarefaRepository
import com.paulo.myapplication.viewmodel.TarefaViewModel
import com.paulo.myapplication.viewmodel.TarefaViewModelFactory


class TarefaFragment : Fragment() {
    private lateinit var _view: View
    private lateinit var _viewModel: TarefaViewModel
    private lateinit var _listaAdapter: TarefaAdapter

    private var _listaDeTarefas = mutableListOf<TarefaEntity>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tarefa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _view = view

        val lista = view.findViewById<RecyclerView>(R.id.recyclerview)
        val manager = LinearLayoutManager(view.context)

        _listaAdapter = TarefaAdapter(_listaDeTarefas)

        lista.apply {
            setHasFixedSize(true)

            layoutManager = manager
            adapter = _listaAdapter
        }

        _viewModel = ViewModelProvider(
            this,
            TarefaViewModelFactory(
                TarefaRepository(
                    AppDatabase.getDatabase(view.context).tarefaDao()
                )
            )
        ).get(TarefaViewModel::class.java)

        _viewModel.getAll().observe(viewLifecycleOwner, {
            showAll(it)
        })

        _viewModel.addTarefa(TarefaEntity(0, "asdfasdfasdfasdf"))
        _viewModel.addTarefa(TarefaEntity(0, "asdfasdfASDasdfasdf"))
        _viewModel.addTarefa(TarefaEntity(0, "asdfasdfasdfAasdf"))
        _viewModel.addTarefa(TarefaEntity(0, "asdfasdfasdDfasdf"))

        _viewModel.countAll().observe(viewLifecycleOwner, {
            _view.findViewById<TextView>(R.id.tvCount).text = it.toString()
        })

        addListener()
    }

    private fun addListener() {
        val btnClick = _view.findViewById<Button>(R.id.btnTarefa)
        val tarefaText = _view.findViewById<TextInputEditText>(R.id.tietTarefa)

        btnClick.setOnClickListener {
            _viewModel.addTarefa(
                TarefaEntity(0, tarefaText.text.toString())
            )
            Toast.makeText(_view.context, tarefaText.text.toString(), Toast.LENGTH_LONG).show()
        }
    }

    fun showAll(lista: List<TarefaEntity>) {
        lista.let {
            _listaDeTarefas.addAll(it)
        }
        _listaAdapter.notifyDataSetChanged()
    }
}