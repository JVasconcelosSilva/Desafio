package com.jefferson.application.desafio

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FilmesLista(val lista: ArrayList<ServiceType>): RecyclerView.Adapter<FilmesLista.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.exemplo_item, p0, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val items: ServiceType = lista[p1]

        p0.tituloFilme.text = items.movie
        p0.anoFilme.text = items.year
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tituloFilme = itemView.findViewById(R.id.tituloFilme) as TextView
        val anoFilme = itemView.findViewById(R.id.anoFilme) as TextView
    }
}

