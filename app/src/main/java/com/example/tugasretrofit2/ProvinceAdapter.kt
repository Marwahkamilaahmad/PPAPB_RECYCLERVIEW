package com.example.tugasretrofit2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasretrofit2.databinding.ActivityMainBinding
import com.example.tugasretrofit2.databinding.ItemProvinceBinding

class ProvinceAdapter(private val listProvince: List<Data>,):
    RecyclerView.Adapter<ProvinceAdapter.ItemProvinceViewHolder>(){

        inner class ItemProvinceViewHolder(private val binding: ItemProvinceBinding):RecyclerView.ViewHolder(binding.root){
           fun bind(data: Data){
               with(binding){
                   namaProvince.text = data.province
                   namaCity.text = data.city
                   namaVillage.text = data.village
                   namaPostalcode.text = data.postalCode.toString()

               }
           }

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemProvinceViewHolder {
        val binding = ItemProvinceBinding.inflate(LayoutInflater.from(parent.context),parent, false )
            return ItemProvinceViewHolder(binding)
    }

    override fun getItemCount(): Int = listProvince.size

    override fun onBindViewHolder(holder: ItemProvinceViewHolder, position: Int) {
        holder.bind(listProvince[position])

    }


}