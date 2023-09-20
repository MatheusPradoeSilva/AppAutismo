package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Musicas_Educativas : AppCompatActivity() {
    var menu: ImageView? = null
    var amigo: ImageView? = null
    var textamigo: TextView? = null
    var descriamigo: TextView? = null
    var mariana: ImageView? = null
    var textmariana: TextView? = null
    var descrimariana: TextView? = null
    var coleta: ImageView? = null
    var textcoleta: TextView? = null
    var descricoleta: TextView? = null
    var banho: ImageView? = null
    var textbanho: TextView? = null
    var describanho: TextView? = null
    var alfabeto: ImageView? = null
    var textalfabeto: TextView? = null
    var descrialfabeto: TextView? = null
    var lado: ImageView? = null
    var textlado: TextView? = null
    var descrilado: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musicas_educativas)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Menu::class.java)
            startActivity(intent)
        }

        amigo = findViewById(R.id.amigo)
        amigo!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Amigossauro::class.java)
            startActivity(intent)
        }

        textamigo = findViewById(R.id.textamigo)
        textamigo!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Amigossauro::class.java)
            startActivity(intent)
        }

        descriamigo= findViewById(R.id.descriamigo)
        descriamigo!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Amigossauro::class.java)
            startActivity(intent)
        }

        mariana= findViewById(R.id.mariana)
        mariana!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Mariana::class.java)
            startActivity(intent)
        }

        textmariana = findViewById(R.id.textmariana)
        textmariana!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Mariana::class.java)
            startActivity(intent)
        }

        descrimariana= findViewById(R.id.descrimariana)
        descrimariana!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Mariana::class.java)
            startActivity(intent)
        }

        coleta= findViewById(R.id.coleta)
        coleta!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Coleta::class.java)
            startActivity(intent)
        }

        textcoleta = findViewById(R.id.textcoleta)
        textcoleta!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Coleta::class.java)
            startActivity(intent)
        }

        descricoleta= findViewById(R.id.descricoleta)
        descricoleta!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Coleta::class.java)
            startActivity(intent)
        }
        banho= findViewById(R.id.banho)
        banho!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Banho::class.java)
            startActivity(intent)
        }

        textbanho = findViewById(R.id.textbanho)
        textbanho!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Banho::class.java)
            startActivity(intent)
        }

        describanho= findViewById(R.id.describanho)
        describanho!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Banho::class.java)
            startActivity(intent)
        }

        alfabeto= findViewById(R.id.alfabeto)
        alfabeto!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Alfabeto::class.java)
            startActivity(intent)
        }

        textalfabeto = findViewById(R.id.textalfabeto)
        textalfabeto!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Alfabeto::class.java)
            startActivity(intent)
        }

        descrialfabeto= findViewById(R.id.descrialfabeto)
        descrialfabeto!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Alfabeto::class.java)
            startActivity(intent)
        }

        lado= findViewById(R.id.lado)
        lado!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Lado::class.java)
            startActivity(intent)
        }

        textlado = findViewById(R.id.textlado)
        textlado!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Lado::class.java)
            startActivity(intent)
        }

        descrilado= findViewById(R.id.descrilado)
        descrilado!!.setOnClickListener {
            val intent = Intent(this@Musicas_Educativas, Lado::class.java)
            startActivity(intent)
        }
    }
}