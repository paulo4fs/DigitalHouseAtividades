package com.example.loginviewpage

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


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
        val btnSignup = view.findViewById<MaterialButton>(R.id.btnSignup)
        val checkbox = view.findViewById<CheckBox>(R.id.checkboxSignup)

        checkbox.setOnClickListener {
            btnSignup.isEnabled = checkbox.isChecked
        }

        btnSignup.setOnClickListener {
            errorHandler(view)
            val name =
                view.findViewById<TextInputEditText>(R.id.tietNameSignup).text.toString()
            val password =
                view.findViewById<TextInputEditText>(R.id.tietPasswordSignup).text.toString()
            val passwordConfirmation =
                view.findViewById<TextInputEditText>(R.id.tietPasswordConfirmSignup).text.toString()

            if (name.isEmpty() ||
                password.isEmpty() ||
                passwordConfirmation != password ||
                !checkbox.isChecked
            ) {
                Toast.makeText(activity, "Algo de errado não está certo", Toast.LENGTH_LONG).show()
            } else {
                Snackbar.make(view, "Deu bom", Snackbar.LENGTH_LONG).show()
                iSubmit.signup(name, password)
                iSubmit.changeTab(1)
            }
        }
    }

    private fun errorHandler(view: View) {
        val name =
            view.findViewById<TextInputEditText>(R.id.tietNameSignup)
        val nameLayout =
            view.findViewById<TextInputLayout>(R.id.tilNameSignup)
        val password =
            view.findViewById<TextInputEditText>(R.id.tietPasswordSignup)
        val passwordLayout =
            view.findViewById<TextInputLayout>(R.id.tilPasswordSignup)
        val passwordConfirmation =
            view.findViewById<TextInputEditText>(R.id.tietPasswordConfirmSignup).text.toString()
        val passwordConfirmationLayout =
            view.findViewById<TextInputLayout>(R.id.tilPasswordConfirmSignup)

        putError(name.text.toString(), nameLayout)
        putError(password.text.toString(), passwordLayout)
        cleanError(name, nameLayout)
        cleanError(password, passwordLayout)

        if (passwordConfirmation != password.text.toString() || passwordConfirmation.isEmpty()) {
            passwordConfirmationLayout.isErrorEnabled = true
            passwordConfirmationLayout.error = "it's different"
        } else {
            passwordConfirmationLayout.isErrorEnabled = false
        }
    }

    private fun putError(label: String, layout: TextInputLayout) {
        if (label.isEmpty()) {
            layout.isErrorEnabled = true
            layout.error = "it's empty"
        }
    }

    private fun cleanError(input: TextInputEditText, layout: TextInputLayout) {
        input.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                layout.isErrorEnabled = false
                layout.error = ""
            }
        })
    }
}