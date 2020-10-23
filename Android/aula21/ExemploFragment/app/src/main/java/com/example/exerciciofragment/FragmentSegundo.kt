package com.example.exerciciofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_segundo.*

class FragmentSegundo : Fragment() {
    private lateinit var fragmentBView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentBView = inflater.inflate(R.layout.fragment_segundo, container, false)

        return fragmentBView
    }

    //funcionalidade para alterar o texto da view no fragment
    fun changeText(text: String) {
        var fragmentB: View =
//        tvFragmentB.text = text

    }
}