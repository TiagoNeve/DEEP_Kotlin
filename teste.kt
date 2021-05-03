// Fundamentos de orientação a objetos em Kotlin - 

// Introdução a abstrações
/*
  Abstrair é o ato de utilizar classes e heranças
  para criar objetos que herdam atributos gerais.
  Por exemplo, toda Pessoa possui corpo, mas pessoa possui
  um corpo diferente, singular. Pode-se utilizar o mundo das ideias
  para entender essa abstração. Imagina que o objeto ideal é a 
  Abstração e o objeto real é a instância da abstração, com suas 
  peculiaridades e defeitos.

  Basicamente é isso, cria-se uma classe que possui atributos
  gerais e depois vai implementando os objetos, assim se precisar
  colocar uma nova funcionalidade a todos os objetos, não será
  necessário colocar de um por um, basta introduzir na classe
  e depois chamar nesse objeto, já que ele vai herdar todos os
  atributos da classe pai.
*/

// Pessoa.kt 
// A classe pessoa precisa ser aberta e suas propriedades também
// Pois será utilizada por outras classes.
open class Pessoa(
  open val nome: String,
  open val cpf: String
);
// Constructor primário de classes


// Entendendo sobre Abstrações na Prática - Parte 1
// Funcionario.kt 
class Funcionario(
  override val nome: String,
  override val cpf: String,
  val salario: Float
) : Pessoa(nome, cpf) {

}

/*
  Nesta aula foi ensiando o conceito de heranças em Kotlin, utilizando
  o conceito de abstração. Para fazer uma classe poder herdar é necessário
  que ela seja aberta e seus atributos modificáveis também, para que dessa
  forma seus atributos possam ser sobreescritos com o uso da palavra chave
  override.
*/

