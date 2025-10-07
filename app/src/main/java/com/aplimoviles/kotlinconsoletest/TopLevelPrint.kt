package com.aplimoviles.kotlinconsoletest

fun topLevelPrint() = println("Función de nivel superior")

fun learning() = println("I'm\nlearning\nKotlin!")

var edad = 24
const val PI: Float = kotlin.math.PI.toFloat()

fun numerines() {
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

var arrayEnterosElectricBoogalow = Array(5) {it+1}

fun imprimeArrayDouble() {
    for (numeros in arrayEnterosElectricBoogalow) {
        print("${numeros.toDouble()} ")
    }
}

fun enteroReal(num: Int) {
    var respuesta: String
    if (num > 0) respuesta = "El $num es positivo"
    if (num < 0) respuesta = "El $num es negativo" else respuesta = "Es cero ($num)"
    println(respuesta);
}

fun geroMomento(num: Int) {
    var respuesta = when (num > 0) {
        true -> "El $num es positivo"
        false -> when (num < 0) {
            true -> "El $num es negativo"
            false -> "El $num es cero (duh)"
        }
    }
    println(respuesta);

}