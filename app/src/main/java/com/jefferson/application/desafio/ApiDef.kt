package com.jefferson.application.desafio

import retrofit2.http.GET
import rx.Observable

interface ApiDef {
    @GET("films")
    fun listMovies() : Observable<FilmResult>

}
