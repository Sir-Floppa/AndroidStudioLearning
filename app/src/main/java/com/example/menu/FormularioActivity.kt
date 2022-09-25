package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btnConfirmar.setOnClickListener{
            var nombre = txtNombre2.text.toString()
            var apellido = txtApellido2.text.toString()
            var telefono = txtTelefono.text.toString()
            var saludar = radioSaludar.isChecked
            var despedir = radioDespedir.isChecked

            var condicion =
                nombre != "" &&
                apellido != "" &&
                telefono != "" &&
                (saludar || despedir)

            if (condicion) {
                var msje: String = ""
                if (saludar) {
                    msje = "Hola, ${nombre} ${apellido}! Tu telefono es ${telefono}."
                    Toast.makeText(this, msje, Toast.LENGTH_LONG).show()
                }
                else if (despedir) {
                    msje = "Adios, ${nombre}!"
                    Toast.makeText(this, msje, Toast.LENGTH_LONG).show()
                    this.finish()
                }
            }
        }

        btnVolver4.setOnClickListener{
            this.finish()
        }
    }
}