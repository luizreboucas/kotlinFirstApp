package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

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
            feedbackMessage.setText("o nome é ${nome.text}")
            numberResult.setText("47")
        }
    }



}