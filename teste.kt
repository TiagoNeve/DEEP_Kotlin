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