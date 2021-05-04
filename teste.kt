// Introdução a arquitetura da plataforma android com Kotlin

// Conhecendo a arquitetura e DSU

// Diagrama da arquitetura parte 1
/*
  Android é uma pilha de software com base no kernel do linux
  Utilizam esse kernel pois fica mais fácil de criar os drivers
  e obtém a segurança do linux como um bônus.

  System apps: São aplicações nativas que fazem comunicação com o hardware
  do sistema.

  Na camada de comunicação existe bibliotecas escritas em c e c++ que 
  possuem uma habilidade de se comunicar melhor com o hardware da máquina.
  Junto dessa camada há o android runtime.

*/

//Diagrama da arquitetura parte 2
/*
  JAVA api runtime -> Camada em que é armazenado os códigos em java,
  capazes de se comunicar com o hardware da máquina. É a camada em que 
  os programadores geralmente mechem.

  System Apps -> Camada essencial para o desenvolvimento, é nessa camada 
  que é possível utilizar funcionalidades inerentes ao sitema operacional
  que está no celular, basta chama-las no seu programa.
*/