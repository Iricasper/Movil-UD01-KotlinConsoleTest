package com.aplimoviles.kotlinconsoletest

class Libro {
    val titulo: String
    val autor: String

    constructor(titulo: String, autor: String) {
        this.autor = autor
        this.titulo = titulo
    }

    constructor(titulo: String) {
        autor = "Desconocido"
        this.titulo = titulo
    }


}