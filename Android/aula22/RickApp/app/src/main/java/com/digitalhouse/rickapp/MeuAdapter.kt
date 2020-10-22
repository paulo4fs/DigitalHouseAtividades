package com.digitalhouse.rickapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.Personagem
import com.squareup.picasso.Picasso

class MeuAdapter(private val personagem: List<Personagem>) :
    RecyclerView.Adapter<MeuAdapter.MeuViewHolder>() {
    // MeuViewHolder é o mapeamento do código kotlin para xml
    class MeuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val nome by lazy { view.findViewById(R.id.tvNome) as TextView }
        private val especie by lazy { view.findViewById(R.id.tvEspecie) as TextView }
        private val status by lazy { view.findViewById(R.id.tvStatus) as TextView }
        private val imagemUrl by lazy { view.findViewById(R.id.ivImagem) as ImageView }
        private val genero by lazy { view.findViewById(R.id.tvGenero) as TextView }
        private val localizacao by lazy { view.findViewById(R.id.tvLocalizacao) as TextView }

        fun bind(personagem: Personagem) {
            nome.text = personagem.nome
            especie.text = personagem.especie
            genero.text = personagem.genero
            status.text = personagem.status
            localizacao.text = personagem.localizacao.nome
            Picasso.get().load(personagem.imagemUrl).into(imagemUrl)
        }
    }

    // Inflar o xml (a linha)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuAdapter.MeuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)

        return MeuViewHolder(view)
    }

    // Quantidade de itens do dataset
    override fun getItemCount() = personagem.size

    // Vai ser chamado para cada item do dataset
    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        holder.bind(personagem[position])
    }
}