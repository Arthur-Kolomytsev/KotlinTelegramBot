package org.example

import java.io.File
import java.io.FileNotFoundException


fun main() {

    val words = File("words.txt")

    val dictionary = mutableListOf<Word>()

    try {
        val lines: List<String> = words.readLines()
        for (line in lines) {
            val line = line.split("|")
            val correctAnswersCount: Int = line[2].toInt() ?: 0
            val word = Word(original = line[0], translate = line[1], correctAnswersCount)
            dictionary.add(word)
        }

    } catch (e: FileNotFoundException) {
        println("Файл не найден: ${e.message}")
    }

    dictionary.forEach { println(it) }


}