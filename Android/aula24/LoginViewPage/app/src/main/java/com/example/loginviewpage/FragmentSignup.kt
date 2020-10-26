package com.example.loginviewpage

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.fragment_signup.*


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
        val btnSignup = view.findViewById<Button>(R.id.btnSignup)

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
            }
        }
    }

    private fun errorHandler(view: View) {
        val name =
            view.findViewById<TextInputEditText>(R.id.tietNameSignup).text.toString()
        val nameLayout =
            view.findViewById<TextInputLayout>(R.id.tilNameSignup)
        val password =
            view.findViewById<TextInputEditText>(R.id.tietPasswordSignup).text.toString()
        val passwordLayout =
            view.findViewById<TextInputLayout>(R.id.tilPasswordSignup)
        val passwordConfirmation =
            view.findViewById<TextInputEditText>(R.id.tietPasswordConfirmSignup).text.toString()
        val passwordConfirmationLayout =
            view.findViewById<TextInputLayout>(R.id.tilPasswordConfirmSignup)

        errorLabel(name, nameLayout)
        errorLabel(password, passwordLayout)

        if (passwordConfirmation != password || passwordConfirmation.isEmpty()) {
            passwordConfirmationLayout.isErrorEnabled = true
            passwordConfirmationLayout.error = "it's different"
        } else {
            passwordConfirmationLayout.isErrorEnabled = false
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