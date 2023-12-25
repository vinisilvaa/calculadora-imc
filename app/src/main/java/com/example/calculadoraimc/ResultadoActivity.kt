package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {

    private lateinit var textPeso: TextView
    private lateinit var textAltura: TextView
    private lateinit var textResultado: TextView
    private lateinit var textResultadoNumerico: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        textPeso = findViewById(R.id.text_peso)
        textAltura = findViewById(R.id.text_altura)
        textResultado = findViewById(R.id.text_resultado)
        textResultadoNumerico = findViewById(R.id.text_resultado_numerico)

        val bundle = intent.extras
        if(bundle != null) {

            val peso = bundle.getDouble("peso")
            val altura = bundle.getDouble("altura")

            if(peso.isNaN()) {
                textPeso.text = "Peso não informado"
            } else {
                textPeso.text = "Peso informado: $peso kg"
            }

            if(altura.isNaN()) {
                textAltura.text = "Altura não informada"
            } else {
                textAltura.text = "Altura informada: $altura m"
            }


            val imc = peso / (altura * altura)

            val resultado = if(imc < 18.5) {
                "Abaixo do peso"
            } else if(imc in 18.5 .. 24.9) {
                "Peso ideal"
            } else if(imc in 25.0 .. 29.9) {
                "Sobrepeso"
            } else {
                "Obeso"
            }

            if(peso.isNaN() || altura.isNaN()) {
                textResultado.text = "Não foi possível calcular"
            } else {
                textResultado.text = resultado
            }

            if(imc.isInfinite() || imc == 0.00) {
                textResultadoNumerico.text = "Não foi possível realizar o cálculo"
            } else {
                textResultadoNumerico.text = "imc: ${String.format("%.2f", imc)}"
            }


        }

    }
}