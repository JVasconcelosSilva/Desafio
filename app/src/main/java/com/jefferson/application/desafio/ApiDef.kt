package com.jefferson.application.desafio

import retrofit2.http.GET
import rx.Observable

interface ApiDef {
    @GET("19i6sb")
    fun listMovies() : Observable<FilmResult>
}
