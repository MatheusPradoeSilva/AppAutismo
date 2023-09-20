package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.os.Bundle

class Alfabeto_Divertido: AppCompatActivity() {
    var menu: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alfabeto_divertido)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Alfabeto_Divertido, Menu::class.java)
            startActivity(intent)

        }
    }
}