package com.example.imc_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }


  fun calculateImc(view: View) {
    val weightText = findViewById<EditText>(R.id.weight)
    val heightText = findViewById<EditText>(R.id.height)
    val resultText = findViewById<TextView>(R.id.valueImc)

    val weight = weightText.text.toString().toDouble()
    val height = heightText.text.toString().toDouble()

    val imc = weight / (height * height)
    val imcFormated = "%.2f".format(imc)
    resultText.text = imcFormated
  }
}