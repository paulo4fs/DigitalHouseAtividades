package com.paulo.myapplication.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.paulo.myapplication.R
import com.paulo.myapplication.adapter.IData
import com.paulo.myapplication.adapter.TarefaAdapter
import com.paulo.myapplication.db.AppDatabase
import com.paulo.myapplication.entity.TarefaEntity
import com.paulo.myapplication.repository.TarefaRepository
import com.paulo.myapplication.viewmodel.TarefaViewModel
import com.paulo.myapplication.viewmodel.TarefaViewModelFactory


class TarefaFragment : Fragment(), IData {
    private lateinit var _view: View
    private lateinit var _viewModel: TarefaViewModel
    private lateinit var _tarefaAdapter: TarefaAdapter
    private lateinit var _iData: IData

    private var _listaDeTarefas = mutableListOf<TarefaEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _iData = this
    }

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

        _viewModel = ViewModelProvider(
            this,
            TarefaViewModelFactory(
                TarefaRepository(
                    AppDatabase.getDatabase(_view.context).tarefaDao()
                )
            )
        ).get(TarefaViewModel::class.java)

//        criação do recyclerview
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)
        val manager = LinearLayoutManager(view.context)

//         passagem da lista e clicklistener para o adapter
        _tarefaAdapter = TarefaAdapter(_listaDeTarefas, _iData) {
            Toast.makeText(this.context, it.nome, Toast.LENGTH_LONG).show()
        }

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = manager
            adapter = _tarefaAdapter
        }

//        funções de gerenciamento do bando de dados/adapter
        bindEvents()
        initialize()
        deleteAll()
    }

    private fun initialize() {
        _viewModel.getAll().observe(viewLifecycleOwner, {
            _tarefaAdapter.adicionarTarefas(it)
            countAll()
        })
    }

    private fun bindEvents() {
        _view.findViewById<Button>(R.id.btnTarefa).setOnClickListener {
            val tarefa = _view.findViewById<EditText>(R.id.etTarefa).text.toString()

            _viewModel.addTarefa(tarefa).observe(viewLifecycleOwner, {
                _tarefaAdapter.addTarefa(it)
                countAll()
            })
        }
    }

    private fun deleteAll() {
        _view.findViewById<Button>(R.id.btnClear).setOnClickListener {
            _viewModel.deleteAll().observe(viewLifecycleOwner, {
                _tarefaAdapter.deleteAll()
                countAll()
            })
        }
    }

    private fun countAll() {
        val count = _view.findViewById<TextView>(R.id.tvCount)
        _viewModel.countAll().observe(viewLifecycleOwner, {
            count.text = _tarefaAdapter.countAll().toString()
        })
    }

    private fun deleteOne(position: Int, tarefaEntity: TarefaEntity) {
        _viewModel.deleteOne(tarefaEntity).observe(viewLifecycleOwner, {
            _tarefaAdapter.deleteOne(position)
            countAll()
        })
    }

    override fun sendSelected(position: Int, tarefaEntity: TarefaEntity) {
        deleteOne(position, tarefaEntity)
    }
}