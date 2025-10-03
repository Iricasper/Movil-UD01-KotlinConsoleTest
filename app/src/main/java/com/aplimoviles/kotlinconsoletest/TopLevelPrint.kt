package com.aplimoviles.kotlinconsoletest

fun topLevelPrint() = println("Función de nivel superior")

fun learning()= println("I'm\nlearning\nKotlin!")

var edad = 24
const val PI: Float = kotlin.math.PI.toFloat()

fun numerines(){
    println(edad)
    println(PI)
}

var nombre: String = "Iris"
var apellidos: String = "Castro Pérez"

var nombreCompleto: String = nombre + " " + apellidos

fun imprimeNombre() {
    println(nombreCompleto)
}

var arrayEnteros = arrayOf(1, 2, 3, 4, 5)

fun imprimeArrayDouble() {
    for(numeros in arrayEnteros) {
        print("${numeros.toDouble()} ")
    }
}