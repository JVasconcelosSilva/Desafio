package com.jefferson.application.desafio

import com.google.gson.annotations.SerializedName

data class FilmResult(val results : List<Film>)

data class Film (@SerializedName("id")
                 val id : String,
                 @SerializedName("movie")
                 val movie : String,
                 @SerializedName("year")
                 val year : String)