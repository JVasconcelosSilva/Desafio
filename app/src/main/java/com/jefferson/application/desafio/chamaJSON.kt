package com.jefferson.application.desafio

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.URL

fun downloadJSON(): String{
    // Arquivo JSON hospedado, seu conteúdo é apenas para teste no momento
    return URL("https://api.myjson.com/bins/lihcf").readText()
}

fun getServicesFromGSON(json: String): List<ServiceType>{
    val type = object: TypeToken<List<ServiceType>>(){}.type
    return Gson().fromJson(json, type)
}

// main utilizado para testes em linha de comando, será removido ao final do projeto
/*
fun main() {
    val json = downloadJSON()
    val list = getServicesFromGSON(json)
    val items = ArrayList<ServiceType>()
    for (item in list)
    {
        items.add(ServiceType(item.id, item.movie, item.year))
    }
    println(items)
}
*/