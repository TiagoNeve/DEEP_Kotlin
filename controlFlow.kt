package com.example.teste

fun main() {
    if01()
}

fun if01() {
    println("Qual a sua idade? ")
    val age = readLine()!!.toInt()

    if(age <= 16) {
        println("Bem vindo")
    } else {
        println("Proibido a entrada de maiores!")
    }
    // É possível ter muitas verificações, basta colocar um else if (condition)
}