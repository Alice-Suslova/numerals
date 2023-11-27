package ru.netology

fun main() {

    //val likes = 63
    val likes = 101
    if ((likes % 10 == 1) && (likes !== 11)) {
        println("Нравится $likes человеку")
    } else {
        println("Нравится $likes людям")
    }
}