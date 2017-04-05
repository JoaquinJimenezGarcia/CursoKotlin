package me.jojigarcia.cursokotlin

import android.content.Context
import android.widget.Toast

/**
 * Created by joaquinjimenezgarcia on 5/4/17.
 * Para añadir funciones a todo el programa
 */

// El "Context" se usa para indicar que se aplicará en contexto de dónde
// se esté usando
fun Context.toast(text: CharSequence){
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}