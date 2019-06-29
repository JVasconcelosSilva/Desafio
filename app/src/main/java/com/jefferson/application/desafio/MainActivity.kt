package com.jefferson.application.desafio

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        val intent = Intent(this, ActivityLista::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnLista = findViewById<Button>(R.id.btnLista)

        btnLista.setOnClickListener(this)
    }
}
