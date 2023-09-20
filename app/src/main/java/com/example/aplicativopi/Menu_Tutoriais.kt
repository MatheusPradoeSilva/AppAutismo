package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Menu_Tutoriais : AppCompatActivity() {

    var videos: ImageView? = null
    var inicio: ImageView? = null
    var video: ImageView? = null
    var saibamais: ImageView? = null
    var tutoriais: ImageView?=null
    var quemsomos: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_tutoriais)
        videos = findViewById(R.id.menu)
        videos!!.setOnClickListener {
            val intent = Intent(this@Menu_Tutoriais, Videos_Educativos::class.java)
            startActivity(intent)
        }
        saibamais = findViewById(R.id.saibamais)
        saibamais!!.setOnClickListener {
            val intent = Intent(this@Menu_Tutoriais, Saiba_Mais::class.java)
            startActivity(intent)
        }

        video = findViewById(R.id.videoicon)
        video!!.setOnClickListener {
            val intent = Intent(this@Menu_Tutoriais, Videos_Educativos::class.java)
            startActivity(intent)
        }

        inicio = findViewById(R.id.casa)
        inicio!!.setOnClickListener {
            val intent = Intent(this@Menu_Tutoriais, MainActivity::class.java)
            startActivity(intent)
        }

        tutoriais = findViewById(R.id.tutoriais)
        tutoriais!!.setOnClickListener {
            val intent = Intent(this@Menu_Tutoriais, Tutoriais::class.java)
            startActivity(intent)
        }
        quemsomos = findViewById(R.id.quemsomos)
        quemsomos!!.setOnClickListener {
            val intent = Intent(this@Menu_Tutoriais, Quem_Somos::class.java)
            startActivity(intent)
        }
    }
}