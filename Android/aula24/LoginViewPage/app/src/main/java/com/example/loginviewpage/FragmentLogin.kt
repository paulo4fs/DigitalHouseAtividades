package com.example.loginviewpage

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class FragmentLogin : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        login(view)
        return view
    }

    fun login(view: View) {
        val btnLogin =
            view.findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val name =
                view.findViewById<TextInputEditText>(R.id.tietNameLogin)
                    .text.toString().trim()
            val nameLabel =
                view.findViewById<TextInputLayout>(R.id.tilNameLogin)
            val password =
                view.findViewById<TextInputEditText>(R.id.tietPasswordLogin)
                    .text.toString()
            val passwordLabel =
                view.findViewById<TextInputLayout>(R.id.tilPasswordLogin)

            errorLabel(name, nameLabel)
            errorLabel(password, passwordLabel)
            iSubmit.signin(name, password)
        }
    }

    fun errorLabel(label: String, layout: TextInputLayout) {
        if (label.isEmpty()) {
            layout.isErrorEnabled = true
            layout.error = "it's empty"
        } else {
            layout.isErrorEnabled = false
        }
    }
}