package com.paulo.sharedprefsatividade

import android.content.Context.MODE_PRIVATE
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.navigation.fragment.findNavController


class LoginFragment : Fragment() {

    lateinit var _view: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _view = view

        checkBoxListener()
        buttonListener()
    }

    private fun checkBoxListener() {
        val checkBox = _view.findViewById<CheckBox>(R.id.checkBox)

        val prefs = _view.context.getSharedPreferences(APP_NAME, MODE_PRIVATE)

        val prefsChecked = prefs.getBoolean(SAVED_PREFS, false)

        checkBox.isChecked = prefsChecked

        if (checkBox.isChecked) {
            val navController = findNavController()
            navController.navigate(R.id.action_loginFragment_to_homeFragment)
        }

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            prefs.edit().putBoolean(SAVED_PREFS, isChecked).apply()
        }
    }

    private fun buttonListener() {
        _view.findViewById<Button>(R.id.button).setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.action_loginFragment_to_homeFragment)
        }
    }

    companion object {
        const val APP_NAME = "SharedPrefs"
        const val SAVED_PREFS = "SAVED_PREFS"
    }
}