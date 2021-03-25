package com.example.teste

fun main() {
    //if01()
    //con01()
    while01()
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

fun con01() {
    // Expressões condicionais, é o ato de você utilizar um if e guardar o resultado numa variável
    // val validado = if (conta == conta && password == password) retorna true ou false

    val x = 4
    val y = if (x > 6) x-2 else x+2 // Expressões condicionais
    println(x + y) // 10

    println("Digite um número e verifique se é positivo ou negativo")
    val num = readLine()!!.toInt()

    val result = when {
        num > 0 -> "Positivo"
        num < 0 -> "Negativo"
        else -> "Zero"
    }
    println(result)
}

fun while01() {
    var i = 1

    while (i <= 5) {
        println(i)
        i++
    }

    var soma = 0
    var i2 = 1

    while(i2 <= 100) {
        soma += i2
        i2++
    }
    println(soma)
}