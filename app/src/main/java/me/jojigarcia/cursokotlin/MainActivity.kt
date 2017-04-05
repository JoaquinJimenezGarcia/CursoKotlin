package me.jojigarcia.cursokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            toast(editText.text) //Usa la función ya creada en el Extensions.kt
        }

        // Formas de crear listas
        val items = listOf(Item("Titulo1","url1"), Item("Titulo2","url2"))
        val empty = emptyList<Item>()

        // Formas de Lambdas
        val result: List<String> = items
                .sortedBy { it.title } // it especifica el valor como parámetro
                .filter { it.url.isNotEmpty() }
                .map { it.title }
    }
}
