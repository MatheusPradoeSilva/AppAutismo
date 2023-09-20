package com.example.aplicativopi

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Menu : AppCompatActivity() {
    private var inicio: ImageView? = null
    private var videoicon: ImageView? = null
    private var casa: ImageView? = null
    private var saibamais: ImageView? = null
    private var tutoriais: ImageView? = null
    private var quemsomos: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        saibamais = findViewById(R.id.saibamais)
        saibamais!!.setOnClickListener {
            val intent = Intent(this@Menu, Saiba_Mais::class.java)
            startActivity(intent)
        }


        quemsomos = findViewById(R.id.quemsomos)
        quemsomos!!.setOnClickListener {
            val intent = Intent(this@Menu, Quem_Somos::class.java)
            startActivity(intent)
        }

        inicio = findViewById(R.id.menu)
        inicio!!.setOnClickListener {
            val intent = Intent(this@Menu, MainActivity::class.java)
            startActivity(intent)
        }

        casa = findViewById(R.id.casa)
        casa!!.setOnClickListener {
            val intent = Intent(this@Menu, MainActivity::class.java)
            startActivity(intent)
        }

        videoicon = findViewById(R.id.videoicon)
        videoicon!!.setOnClickListener {
            val intent = Intent(this@Menu, Videos_Educativos::class.java)
            startActivity(intent)
        }

        tutoriais = findViewById(R.id.tutoriais)
        tutoriais!!.setOnClickListener {
            val intent = Intent(this@Menu, Tutoriais::class.java)
            startActivity(intent)
        }
    }


}