package com.digitalhouse.aula31api.data.api

interface OnResult<T> {
    fun onSucess(result: T)
    fun onFailure()
}