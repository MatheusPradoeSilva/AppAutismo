package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Tutoriais : AppCompatActivity() {

    var tutoriais: ImageView? = null
    var quebra: Button? = null
    var ante: Button? = null
    var silabas: Button? = null
    var velha: Button? = null
    var emocoes: Button? = null
    var caixa: Button? = null
    var alfabeto: Button? = null
    var decisoes: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutoriais)

        tutoriais = findViewById(R.id.menu)
        tutoriais!!.setOnClickListener {
            val intent = Intent(this@Tutoriais, Menu::class.java)
            startActivity(intent)

        }

        quebra = findViewById(R.id.quebra)
        quebra!!.setOnClickListener {
            val intent = Intent(this@Tutoriais, Quebra_Cabeca::class.java)
            startActivity(intent)

        }

        ante = findViewById(R.id.ante)
        ante!!.setOnClickListener {
            val intent = Intent(this@Tutoriais, Antecessores_e_Sucessores::class.java)
            startActivity(intent)

        }

        silabas = findViewById(R.id.silabas)
        silabas!!.setOnClickListener {
            val intent = Intent(this@Tutoriais, Jogo_das_Silabas::class.java)
            startActivity(intent)
        }
            velha = findViewById(R.id.velha)
            velha!!.setOnClickListener {
                val intent = Intent(this@Tutoriais, Jogo_da_Velha::class.java)
                startActivity(intent)

        }
        quebra = findViewById(R.id.quebra)
        quebra!!.setOnClickListener{
            val intent = Intent(this@Tutoriais, Quebra_Cabeca::class.java)
            startActivity(intent)
        }
        emocoes = findViewById(R.id.emocoes)
        emocoes!!.setOnClickListener{
            val intent = Intent(this@Tutoriais, Jogo_das_Emocoes::class.java)
            startActivity(intent)
    }
        decisoes = findViewById(R.id.decisoes)
        decisoes!!.setOnClickListener{
            val intent = Intent(this@Tutoriais, Jogo_das_Decisoes::class.java)
            startActivity(intent)
        }
        alfabeto = findViewById(R.id.alfabeto)
        alfabeto!!.setOnClickListener{
            val intent = Intent(this@Tutoriais, Alfabeto_Divertido::class.java)
            startActivity(intent)
        }
        caixa = findViewById(R.id.caixa)
        caixa!!.setOnClickListener{
            val intent = Intent(this@Tutoriais, Caixa_Curiosa::class.java)
            startActivity(intent)
        }
    }
}