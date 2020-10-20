package com.paulo4fs.reciclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeuAdapter(private val contact: List<Contato>) :
    RecyclerView.Adapter<MeuAdapter.MeuViewHolder>() {

    class MeuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val meuHora by lazy { view.findViewById(R.id.meuHora) as TextView }
        private val meuTexto by lazy { view.findViewById(R.id.meuTexto) as TextView }
        private val meuNome by lazy { view.findViewById(R.id.meuNome) as TextView }

        fun bind(contato: Contato) {
            meuTexto.text = contato.texto
            meuNome.text = contato.nome
            meuHora.text = contato.hora
        }
    }

    //    Inflar o xml (a linha)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)

        return MeuViewHolder(view)
    }

    // Quantidade de itens do meu DataSet
    override fun getItemCount() = contact.size

    // Vai ser chamado a cada item do DataSet
    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        holder.bind(contact[position])
    }
}