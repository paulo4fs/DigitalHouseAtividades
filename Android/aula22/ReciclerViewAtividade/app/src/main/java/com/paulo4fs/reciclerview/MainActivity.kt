package com.paulo4fs.reciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewManager = LinearLayoutManager(this)
//        val viewManager = GridLayoutManager(this, 2)
        val recyclerView = findViewById<RecyclerView>(R.id.minhaLista)
        val viewAdapter =
            MeuAdapter(
                arrayListOf(
                    Contato("Paulo", "oi", "11:30"),
                    Contato("Paulooo", "oioioi", "10:10"),
                    Contato("Paullllo", "oioioioiio", "11:11"),
                    Contato("Paulo", "oi", "11:30"),
                    Contato("Paulooo", "oioioi", "10:10"),
                    Contato("Paullllo", "oioioioiio", "11:11"),
                    Contato("Paulooo", "oioioi", "10:10"),
                    Contato("Paulo", "oi", "11:30"),
                    Contato("Paullllo", "oioioioiio", "11:11"),
                    Contato("Paulooo", "oioioi", "10:10"),
                    Contato("Paulo", "oi", "11:30"),
                    Contato("Paullllo", "oioioioiio", "11:11"),
                    Contato("Paulo", "oi", "11:30"),
                    Contato("Paulooo", "oioioi", "10:10"),
                    Contato("Paullllo", "oioioioiio", "11:11")
                )
            )

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }
}