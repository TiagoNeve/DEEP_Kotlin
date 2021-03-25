package com.example.teste

fun main() {
    //execute()
    operadores()
}

fun execute() {
    val num1 = 10
    val num2 = 20

    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1 / num2)
    println(num1 % num2)
}

fun operadores() {

    var num1 = 4
    println(num1)

    // Operadores de atribuição
    num1 *= 5
    println(num1)

    // Operação de incremento
    num1++
    println(num1)
    num1--
    println(num1)
    //É possível utilizar o incremento e decremento antes da variável ou depois, mas é preciso
    //Saber que se estiver antes a variável modificar primeiro e depois retornar, se estiver depois
    //a variável vai retornar o valor e depois modificar

    // Operadores de comparações
    val age = 21
    println(age >= 18)
}