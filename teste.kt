package com.example.teste

fun main() {
    //execute()
    //operadores()
    //input()
    problem1()
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
    /*
    * > Maior que
    * < Menor que
    * >= Maior ou igual
    * <= Menor ou igual
    * == Igual a
    * != Diferente de
    * */
    val age = 21
    println(age >= 18)
}

fun input() {
    println("Digite a sua idade:")
    val age = readLine() // O valor de retorno é uma string

    println("Sua idade é $age")

    /* Para converter os valores do input para numérico é necessário colocar:
    * !!.toInt() -> Esse dois pontos de exclamação é uma forma de validação, indica que o input
    * não pode receber valores nulos e vazios
    *
    * !!.toDouble() -> Números reais
    * */
    println("Qual o preço do pão? ")
    val pao = readLine()!!.toDouble()
    println("O pão custa: $pao, é realmente muito caro")
}

fun problem1() {
    // Criar um programa que informa quanto uma família gasta de água por ano
    val diasNoAno = 365

    println("Digite quanto é o gasto diário em Litros:")
    val gastoDiario = readLine()!!.toDouble()

    println("Digite a quantidade de anos:")
    val years = readLine()!!.toInt()

    val result = gastoDiario * years * diasNoAno
    println("A quantidade de litros gastos em $years anos é: \n $result L")
}