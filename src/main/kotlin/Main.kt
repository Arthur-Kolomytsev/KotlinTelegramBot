package org.example

import java.io.File
import java.io.FileNotFoundException


fun main() {

    val words = File("words.txt")

    val dictionary = mutableListOf<Word>()

    try {
        val generalLines: List<String> = words.readLines()

        for (line in generalLines) {

            if (line.isBlank()) continue

            val lines = line.split("|")
            val word = Word(original = lines[0], translate = lines[1])

            if (lines.size == 3) {
                word.correctAnswersCount = lines[2].toIntOrNull() ?: 0
            }

            dictionary.add(word)
        }

    } catch (e: FileNotFoundException) {
        println("Файл не найден: ${e.message}")
    }

    dictionary.forEach { println(it) }

}