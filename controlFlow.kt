package com.example.teste

fun main() {
    //if01()
    //con01()
    //while01()
    //continue01()
    //array()
    //forLoops()
    desafio()
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
fun continue01() {
    var soma = 0
    var i = 1
    while(i <= 100) {
        i++
        if(i%2 == 0) {
            continue // Só vai continuar o código se a condição for verdadeira.
        }
        soma += 1
    }
    println(soma)
}
fun array() {
    var contacts = arrayOf("Tiago", "Maciel", "Neves")
    var x = arrayOf(1,2,3,4)

    // É possível acessar uma posição do arrya utilizando o index [0], se quiser alterar o valor
    // de um index específico basta selecionar ele e atribuir o valor desejado
    println(contacts[2])
    contacts[2] = "Lindão"
    println(contacts[2])
}
fun forLoops() {
    val nums = arrayOf(2,4,6)
    for (x in nums) { // Mostra todos os itens de um array
        println(x)
    }

    var soma = 0
    for (num in nums) { // Soma de todos os números do array
        soma += num
    }
    println(soma)
}

fun desafio() {

    var hours = readLine()!!.toInt()
    var total: Double = 0.0

    val result: Double = when {
        hours <= 5 -> hours.toDouble()
        hours in 6..23 -> 5+((hours - 5)*0.5)
        hours >= 24 -> 15+((hours-24)*0.5)
        hours >= 48 -> 2*15+((hours-48)*0.5)
        hours >= 72 -> 3*15+((hours-72)*0.5)
        hours >= 96 -> 4*15+((hours-96)*0.5)
        else -> 0.0
    }
    total += result
    println(total)
}