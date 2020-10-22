package com.example.rickgridatividade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_card.*

class activity_card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        val name = intent.getStringExtra("name")
        val localizacao = intent.getStringExtra("localizacao")
        val imagem = intent.getStringExtra("imagem")
        val genero = intent.getStringExtra("genero")
        val status = intent.getStringExtra("status")

        Picasso.get().load(imagem).into(iv_image_activitycard)

        tv_status_activitycard.text = status
        tv_genero_activitycard.text = genero
        tv_nome_activitycard.text = name
        tv_localizacao_activitycard.text = localizacao

        val closeButton = findViewById<ImageView>(R.id.iv_closebutton_activitycard)
        closeButton.setOnClickListener {
            finish()
        }
    }
}