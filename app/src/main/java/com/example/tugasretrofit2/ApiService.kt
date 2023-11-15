package com.example.tugasretrofit2

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("?q=danasari")
    fun getAllProvince(): Call<Province>
}