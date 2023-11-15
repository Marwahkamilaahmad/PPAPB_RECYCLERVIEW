package com.example.tugasretrofit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugasretrofit2.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val client = ApiClient.getInstance()
        val response = client.getAllProvince()
        val provinceList = ArrayList<String>()

        response.enqueue(object : Callback<Province> {
            override fun onResponse(call: Call<Province>, response: Response<Province>){
                for(i in response.body()!!.data){
                    provinceList.add(i.province)
                    provinceList.add(i.city)
                    provinceList.add(i.village)
                    provinceList.add(i.postalCode.toString())
                }

                with(binding){
                    rvProvince.apply {
                        adapter = ProvinceAdapter(response.body()!!.data)
                        layoutManager = LinearLayoutManager(context)
                    }
                }
            }

            override fun onFailure(call: Call<Province>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Koneksi error",
                    Toast.LENGTH_LONG).show()
            }

        })



    }
}