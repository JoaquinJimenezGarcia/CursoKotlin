package me.jojigarcia.cursokotlin

/**
 * Created by joaquinjimenezgarcia on 5/4/17.
 */
class Item {
    var title: String = ""
        get() {
            return "title: $field" // Field se refiere a la palabra que tiene contenido dicho elemento (title en este caso)
        }
        set(value) {
            field = "title: $value" // Value le da valor a title y field lo guarda
        }
    var url: String = ""




}