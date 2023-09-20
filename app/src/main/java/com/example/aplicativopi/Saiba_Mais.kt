package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Saiba_Mais : AppCompatActivity() {
    var video: ImageView? = null
    var di: Button? = null
    var dicas: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saiba_mais)
        video = findViewById(R.id.menu)
        video!!.setOnClickListener {
            val intent = Intent(this@Saiba_Mais, Menu::class.java)
            startActivity(intent)

        }
        di = findViewById(R.id.di)
        di!!.setOnClickListener {
            val intent = Intent(this@Saiba_Mais, O_Que_e_DI::class.java)
            startActivity(intent)
        }

        dicas = findViewById(R.id.dicas)
        dicas!!.setOnClickListener {
            val intent = Intent(this@Saiba_Mais, Dicas::class.java)
            startActivity(intent)
        }
    }
}