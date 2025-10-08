package com.aplimoviles.kotlinconsoletest

fun topLevelPrint() = println("Función de nivel superior")

// Ej 1
fun learning() = println("I'm\nlearning\nKotlin!")

// Ej 2
var edad = 24
const val PI: Float = kotlin.math.PI.toFloat()

fun imprimeNumeros() {
    println("Edad: $edad")
    println("Valor de PI: $PI")
}

// Ej 3
var nombre: String = "Iris"
var apellidos: String = "Castro Pérez"

var nombreCompleto: String = "$nombre $apellidos"

fun imprimeNombre() {
    println(nombreCompleto)
}

// Ej 4
var arrayEnteros = arrayOf(1, 2, 3, 4, 5)

var arrayEnterosElectricBoogaloo = Array(5) { it + 1 }

fun imprimeArrayDouble() {
    for (numeros in arrayEnterosElectricBoogaloo) {
        print("${numeros.toDouble()} ")
    }
}

// Ej 5
var cadena: String? = "Kotlin"
fun mensajeRaro() {
    cadena as? Int
    if (cadena is Int) println(cadena)
    else println("No se puede imprimir")
}

// Ej 6
fun saludo() {
    print("Dime tu nombre: ")
    val nombre: String = readln()
    println("Bienvenid@, $nombre!")
}

// Ej 7
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

// Ej 8
fun imprimeCalificacion() {
    val rango: IntRange = 0..10
    val nota: Int = rango.random()
    print("Tu nota es un $nota: ")
    when (nota) {
        in 0..4 -> println("Suspenso")
        in 5..6 -> println("Suficiente")
        in 7..8 -> println("Notable")
        in 9..10 -> println("Sobresaliente")
        else -> println("Nota no válida")
    }
}