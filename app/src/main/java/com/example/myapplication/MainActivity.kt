package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.math.BigDecimal

class MainActivity: AppCompatActivity() {
    lateinit var nome: EditText
    lateinit var idade: EditText
    lateinit var altura: EditText
    lateinit var peso: EditText
    lateinit var botaoCalcular: Button
    lateinit var numberResult : TextView
    lateinit var feedbackMessage : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nome = findViewById<EditText>(R.id.nome2)
        idade = findViewById<EditText>(R.id.idade)
        peso = findViewById<EditText>(R.id.peso)
        altura = findViewById<EditText>(R.id.altura)
        botaoCalcular = findViewById<Button>(R.id.btnCalcular)
        numberResult = findViewById<EditText>(R.id.imcNumberResult)
        feedbackMessage = findViewById<EditText>(R.id.imcFinalResult)

        botaoCalcular.setOnClickListener(){
            val alturaInput = altura.text.toString().toDouble() / 100
            val pesoInput = peso.text.toString().toDouble()
            var imc: Double = pesoInput / (alturaInput * alturaInput)

            when(imc){
                in 0.0 ..18.4 -> {
                    feedbackMessage.setText("Você está abaixo do peso normal")
                }
                in 18.5..24.9 ->{
                    feedbackMessage.setText("Você está no peso normal")
                }
                in 25.0..29.9 -> {
                    feedbackMessage.setText("Você está com excesso de peso")
                }
                in 30.0.. 34.9 -> {
                    feedbackMessage.setText("Você está em obesidade classe I")
                }
                in 35.0..39.9 ->{
                    feedbackMessage.setText("Você está em obesidade classe II")
                }
                else->{
                    feedbackMessage.setText("Você está em obesidade classe III")
                }
            }

            numberResult.setText(String.format("%.1f", imc.toDouble()))
        }

    }



}