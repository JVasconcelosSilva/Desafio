package com.jefferson.application.desafio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ListView
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class ActivityLista : AppCompatActivity(), View.OnClickListener {

    lateinit var listView : ListView
    lateinit var movieAdapter : ArrayAdapter<String>
    var movies = mutableListOf<String>()

    override fun onClick(v: View?) {
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        //val rvLista = findViewById(R.id.RvLista) as RecyclerView
        //rvLista.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        listView = ListView(this)
        setContentView(listView)
        movieAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, movies)
        listView.adapter = movieAdapter

        val api = Api()
        api.loadMovies()?.subscribeOn(Schedulers.io())?.observeOn(AndroidSchedulers.mainThread())?.subscribe ({ movie ->
            movies.add("${movie.id} -- ${movie.movie}  -- ${movie.year}")
        }, { e ->
            e.printStackTrace()
        },{
            movieAdapter.notifyDataSetChanged()
        })

        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener(this)
    }
}

