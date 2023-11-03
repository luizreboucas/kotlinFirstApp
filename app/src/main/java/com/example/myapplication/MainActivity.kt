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
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nome.findViewById<EditText>(R.id.idade)
        altura.findViewById<EditText>(R.id.altura)
        peso.findViewById<EditText>(R.id.peso)
        idade.findViewById<EditText>(R.id.idade)
        botaoCalcular.findViewById<Button>(R.id.btnCalcular)
        numberResult.findViewById<TextView>(R.id.imcNumberResult)
        feedbackMessage.findViewById<TextView>(R.id.imcFinalResult)

        botaoCalcular.setOnClickListener(View.OnClickListener {
            var altura = altura.text.toString().toDouble()
            var peso = peso.text.toString().toDouble()
            var imc: Double = this.calculaIMC(altura, peso)
            numberResult.setText("Seu IMC é ${imc}")
            when(imc){
                in 0.0..18.4 -> feedbackMessage.setText("Abaixo do Peso Normal")
                in 18.5..24.9 -> feedbackMessage.setText("Peso Normal")
                in 25.0..29.9 -> feedbackMessage.setText("Excesso de Peso")
                in 30.0..34.9 -> feedbackMessage.setText("Obesidade Grau I")
                in 35.0..39.9 -> feedbackMessage.setText("Obesidade Grau II")
                in 40.0..100.0 -> feedbackMessage.setText("Obesidade Grau III")
                else -> {
                    feedbackMessage.setText("Ocorreu um erro, tente novamente!")
                }
            }


        })

    }
    private fun calculaIMC(altura: Double, peso : Double): Double{
        return peso / (altura * altura)
    }


}