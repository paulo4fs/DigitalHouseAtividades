package com.example.loginviewpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.loginviewpage.users.UserService
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity(), ISubmit {
    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout
    private var fragmentLogin: FragmentLogin = FragmentLogin()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager = findViewById<ViewPager>(R.id.viewpager)
        tab = findViewById<TabLayout>(R.id.tablayout)

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
        UserService.register(name, password)
//        Toast.makeText(this, "${UserService.users.size}", Toast.LENGTH_LONG).show()
        pager.currentItem = 0
    }

    override fun signin(name: String, password: String) {
        if (UserService.login(name, password) == null) {
            Toast.makeText(this, "Num funfo", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Deu bom", Toast.LENGTH_LONG).show()
        }
    }
}