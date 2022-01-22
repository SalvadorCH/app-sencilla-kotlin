package com.example.appsencilla


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnShowName: Button
    lateinit var etName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowName=findViewById(R.id.btnShowName)
        etName=findViewById(R.id.etName)

        btnShowName.setOnClickListener { checkValue() }

    }

    fun checkValue(){
        if(etName.text.isNotEmpty()){
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("INTENT.NAME",etName.text)
            startActivity(intent)
        }else{
            showEmptyErrorName()
        }
    }

    fun showEmptyErrorName(){
        Toast.makeText(this,"El campo nombre esta vacio", Toast.LENGTH_SHORT).show()
    }
}