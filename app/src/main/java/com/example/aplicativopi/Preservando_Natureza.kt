package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Preservando_Natureza : AppCompatActivity() {

    var inicio: ImageView? = null
    var textoquee: TextView? = null
    var oquee: ImageView? = null
    var descrioquee: TextView? = null
    var textcuidar: TextView? = null
    var cuidar: ImageView? = null
    var descricuidar: TextView? = null
    var textreciclar: TextView? = null
    var reciclar: ImageView? = null
    var descrireciclar: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preservando_natureza)

        inicio = findViewById(R.id.menu)
        inicio!!.setOnClickListener {
            val intent = Intent(this@Preservando_Natureza, Menu::class.java)
            startActivity(intent)
        }


        textcuidar = findViewById(R.id.textcuidar)
        textcuidar!!.setOnClickListener {
            val intent = Intent(this@Preservando_Natureza, Cuidar_Meio_Ambiete::class.java)
            startActivity(intent)
        }

        cuidar = findViewById(R.id.cuidar)
        cuidar!!.setOnClickListener {
            val intent = Intent(this@Preservando_Natureza, Cuidar_Meio_Ambiete::class.java)
            startActivity(intent)
        }

        descricuidar = findViewById(R.id.descricuidar)
        descricuidar!!.setOnClickListener {
            val intent = Intent(this@Preservando_Natureza, Cuidar_Meio_Ambiete::class.java)
            startActivity(intent)
        }


        textreciclar = findViewById(R.id.textreciclar)
        textreciclar!!.setOnClickListener {
            val intent = Intent(this@Preservando_Natureza, Reciclando::class.java)
            startActivity(intent)
        }

        reciclar = findViewById(R.id.reciclar)
        reciclar!!.setOnClickListener {
            val intent = Intent(this@Preservando_Natureza, Reciclando::class.java)
            startActivity(intent)
        }

        descrireciclar = findViewById(R.id.descrireciclar)
        descrireciclar!!.setOnClickListener {
            val intent = Intent(this@Preservando_Natureza, Reciclando::class.java)
            startActivity(intent)
        }


    }
}