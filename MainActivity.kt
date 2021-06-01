package com.example.andreicarrillorfc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txtnombre = findViewById<EditText>(R.id.nombre).toString()
        var txtapellido = findViewById<EditText>(R.id.apellido).toString()
        var txtapellido2 = findViewById<EditText>(R.id.apellido2).toString()
        var dia = findViewById<EditText>(R.id.dia).toString()
        var mes = findViewById<EditText>(R.id.mes).toString()
        var anio = findViewById<EditText>(R.id.anio).toString()

        btncrear.setOnClickListener {
            var rfc = findViewById<TextView>(R.id.texxrfc)
            rfc.text = (txtapellido[0].toString()+txtapellido[1]+txtapellido2[0]+txtnombre+dia+mes+anio[2]+anio[3])
        }
        btnlimpiar.setOnClickListener {
            var nombre = findViewById<EditText>(R.id.nombre)
            nombre.text.clear()
            var apellido = findViewById<EditText>(R.id.apellido)
            apellido.text.clear()
            var apellido2 = findViewById<EditText>(R.id.apellido2)
            apellido2.text.clear()
            var dia = findViewById<EditText>(R.id.dia)
            dia.text.clear()
            var mes = findViewById<EditText>(R.id.mes)
            mes.text.clear()
            var anio = findViewById<EditText>(R.id.anio)
            anio.text.clear()
        }
    }
}
