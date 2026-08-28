package org.example

data class Word(
    val original: String,
    val translate: String,
) {
    var correctAnswersCount = 0

    override fun toString(): String {
        return "original=$original, translate=$translate, count=$correctAnswersCount"
    }
}