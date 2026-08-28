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
            val word = Word(original = line[0], translate = line[1])

            if (line.size == 3) {
                word.correctAnswersCount = line[2].toIntOrNull() ?: 0
            }

            dictionary.add(word)
        }

    } catch (e: FileNotFoundException) {
        println("Файл не найден: ${e.message}")
    }

    dictionary.forEach { println(it) }


}