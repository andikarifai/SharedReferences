package com.example.sharedpreference.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sharedpreference.R
import com.example.sharedpreference.model.Film

class FilmViewModel:ViewModel() {

    val list = arrayListOf(
        Film("The Shawshank Redemption","1994","Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion", R.drawable.shawsank,"9,3"),
        Film("Wayang","2000","Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion",
            R.drawable.goku,"9,3"),
        Film("The Shawshank Redemption","1994","Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion",
            R.drawable.shawsank,"9,3"),
        Film("The Shawshank Redemption","1994","Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion",
            R.drawable.shawsank,"9,3"),
        Film("The Shawshank Redemption","1994","Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion",
            R.drawable.shawsank,"9,3"),
        Film("The Shawshank Redemption","1994","Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion",
            R.drawable.shawsank,"9,3"),
    )

    val filmList: MutableLiveData<ArrayList<Film>> = MutableLiveData()

    fun getFilmList(){
        var valueFilm = list
        filmList.value = valueFilm
    }

}