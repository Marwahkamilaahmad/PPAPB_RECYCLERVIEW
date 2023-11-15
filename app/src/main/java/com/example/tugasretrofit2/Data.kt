package com.example.tugasretrofit2

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("province")
    val province:String,
    @SerializedName("city")
    val city:String,
    @SerializedName("postalcode")
    val postalCode:Int,
    @SerializedName("village")
    val village:String
)
