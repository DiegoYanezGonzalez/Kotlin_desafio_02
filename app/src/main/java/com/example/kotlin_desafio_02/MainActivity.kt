package com.example.kotlin_desafio_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


     val elPrincipito = Books("El Principito",
         1,
         2009,
         "Principe Edit.",
         200,
         5990,
         "Diego Flores",
         "Ciencia Ficcion")
        Log.d("Funciona",elPrincipito.precioFormateado())

        val kotlinTutorial = Books("Kotlin Tutorial",
            5,
            2020,
            "",
            139,
            8990,
            "IntellJ",
            "Informatica")
        val JavaTutorial = Books("Java Tutorial",
            7,
            2015,
            "Java Edit",
            199,
            1990,
            "Java Corp",
            "Informatica")
        val pythonTutorial = Books("Python Tutorial",
            9,
            2020,
            "Python Edit.",
            119,
            9990,
            "Python Corp",
            "Informatica")
        val swiftTutorial = Books("Swift Tutorial",
            12,
            2020,
            "Swift Edit",
            78,
            11990,
            "Swift Corp",
            "Informatica")

        val textView:TextView = findViewById(R.id.Libros)
        textView.setText(swiftTutorial.precioFormateado())
    }
}