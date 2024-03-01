package com.example.ejercisio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imagenDato: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imagenDato = findViewById(R.id.imagenDado)
    }
    //metodo especial para acciones
    fun lanzarDado(v: View){
        Log.e("ErrorDato", "Se presiono el boton mi pa")
        val numeroAlAzar = Random.nextInt(6)+1
        val recurso = when(numeroAlAzar){
            1->{
                R.drawable.dice_1
            }
            2->{
                R.drawable.dice_2
            }
            3->{
                R.drawable.dice_3
            }
            4->{
                R.drawable.dice_4
            }
            5->{
                R.drawable.dice_5
            }
            else -> {
                R.drawable.dice_6
            }
        }//when
        imagenDato.setImageResource(recurso)
        mostrarMensaje("Número generado: $numeroAlAzar")
        imagenDato.setImageResource(recurso)
    }
    private fun mostrarMensaje(mensaje: String) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

}