package com.jefferson.application.desafio

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.URL

fun getServicesFromGSON(json: String): List<ServiceType>{
    val type = object: TypeToken<List<ServiceType>>(){}.type
    return Gson().fromJson<List<ServiceType>>(json, type)
}

fun downloadJSON(): String{
    return URL("http://localhost:3000/services").readText()
}

fun main() {
    val json = downloadJSON()

    val list = getServicesFromGSON(json)
    for (item in list)
    {
        println("${item.id} - ${item.name}")
    }
}