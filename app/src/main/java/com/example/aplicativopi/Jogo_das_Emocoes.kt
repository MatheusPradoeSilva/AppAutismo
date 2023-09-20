package com.example.aplicativopi

import android.content.Intent
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Jogo_das_Emocoes : AppCompatActivity() {
    var menu: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo_das_emocoes)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Jogo_das_Emocoes, Menu::class.java)
            startActivity(intent)

        }
    }
}