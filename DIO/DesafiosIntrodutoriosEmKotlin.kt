// Introdução a programação em Kotlin

/*
  Desafios para resolver utilizando Kotlin
*/

//Primeiro desafio Concluido: 

fun main() {
  /*
    Ler o input do usuário e já transforma o valor em inteiro
  */
  val a = readLine()!!.toInt()
  val b = readLine()!!.toInt()

  val soma = a + b

  println("SOMA = $soma")
}

// Segundo desafio Concluido:

fun main() {
  val X = readLine()!!.toInt() 

  for (i in 1..X) { // Criando range usando 1..X, em que o limite é o X
    if(i%2 != 0) {
      println(i)
    }
  }
}

// Terceiro exercício concluido: 

fun main() {
  for (i in 1..readLine()!!.toInt()) {
    println("$i ${i * i} ${i * i * i}")
  }
}