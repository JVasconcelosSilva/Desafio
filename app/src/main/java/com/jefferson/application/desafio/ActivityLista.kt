package com.jefferson.application.desafio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class ActivityLista : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val rvLista = findViewById(R.id.RvLista) as RecyclerView
        rvLista.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val items = ArrayList<ServiceType>()

        // O App para de funcionar a partir desta linha
        val json = downloadJSON()
        val list = getServicesFromGSON(json)

        for (item in list)
        {
            items.add(ServiceType(item.id, item.movie, item.year))
        }

        // adicionar os itens diretamente funciona (REMOVER DEPOIS)
        //items.add(ServiceType("2","filme2", "2009"))
        //items.add(ServiceType("3","filme3", "2010"))

        val adapter = FilmesLista(items)
        rvLista.adapter = adapter

        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener(this)
    }
}
