package com.example.loginviewpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.loginviewpage.users.UserService
import com.google.android.material.tabs.TabLayout

const val LOGIN_FRAGMENT = 0
const val SIGNUP_FRAGMENT = 1

class MainActivity : AppCompatActivity(), ISubmit {
    private val pager: ViewPager by lazy { findViewById<ViewPager>(R.id.viewpager) }

    private lateinit var loginFragment: FragmentLogin

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tab: TabLayout = findViewById<TabLayout>(R.id.tablayout)

        // faz com que o tab use o viewpager
        tab.setupWithViewPager(pager)

        loginFragment = FragmentLogin()

        val fragments = listOf(
            loginFragment,
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

    override fun signin(name: String, password: String) {
        if (UserService.login(name, password) == null) {
            Toast.makeText(this, "Num funfo", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Deu bom", Toast.LENGTH_LONG).show()
        }
    }

    override fun signup(name: String, password: String) {
        UserService.register(name, password)

        Handler(Looper.getMainLooper()).postDelayed({
            pager.currentItem = LOGIN_FRAGMENT
            loginFragment.changeName(name)
        }, 1000)
    }

    override fun changeTab(posicaoAtual: Int) {
        Handler(Looper.getMainLooper()).postDelayed({
            pager.currentItem = if (posicaoAtual == LOGIN_FRAGMENT) {
                SIGNUP_FRAGMENT
            } else {
                LOGIN_FRAGMENT
            }
        }, 250)
    }
}