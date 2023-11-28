package ru.netology

fun main() {

    val likes = 101

    var last = likes % 10
    var del = likes / 10
    var previous = del % 10

    if (last == 1) {
        if (previous == 1) {
            println("Нравится $likes людям")
        } else {
            println("Нравится $likes человеку")
        }
    } else {
        println("Нравится $likes людям")
    }
}