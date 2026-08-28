package org.example

import java.io.File
import java.io.FileNotFoundException


fun main() {

    val words = File("words.txt")

    try {
        words.readLines().forEach { println(it) }

    } catch (e: FileNotFoundException) {
        println("Файл не найден: ${e.message}")
    }

}