package com.example.aplicativopi
import android.content.Intent
import android.graphics.SurfaceTexture
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.Surface
import android.view.TextureView
import android.view.View
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Banho : AppCompatActivity() {

    private lateinit var textureView: TextureView
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var playPauseImageView: ImageView
    private lateinit var stopButton: ImageView
    private lateinit var progressSeekBar: SeekBar
    private val handler = Handler()
    private var isPlaying = false
    var menu: ImageView? = null
    var dentinhospdf: TextView? = null
    var linkvideo: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banho)

        menu = findViewById(R.id.menu)
        menu!!.setOnClickListener {
            val intent = Intent(this@Banho, Menu::class.java)
            startActivity(intent)
        }

        textureView = findViewById(R.id.textureView)
        playPauseImageView = findViewById(R.id.playPauseImageView)
        progressSeekBar = findViewById(R.id.progressSeekBar)

        // Configurar um SurfaceTextureListener para a TextureView
        textureView.surfaceTextureListener = object : TextureView.SurfaceTextureListener {
            override fun onSurfaceTextureAvailable(
                surfaceTexture: SurfaceTexture,
                width: Int,
                height: Int
            ) {
                // Quando a superfície estiver pronta, configure o MediaPlayer
                val surface = Surface(surfaceTexture)
                mediaPlayer = MediaPlayer()

                try {
                    // Carregue o vídeo a partir dos recursos raw
                    val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.banho)
                    mediaPlayer.setDataSource(applicationContext, videoUri)
                    mediaPlayer.setSurface(surface)
                    mediaPlayer.isLooping = true // Repetir o vídeo



                    mediaPlayer.prepareAsync() // Preparar o MediaPlayer de forma assíncrona
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                // Iniciar a atualização da SeekBar de progresso
                progressSeekBar.max = mediaPlayer.duration

                startProgressUpdate()
            }

            override fun onSurfaceTextureSizeChanged(surface: SurfaceTexture, width: Int, height: Int) {
                // Lidar com mudanças no tamanho da superfície, se necessário
            }

            override fun onSurfaceTextureDestroyed(surface: SurfaceTexture): Boolean {
                // Lidar com a destruição da superfície, se necessário
                return true
            }

            override fun onSurfaceTextureUpdated(surface: SurfaceTexture) {
                // Atualizações da superfície (não usadas neste exemplo)
            }

            // ... Outros métodos do SurfaceTextureListener ...
        }

        playPauseImageView.setOnClickListener {
            if (isPlaying) {
                mediaPlayer.pause()
                playPauseImageView.setImageResource(R.drawable.ic_play) // Altere para a imagem "play"
            } else {
                mediaPlayer.start()
                playPauseImageView.setImageResource(R.drawable.ic_pause) // Altere para a imagem "pause"
            }
            isPlaying = !isPlaying // Inverta o estado de reprodução
        }




        progressSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Atualize a posição de reprodução do vídeo quando o usuário arrastar a SeekBar de progresso
                if (fromUser) {
                    mediaPlayer.seekTo(progress)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // Não necessário
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // Não necessário
            }
        })


        linkvideo = findViewById<View>(R.id.linkvideo) as TextView
        linkvideo!!.setOnClickListener {
            linkvideo() }
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(progressUpdateRunnable) // Pare a atualização da SeekBar de progresso
        mediaPlayer.release()
    }

    private val progressUpdateRunnable = object : Runnable {
        override fun run() {
            if (mediaPlayer.isPlaying) {
                val currentPosition = mediaPlayer.currentPosition
                progressSeekBar.progress = currentPosition
            }
            handler.postDelayed(this, 1000) // Atualize a cada segundo
        }
    }

    private fun startProgressUpdate() {
        handler.post(progressUpdateRunnable)
    }

    private fun linkvideo() {
        // add the link of pdf
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=s9p9m0ebJmg&pp=ygUVcmF0aW5obyB0b21hbmRvIGJhbmhv"))

        // start activity
        startActivity(intent)
    }
}
