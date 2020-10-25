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
            FragmentMain.newInstance("paulo", true),
            FragmentMain.newInstance("paulo2", true),
            FragmentMain.newInstance("paulo3", false)
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

        tab.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tab.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_library_books_24)
        tab.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_star_24)

        tab.getTabAt(1)!!.orCreateBadge.apply {
            number = 10
            maxCharacterCount = 3
            isVisible = true
        }


//        tab.addOnTabSelectedListener((object : TabLayout.OnTabSelectedListener {
//            override fun onTabSelected(selected: TabLayout.Tab?) {
//                if (selected!!.position == 1) {
//                    tab.getTabAt(1)!!.badge?.isVisible = false
//                }
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//                TODO("Not yet implemented")
//            }
//        }))
    }
}