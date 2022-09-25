package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contador.*
import kotlinx.android.synthetic.main.activity_conversor.*
import kotlinx.android.synthetic.main.activity_saludar.*

class ConversorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)

        val conversion = 923.32

        btnConvertir.setOnClickListener{
            if(txtUSD.text.toString() != "") {
                var clp = txtUSD.text.toString().toDouble() * conversion
                txtCLP.setText("${clp} CLP")
            }
        }

        btnVolver3.setOnClickListener{
            this.finish()
        }
    }
}