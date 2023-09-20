package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Dica7 : AppCompatActivity() {

    var menu: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dica7)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Dica7, Menu::class.java)
            startActivity(intent)

        }
    }
}