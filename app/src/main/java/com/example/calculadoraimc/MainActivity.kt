package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var btnCalcular: Button
    private lateinit var editPeso: EditText
    private lateinit var editAltura: EditText
    private lateinit var textInputPeso: TextInputLayout
    private lateinit var textInputAltura: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular = findViewById(R.id.btn_calcular)
        editPeso = findViewById(R.id.edit_peso)
        editAltura = findViewById(R.id.edit_altura)
        textInputPeso = findViewById(R.id.text_input_peso)
        textInputAltura = findViewById(R.id.text_input_altura)


        btnCalcular.setOnClickListener {

            val intent = Intent(this, ResultadoActivity::class.java)

            val peso = editPeso.text.toString()
            val altura = editAltura.text.toString()

            if(peso.isNotEmpty() && altura.isNotEmpty()) {
                intent.putExtra("peso", peso.toDouble())
                intent.putExtra("altura", altura.toDouble())
            } else if (peso.isEmpty()) {
                textInputPeso.error = "Digite seu peso"
                intent.putExtra("altura", altura.toDouble())
            } else if (altura.isEmpty()) {
                textInputAltura.error = "Digite sua altura"
                intent.putExtra("peso", peso.toDouble())
            }

            startActivity(intent)

        }

    }

}
