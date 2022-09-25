package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_saludar.*

class SaludarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludar)

        btnSaludo.setOnClickListener{
            Toast.makeText(this, "Hola, ${txtNombre.text}!", Toast.LENGTH_SHORT).show()
        }

        btnVolver.setOnClickListener{
            this.finish()
        }
    }
}