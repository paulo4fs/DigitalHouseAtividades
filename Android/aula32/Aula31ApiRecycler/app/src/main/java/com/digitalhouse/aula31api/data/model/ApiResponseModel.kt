package com.digitalhouse.aula31api.data.model

data class ApiResponseModel<T> (
    val info: PageInfoModel,
    val results: List<T>
)