package com.example.aplicativopi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class Acoes_Cotidianas : AppCompatActivity() {
    var menu: ImageView? = null
    var escovardentinhos: ImageView? = null
    var textescovar: TextView? = null
    var descriescovar: TextView? = null
    var palavras: ImageView? = null
    var textpalavras: TextView? = null
    var descripalavras: TextView? = null
    var mika: ImageView? = null
    var textmika: TextView? = null
    var descrimika: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acoes_cotidianas)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Menu::class.java)
            startActivity(intent)
        }

        escovardentinhos = findViewById(R.id.escovardentinhos)
        escovardentinhos!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Escovar_Dentinhos::class.java)
            startActivity(intent)
        }

        textescovar = findViewById(R.id.textescovar)
        textescovar!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Escovar_Dentinhos::class.java)
            startActivity(intent)
        }

        descriescovar = findViewById(R.id.descriescovar)
        descriescovar!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Escovar_Dentinhos::class.java)
            startActivity(intent)
        }

        palavras = findViewById(R.id.palavras)
        palavras!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Palavinhas_Magicas::class.java)
            startActivity(intent)
        }

        textpalavras = findViewById(R.id.textpalavras)
        textpalavras!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Palavinhas_Magicas::class.java)
            startActivity(intent)
        }

        descripalavras = findViewById(R.id.descripalavras)
        descripalavras!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Palavinhas_Magicas::class.java)
            startActivity(intent)
        }

        mika = findViewById(R.id.mika)
        mika!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Origanizacao::class.java)
            startActivity(intent)
        }

        textmika = findViewById(R.id.textmika)
        textmika!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Origanizacao::class.java)
            startActivity(intent)
        }

        descrimika = findViewById(R.id.descrimika)
        descrimika!!.setOnClickListener {
            val intent = Intent(this@Acoes_Cotidianas, Origanizacao::class.java)
            startActivity(intent)
        }
    }


}