package com.example.rickgridatividade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso


class activity_card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        val imagem = intent.getStringExtra("imagem")
        val nome = intent.getStringExtra("nome")
        val localizacao = intent.getStringExtra("localizacao")
        val genero = intent.getStringExtra("genero")
        val status = intent.getStringExtra("status")

        val ivActivityCard: ImageView = findViewById<ImageView>(R.id.iv_image_activitycard)
        Picasso.get().load(imagem).into(ivActivityCard)

        val tvNome: TextView = findViewById<TextView>(R.id.tv_nome_activitycard)
        tvNome.text = nome

        val tvLocalizacao: TextView = findViewById<TextView>(R.id.tv_localizacao_activitycard)
        tvLocalizacao.text = localizacao

        val tvGenero: TextView = findViewById<TextView>(R.id.tv_genero_activitycard)
        tvGenero.text = genero

        val tvStatus: TextView = findViewById<TextView>(R.id.tv_status_activitycard)
        tvStatus.text = status

        val closeButton = findViewById<ImageView>(R.id.iv_closebutton_activitycard)
        closeButton.setOnClickListener {
            finish()
        }
    }
}