package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    lateinit var nome: EditText
    lateinit var idade: EditText
    lateinit var altura: EditText
    lateinit var peso: EditText
    lateinit var botaoCalcular: Button
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        nome.findViewById<EditText>(R.id.idade)
        altura.findViewById<EditText>(R.id.altura).toString().toDouble()
        peso.findViewById<EditText>(R.id.peso).toString().toDouble()
        idade.findViewById<EditText>(R.id.idade)
        botaoCalcular.findViewById<Button>(R.id.btnCalcular)

        botaoCalcular.setOnClickListener(View.OnClickListener {
            var imc = calcularIMC(altura, peso)
        })


    }

    private fun calcularIMC(altura: Double, peso: Double){
        val imc = peso / (altura * altura)
        when(imc){
            in 0.0..18.5 ->

        }
    }
}