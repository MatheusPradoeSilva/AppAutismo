package com.example.aplicativopi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    var menu: ImageView? = null
    var acoescotidianas: Button? = null
    var musica: Button? = null
    var ante: Button? = null
    var silabas: Button? = null


    var abelha: VideoView? = null
    var mediaControls: MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu::class.java)
            startActivity(intent)
        }
        acoescotidianas = findViewById(R.id.acoescotidianas)
        acoescotidianas!!.setOnClickListener {
            val intent = Intent(this@MainActivity, Acoes_Cotidianas::class.java)
            startActivity(intent)
        }

        musica = findViewById(R.id.musica)
        musica!!.setOnClickListener {
            val intent = Intent(this@MainActivity, Musicas_Educativas::class.java)
            startActivity(intent)
        }

        ante = findViewById(R.id.ante)
        ante!!.setOnClickListener {
            val intent = Intent(this@MainActivity, Antecessores_e_Sucessores::class.java)
            startActivity(intent)
        }

        silabas = findViewById(R.id.silabas)
        silabas!!.setOnClickListener {
            val intent = Intent(this@MainActivity, Jogo_das_Silabas::class.java)
            startActivity(intent)
        }


    }
}