package me.jojigarcia.cursokotlin

/**
 * Created by joaquinjimenezgarcia on 8/4/17.
 */
fun getItems(): List<Item>{
    return (1..10).map {Item(it.toLong(),"Title $it","http://lorempixel.com/400/400/cats/$it/")}
}

class Item(val id:Long, val title:String, val url:String) {
}