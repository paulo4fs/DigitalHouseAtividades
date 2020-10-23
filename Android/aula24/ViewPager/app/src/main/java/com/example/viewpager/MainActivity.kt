package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager>(R.id.viewPager)
        val tab = findViewById<TabLayout>(R.id.tabLayout)

//        Faz com que o tab use o viewpager
        tab.setupWithViewPager(pager)

        val fragments = listOf(
            FragmentMain(), FragmentMain(), FragmentMain()
        )

        val titulos = listOf(
            getString(R.string.home),
            getString(R.string.biblioteca),
            getString(R.string.favoritos)
        )

        pager.adapter = ViewPageAdapter(
            fragments,
            titulos,
            supportFragmentManager
        )
    }
}