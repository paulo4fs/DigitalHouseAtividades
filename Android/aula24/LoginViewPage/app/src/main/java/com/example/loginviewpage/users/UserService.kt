package com.example.loginviewpage.users

import java.lang.Exception

class UserService {
    companion object {
        val users = arrayListOf<User>()

        /**
         * Realiza login
         */
        fun login(name: String, password: String): User? {
            return users.find {
                it.name == name.toLowerCase().trim()
                        && it.password == password
            }
        }

        /**
         * Registra um usuário
         */
        fun register(name: String, password: String) {
            // Verifica se já existe usuário com email cadastrado
            val user = users.find {
                it.name == name.toLowerCase().trim()
            }
            users.add(User(name.trim(), password))
        }
    }
}