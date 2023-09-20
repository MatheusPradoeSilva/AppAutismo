package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Matematica : AppCompatActivity() {
    var menu: ImageView? = null
    var formas: ImageView? = null
    var textformas: TextView? = null
    var descriformas: TextView? = null
    var kent: ImageView? = null
    var textkent: TextView? = null
    var descrikent: TextView? = null
    var num: ImageView? = null
    var textnum: TextView? = null
    var descrinum: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matematica)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Matematica, Menu::class.java)
            startActivity(intent)
        }

        formas = findViewById(R.id.formas)
        formas!!.setOnClickListener {
            val intent = Intent(this@Matematica, Formas::class.java)
            startActivity(intent)
        }

        textformas = findViewById(R.id.textformas)
        textformas!!.setOnClickListener {
            val intent = Intent(this@Matematica, Formas::class.java)
            startActivity(intent)
        }

        descriformas= findViewById(R.id.descriformas)
        descriformas!!.setOnClickListener {
            val intent = Intent(this@Matematica, Formas::class.java)
            startActivity(intent)
        }

        kent = findViewById(R.id.kent)
        kent!!.setOnClickListener {
            val intent = Intent(this@Matematica, Kent::class.java)
            startActivity(intent)
        }

        textkent = findViewById(R.id.textkent)
        textkent!!.setOnClickListener {
            val intent = Intent(this@Matematica, Kent::class.java)
            startActivity(intent)
        }

        descrikent= findViewById(R.id.descrikent)
        descrikent!!.setOnClickListener {
            val intent = Intent(this@Matematica, Kent::class.java)
            startActivity(intent)
        }

        num = findViewById(R.id.num)
        num!!.setOnClickListener {
            val intent = Intent(this@Matematica, Numeros::class.java)
            startActivity(intent)
        }

        textnum = findViewById(R.id.textnum)
        textnum!!.setOnClickListener {
            val intent = Intent(this@Matematica, Numeros::class.java)
            startActivity(intent)
        }

        descrinum= findViewById(R.id.descrinum)
        descrinum!!.setOnClickListener {
            val intent = Intent(this@Matematica, Numeros::class.java)
            startActivity(intent)
        }
    }
}