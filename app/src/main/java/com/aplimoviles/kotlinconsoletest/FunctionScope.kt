package com.aplimoviles.kotlinconsoletest

import androidx.compose.ui.unit.IntRect

fun main() {
    val l1 = Libro("El color de la magia", "Terry Pratchett")
    val l2 = Libro("Hyperion", "Dan Simmons")
    val l3 = Libro("La Odisea")

    println("${l1.titulo}, ${l1.autor}")
    println("${l2.titulo}, ${l2.autor}")
    println("${l3.titulo}, ${l3.autor}")
}
