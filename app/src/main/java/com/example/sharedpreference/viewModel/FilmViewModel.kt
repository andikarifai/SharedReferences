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
        Film("The Boys","2022","Outside Vought Tower, the political battleground between Annie's and Homelander's supporters reaches a tipping point. Courtesy of Annie’s Instagram Live testimonies exposing the truth about Queen Maeve kidnapping.",
            R.drawable.tboys,"7,9"),
        Film("Dora And The Lost City of Gold","2019","Deep in the Peruvian jungle, 6-year-old Dora Márquez, daughter of jungle explorers Cole and Elena, spends her days going on adventures with her monkey friend Boots, her 7-year-old cousin Diego.",
            R.drawable.dora,"6,8"),
        Film("Spider-Man: Far from Home","2019","The film opens in a Mexican city, where Nick Fury and Maria Hill have arrived to investigate the area after a reported cyclone with a face had torn through the city.",
            R.drawable.spider,"8,5"),
        Film("The Flash","2023","Barry Allen uses his super speed to change the past, but his attempt to save his family creates a world without super heroes, forcing him to race for his life in order to save the future.",
            R.drawable.flash,"8,3"),
    )

    val filmList: MutableLiveData<ArrayList<Film>> = MutableLiveData()

    fun getFilmList(){
        var valueFilm = list
        filmList.value = valueFilm
    }

}