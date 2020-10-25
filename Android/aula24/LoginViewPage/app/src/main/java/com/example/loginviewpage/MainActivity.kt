package com.example.loginviewpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_signup.*

class MainActivity : AppCompatActivity(), ISubmit {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager>(R.id.viewpager)
        val tab = findViewById<TabLayout>(R.id.tablayout)

        // faz com que o tab use o viewpager
        tab.setupWithViewPager(pager)

        val fragments = listOf(
            FragmentLogin(),
            FragmentSignup()
        )

        val titulos = listOf(
            "Log In",
            "Sign Up"
        )

        pager.adapter = ViewPageAdapter(
            fragments,
            titulos,
            supportFragmentManager
        )
    }

    override fun signup(name: String, password: String) {
        Toast.makeText(this@MainActivity, name, Toast.LENGTH_LONG).show()
        btnSignup.text = "ujhasfdjhasdfuhsdfa"
    }

    override fun signin(name: String, password: String) {
        TODO("Not yet implemented")
    }
}