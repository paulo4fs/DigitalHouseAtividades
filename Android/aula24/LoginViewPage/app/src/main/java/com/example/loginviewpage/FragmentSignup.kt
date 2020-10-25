package com.example.loginviewpage

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.fragment_signup.view.*


class FragmentSignup : Fragment() {

    private lateinit var iSubmit: ISubmit

    override fun onAttach(context: Context) {
        super.onAttach(context)
        iSubmit = context as ISubmit
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_signup, container, false)
        submit(view)
        return view
    }

    private fun submit(view: View) {
        view.btnSignup.setOnClickListener {
            iSubmit.signup("asdfasdfasdf", "asdf")
        }
        Toast.makeText(activity, "test", Toast.LENGTH_LONG).show()
    }
}