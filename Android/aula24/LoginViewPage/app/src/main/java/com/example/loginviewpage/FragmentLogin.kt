package com.example.loginviewpage

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import androidx.core.widget.addTextChangedListener as add


class FragmentLogin : Fragment() {
    private lateinit var iSubmit: ISubmit
    private lateinit var viewLogin: View

    override fun onAttach(context: Context) {
        super.onAttach(context)
        iSubmit = context as ISubmit
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewLogin = inflater.inflate(R.layout.fragment_login, container, false)
        login(viewLogin)
        changeTab(viewLogin)
        return viewLogin
    }

    fun changeName(name: String) {
        var edtName = viewLogin.findViewById<TextInputEditText>(R.id.tietNameLogin)
        edtName.setText(name)
        var edtPassword = viewLogin.findViewById<TextInputEditText>(R.id.tietPasswordLogin)
        edtPassword.requestFocus()
    }

    private fun changeTab(view: View) {
        val btnSignup = view.findViewById<Button>(R.id.btnTextbuttonLogin)
        btnSignup.setOnClickListener {
            iSubmit.changeTab(0)
        }
    }

    private fun login(view: View) {
        val btnLogin =
            view.findViewById<MaterialButton>(R.id.btnLogin)
        val btnSignup = view.findViewById<Button>(R.id.btnTextbuttonLogin)

        btnSignup.setOnClickListener {
            iSubmit.changeTab(1)
        }

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


    private fun errorLabel(label: String, layout: TextInputLayout) {
        if (label.isEmpty()) {
            layout.isErrorEnabled = true
            layout.error = "it's empty"
        } else {
            layout.isErrorEnabled = false
        }
    }

}
//        val addTextChangedListener =
//            view.findViewById<TextInputEditText>(R.id.tietNameLogin).addTextChangedListener(
//                object : TextWatcher {
//                    override fun beforeTextChanged(
//                        s: CharSequence?,
//                        start: Int,
//                        count: Int,
//                        after: Int
//                    ) {
//                        TODO("Not yet implemented")
//                    }
//
//                    override fun onTextChanged(
//                        s: CharSequence?,
//                        start: Int,
//                        before: Int,
//                        count: Int
//                    ) {
//                        TODO("Not yet implemented")
//                    }
//
//                    override fun afterTextChanged(s: Editable?) {
//                        view.findViewById<TextInputLayout>(R.id.tilNameLogin).isErrorEnabled = false
//                    }
//
//                }
//
//            )
