package com.jefferson.application.desafio

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ActivityLista : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)



        var btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener(this)
    }
}
