package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Vocabulario : AppCompatActivity() {
    var menu: ImageView? = null
    var animais: ImageView? = null
    var textanimais: TextView? = null
    var descrianimais: TextView? = null
    var fazenda: ImageView? = null
    var textfazenda: TextView? = null
    var descrifazenda: TextView? = null
    var selvagens: ImageView? = null
    var textselvagens: TextView? = null
    var descriselvagens: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vocabulario)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Vocabulario, Menu::class.java)
            startActivity(intent)
        }

        animais = findViewById(R.id.animais)
        animais!!.setOnClickListener {
            val intent = Intent(this@Vocabulario, Domesticos::class.java)
            startActivity(intent)
        }

        textanimais = findViewById(R.id.textanimais)
        textanimais!!.setOnClickListener {
            val intent = Intent(this@Vocabulario, Domesticos::class.java)
            startActivity(intent)
        }

        descrianimais= findViewById(R.id.descrianimais)
        descrianimais!!.setOnClickListener {
            val intent = Intent(this@Vocabulario, Domesticos::class.java)
            startActivity(intent)
        }

       fazenda = findViewById(R.id.fazenda)
        fazenda!!.setOnClickListener {
            val intent = Intent(this@Vocabulario, Fazenda::class.java)
            startActivity(intent)
        }

        textfazenda = findViewById(R.id.textfazenda)
        textfazenda!!.setOnClickListener {
            val intent = Intent(this@Vocabulario, Fazenda::class.java)
            startActivity(intent)
        }

        descrifazenda= findViewById(R.id.descrifazenda)
        descrifazenda!!.setOnClickListener {
            val intent = Intent(this@Vocabulario, Fazenda::class.java)
            startActivity(intent)
        }


        selvagens = findViewById(R.id.selvagens)
        selvagens!!.setOnClickListener {
            val intent = Intent(this@Vocabulario, Selvagens::class.java)
            startActivity(intent)
        }

        textselvagens= findViewById(R.id.textselvagens)
        textselvagens!!.setOnClickListener {
            val intent = Intent(this@Vocabulario, Selvagens::class.java)
            startActivity(intent)
        }

        descriselvagens= findViewById(R.id.descriselvagens)
        descriselvagens!!.setOnClickListener {
            val intent = Intent(this@Vocabulario, Selvagens::class.java)
            startActivity(intent)
        }

    }
}