package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Antecessores_e_Sucessores : AppCompatActivity() {
    var menu: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_antecessores_esucessores)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Antecessores_e_Sucessores, Menu::class.java)
            startActivity(intent)

        }
    }
}