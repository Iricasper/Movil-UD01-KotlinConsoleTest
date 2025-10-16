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
/*
 it es una palabra clave que referencia al parámetro implícito de una expresión lambda,
 en este caso se trata del índice del elemento del array, y la función establece el valor de cada elemento.
 */

fun imprimeArrayDouble() {
    for (numeros in arrayEnterosElectricBoogaloo) {
        print("${numeros.toDouble()} ")
    }
}

fun imprimeArrayDoublePruebas() {
    print("Array entero: ")
    arrayEnterosElectricBoogaloo.forEach { print("$it ") }
    print("\nArray decimal: ")
    arrayEnterosElectricBoogaloo.forEach { print("${it.toDouble()} ") }
}

// Ej 5
var cadena: String? = "23"
fun mensajeRaro() {
    val cadenaInt = cadena as? Int
    if (cadenaInt is Int) println(cadenaInt)
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

// Ej 9
fun imprimeListaNombresMayusculas() {
    val listaNombres = listOf<String>("Iris", "Patri", "Ale", "Gero")
    listaNombres.forEach { println(it.uppercase()) }
}

// Ej 10
fun manejoExcepciones() {
    val a: Int = 10
    val b: Int = 0

    try {
        val c = a / b
        println("$a / $b = $c")
    } catch (e: ArithmeticException) {
        throw IllegalStateException("Imposible dividir $a entre $b", e)
    }
}

// Ej 11
fun saludar(nombre: String): String {
    return "Hola, $nombre!"
}

// Ej 12
fun mostrarPerfil(nombre: String, edad: Int = 18, ciudad: String = "Desconocida"): String {
    return "Hola, $nombre, tienes $edad años y vives en $ciudad"
}

// Ej 13
fun sumar(vararg numeros: Int): Int {
    val suma = numeros.sum()
    return suma
}

// Ej 14 (Continúa en la clase Persona y en el main)
fun saludoGlobal() {
    val p = Persona()
    println(p.saludar("Iris"))
    println(despedirse())
}

// Ej 15
fun String.primeraLetraMayuscula(): String {
//    return get(0).uppercaseChar().toString()+slice(1..length-1)
    return replaceFirstChar { it.uppercase() }
}

// Ej 16 (en la clase Numero)
