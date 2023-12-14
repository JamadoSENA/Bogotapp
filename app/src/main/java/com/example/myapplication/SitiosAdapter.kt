package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ViewSitioItemBinding
class SitiosAdapter(private val sitios: List<Sitio>): RecyclerView.Adapter<SitiosAdapter.ViewHolder>() {

    class ViewHolder(val binding: ViewSitioItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(sitio: Sitio){
            binding.nombre.text = sitio.nombre
            binding.descripcion.text = sitio.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewSitioItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return sitios.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(sitios[position])
    }
}