package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contador.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_saludar.*

class ContadorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contador)

        var contador = 0

        btnContar.setOnClickListener{
            contador++
            txtContador.setText(contador.toString())
        }

        btnReiniciar.setOnClickListener{
            contador = 0
            txtContador.setText(contador.toString())
        }

        btnVolver2.setOnClickListener{
            this.finish()
        }
    }
}