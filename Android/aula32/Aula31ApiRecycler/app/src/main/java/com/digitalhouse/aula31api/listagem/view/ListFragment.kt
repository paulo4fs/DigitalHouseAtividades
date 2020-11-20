package com.digitalhouse.aula31api.listagem.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ProgressBar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.aula31api.R
import com.digitalhouse.aula31api.listagem.models.CharacterModel
import com.digitalhouse.aula31api.listagem.repository.CharacterRepository
import com.digitalhouse.aula31api.listagem.viewmodel.CharacterViewModel
import com.digitalhouse.aula31api.listagem.viewmodel.CharacterViewModelFactory

class ListFragment : Fragment() {
    lateinit var _viewModel: CharacterViewModel
    lateinit var _view: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        _view = view
        super.onViewCreated(view, savedInstanceState)

        val lista = view.findViewById<RecyclerView>(R.id.recyclerView)
        val manager = LinearLayoutManager(view.context)

        val listaDeCharacters = mutableListOf<CharacterModel>()
        val listaAdapter = ListAdapter(listaDeCharacters)

        lista.apply {
            setHasFixedSize(true)
            layoutManager = manager
            adapter = listaAdapter
        }

        _viewModel = ViewModelProvider(
            this,
            CharacterViewModelFactory(CharacterRepository())
        ).get(CharacterViewModel::class.java)

        _viewModel.characters.observe(this, Observer {
            showLoading(false)
            notFound(it.isNotEmpty())

            listaDeCharacters.addAll(it)
            listaAdapter.notifyDataSetChanged()
        })

        _viewModel.obterLista()
        showLoading(true)
    }

    fun showLoading(isLoading: Boolean) {
        val viewLoading = _view.findViewById<View>(R.id.loading)
        if (isLoading) {
            viewLoading?.visibility = View.VISIBLE
        } else {
            viewLoading?.visibility = View.GONE
        }
    }

    fun notFound(boolean: Boolean) {
        val waitLayout = _view.findViewById<View>(R.id.notFoundLayout)
        if (boolean) {
            waitLayout.visibility = View.GONE
        } else {
            waitLayout.visibility = View.VISIBLE
        }
    }

}