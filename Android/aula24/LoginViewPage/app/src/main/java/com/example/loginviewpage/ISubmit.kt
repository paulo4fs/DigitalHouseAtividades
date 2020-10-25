package com.example.loginviewpage

interface ISubmit {
    fun signup(name: String, password: String)
    fun signin(name: String, password: String)
}