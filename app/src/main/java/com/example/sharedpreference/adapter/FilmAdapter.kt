package com.example.sharedpreference.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.sharedpreference.R
import com.example.sharedpreference.databinding.FilmItemBinding
import com.example.sharedpreference.model.Film

class FilmAdapter(private val listFilm:ArrayList<Film>): RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    lateinit var binding: FilmItemBinding

    class ViewHolder (var view: FilmItemBinding): RecyclerView.ViewHolder(view.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = FilmItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listFilm.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.filmList = listFilm[position]
        holder.view.cvFilm.setOnClickListener {
            val bundle = Bundle()
            bundle.putParcelable("DATA",listFilm[position])
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_detailFragment,bundle)
        }
    }
}