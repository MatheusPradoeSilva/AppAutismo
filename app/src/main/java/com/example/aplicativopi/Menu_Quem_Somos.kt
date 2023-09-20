package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Menu_Quem_Somos : AppCompatActivity() {
    var videos: ImageView? = null
    var inicio: ImageView? = null
    var saibamais: ImageView? = null
    var tutoriais: ImageView? = null
    var quemsomos: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_quem_somos)


        quemsomos = findViewById(R.id.quemsomos)
        quemsomos!!.setOnClickListener {
            val intent = Intent(this@Menu_Quem_Somos, Quem_Somos::class.java)
            startActivity(intent)
        }

        saibamais = findViewById(R.id.saibamais)
        saibamais!!.setOnClickListener {
            val intent = Intent(this@Menu_Quem_Somos, Saiba_Mais::class.java)
            startActivity(intent)
        }

        quemsomos = findViewById(R.id.menu)
        quemsomos!!.setOnClickListener {
            val intent = Intent(this@Menu_Quem_Somos, Quem_Somos::class.java)
            startActivity(intent)
        }

        inicio = findViewById(R.id.casa)
        inicio!!.setOnClickListener {
            val intent = Intent(this@Menu_Quem_Somos, MainActivity::class.java)
            startActivity(intent)
        }
        tutoriais = findViewById(R.id.tutoriais)
        tutoriais!!.setOnClickListener {
            val intent = Intent(this@Menu_Quem_Somos, Tutoriais::class.java)
            startActivity(intent)
        }
        videos = findViewById(R.id.videoicon)
        videos!!.setOnClickListener {
            val intent = Intent(this@Menu_Quem_Somos, Videos_Educativos::class.java)
            startActivity(intent)
        }
    }
}