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

// Atualizações dinâmicas do sistema (DSU)
/*
  DSU são atualizações rotineiras do sistema, denominada de GSI, essa 
  GSI é o sistema em si. Todo aparelho android possui o GSI pois esse é o 
  android propriamente dito, porém é necessário atualiza-lo, 
  essa atualização é chamada de DSU.

  Exercicio final -> Ler a documentação do DSU. 
*/

// Segurança do Sistema 

// Práticas de recomendadas e dicas de segurança
/*
  Aplicar comunicação segura -> Ato de ter o controle do fluxo de informação
  do seu APP.

  Oferecer as permissões corretas -> Definir o limite de permissões e de 
  acesso ao sistema, evitando sobrecarregar e gerar bugs.

  Armazenar os dados de forma segura -> Para que os usuários se sintam
  seguros a utilizar o nosso APP 

  Manter os serviços e as dependências atualizadas -> Sempre verificar se 
  as dependências estão em ordem e atualizadas, para evitar problemas 
  desnecessários.

*/

// Segurança com HTTPS, SSL, SafetyNet
/*
  Trabalhe com dados de forma segura.
  Configurações de segurança de redes. 
  SafetyNet -> Lib para verificar se os serviços estão executando com 
  segurança.
  
*/