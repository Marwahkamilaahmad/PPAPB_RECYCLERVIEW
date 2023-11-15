package com.example.tugasretrofit2

import com.google.gson.annotations.SerializedName

data class Province(
    @SerializedName("data")
    val `data`: List<Data>
)
