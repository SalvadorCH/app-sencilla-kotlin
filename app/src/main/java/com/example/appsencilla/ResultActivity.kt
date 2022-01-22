package com.example.appsencilla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    lateinit var btnVolver:Button
    lateinit var tvNombre:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        btnVolver=findViewById(R.id.btnVolver)
        tvNombre=findViewById(R.id.tvNombre)

        btnVolver.setOnClickListener { onBackPressed() }

        getAndShowName()
    }

    fun getAndShowName(){
        val bundle = intent.extras
        val name = bundle?.get("INTENT.NAME")
        tvNombre.text="$name"
    }
}