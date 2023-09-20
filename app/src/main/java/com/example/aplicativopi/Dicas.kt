package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Dicas : AppCompatActivity() {
    var dica1: Button? = null
    var dica2: Button? = null
    var dica3: Button? = null
    var dica4: Button? = null
    var dica5: Button? = null
    var dica6: Button? = null
    var dica7: Button? = null
    var menu: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dicas)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Dicas, Menu::class.java)
            startActivity(intent)

        }

        dica1 = findViewById(R.id.dica1)
        dica1!!.setOnClickListener {
            val intent = Intent(this@Dicas, Dica1::class.java)
            startActivity(intent)

        }

        dica2 = findViewById(R.id.dica2)
        dica2!!.setOnClickListener {
            val intent = Intent(this@Dicas, Dica2::class.java)
            startActivity(intent)

        }

        dica3 = findViewById(R.id.dica3)
        dica3!!.setOnClickListener {
            val intent = Intent(this@Dicas, Dica3::class.java)
            startActivity(intent)

        }

        dica4 = findViewById(R.id.dica4)
        dica4!!.setOnClickListener {
            val intent = Intent(this@Dicas, Dica4::class.java)
            startActivity(intent)

        }

        dica5 = findViewById(R.id.dica5)
        dica5!!.setOnClickListener {
            val intent = Intent(this@Dicas, Dica5::class.java)
            startActivity(intent)

        }

        dica6 = findViewById(R.id.dica6)
        dica6!!.setOnClickListener {
            val intent = Intent(this@Dicas, Dica6::class.java)
            startActivity(intent)

        }

        dica7 = findViewById(R.id.dica7)
        dica7!!.setOnClickListener {
            val intent = Intent(this@Dicas, Dica7::class.java)
            startActivity(intent)

        }
    }
}