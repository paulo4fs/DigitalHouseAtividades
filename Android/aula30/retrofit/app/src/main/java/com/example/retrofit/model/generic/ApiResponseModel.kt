package com.example.retrofit.model.generic

import com.google.gson.annotations.SerializedName

data class ApiResponseModel<T>(
    val info: PageInfoModel,
    @SerializedName("results")
    val resultado: List<T>
)