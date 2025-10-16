package com.aplimoviles.kotlinconsoletest

class Numero {
    var valor: Int = 3

    constructor(valor: Int) {
        this.valor = valor
    }


    infix fun suma(other: Numero): Int {
        return this.valor + other.valor
    }

}