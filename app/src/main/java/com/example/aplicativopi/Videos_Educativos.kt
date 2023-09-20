package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Videos_Educativos : AppCompatActivity() {

    var inicio: ImageView? = null
    var acoescotidianas: Button? = null
    var btnatureza: Button? = null
    var btmusicas: Button? = null
    var idmat: Button? = null
    var idvocab: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos_educativos)

        inicio = findViewById(R.id.menu)
        inicio!!.setOnClickListener {
            val intent = Intent(this@Videos_Educativos, Menu::class.java)
            startActivity(intent)
        }
        acoescotidianas = findViewById(R.id.acoescotidianas)
        acoescotidianas!!.setOnClickListener {
            val intent = Intent(this@Videos_Educativos, Acoes_Cotidianas::class.java)
            startActivity(intent)
        }
        btnatureza = findViewById(R.id.btnatureza)
        btnatureza!!.setOnClickListener {
            val intent = Intent(this@Videos_Educativos, Preservando_Natureza::class.java)
            startActivity(intent)
        }
        btmusicas = findViewById(R.id.btmusicas)
        btmusicas!!.setOnClickListener {
            val intent = Intent(this@Videos_Educativos, Musicas_Educativas::class.java)
            startActivity(intent)
        }

        idmat = findViewById(R.id.idmat)
        idmat!!.setOnClickListener {
            val intent = Intent(this@Videos_Educativos, Matematica::class.java)
            startActivity(intent)
        }

        idvocab = findViewById(R.id.idvocab)
        idvocab!!.setOnClickListener {
            val intent = Intent(this@Videos_Educativos, Vocabulario::class.java)
            startActivity(intent)
        }
    }

}