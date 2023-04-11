package com.example.sharedpreference.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Film(
    val title:String,
    val release:String,
    val desc:String,
    val img:Int,
    val rating:String,
): Parcelable