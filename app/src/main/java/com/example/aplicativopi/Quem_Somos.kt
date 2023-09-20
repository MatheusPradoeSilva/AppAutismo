package com.example.aplicativopi

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView

class Quem_Somos : AppCompatActivity() {
    var quemsomos: ImageView? = null
    var link: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quem_somos)


        quemsomos = findViewById(R.id.menu)
        quemsomos!!.setOnClickListener {
            val intent = Intent(this@Quem_Somos, Menu::class.java)
            startActivity(intent)
        }

        link = findViewById<View>(R.id.link) as TextView
        link!!.setOnClickListener {
            viewpdf() }

    }
    private fun viewpdf() {
        // add the link of pdf
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://kirabarbosa05.wixsite.com/meusite"))

        // start activity
        startActivity(intent)
    }


}