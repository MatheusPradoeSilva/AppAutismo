package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Quebra_Cabeca : AppCompatActivity() {
     var menu: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quebra_cabeca)
        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Quebra_Cabeca, Menu::class.java)
            startActivity(intent)

        }
    }
}