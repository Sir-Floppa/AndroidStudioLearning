package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Activities
        val saludarIntent = Intent(this, SaludarActivity::class.java)
        val contadorIntent = Intent(this, ContadorActivity::class.java)
        val conversorIntent = Intent(this, ConversorActivity::class.java)
        val formularioIntent = Intent(this, FormularioActivity::class.java)

        btnSaludar.setOnClickListener{
            startActivity(saludarIntent)
        }

        btnContador.setOnClickListener{
            startActivity(contadorIntent)
        }

        btnConversor.setOnClickListener{
            startActivity(conversorIntent)
        }

        btnFormulario.setOnClickListener{
            startActivity(formularioIntent)
        }
    }
}