package com.paulo4fs.reciclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeuAdapter(private val dataSet: List<String>) :
    RecyclerView.Adapter<MeuAdapter.MeuViewHolder>() {

    class MeuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val meuTexto by lazy { view.findViewById(R.id.meuTexto) as TextView }

        fun bind(string: String) {
            meuTexto.text = string
        }
    }

    //    Inflar o xml (a linha)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)

        return MeuViewHolder(view)
    }

    // Quantidade de itens do meu DataSet
    override fun getItemCount() = dataSet.size

    // Vai ser chamado a cada item do DataSet
    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }
}