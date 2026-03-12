# Plataforma de Bootcamp em Java

Sistema desenvolvido em Java orientado a objetos que simula uma plataforma de cursos estilo Bootcamp, onde desenvolvedores podem se inscrever em conteúdos (cursos e mentorias), progredir nos estudos e acumular experiência (XP), realizado para o desafio do BootCamp Almaviva Dio.

O projeto foi criado com foco no aprendizado de Programação Orientada a Objetos (POO) e no uso de Collections e Streams do Java.

** Funcionalidades

O sistema permite:

Criar um Dev

Inscrever o Dev em um Bootcamp

Acessar os conteúdos disponíveis

Progredir nos conteúdos

Visualizar conteúdos inscritos

Visualizar conteúdos concluídos

Calcular XP total acumulado

Listar Devs inscritos no Bootcamp

** Conceitos de Java aplicados

Este projeto utiliza diversos conceitos importantes da linguagem Java:

Programação Orientada a Objetos

Herança

Polimorfismo

Encapsulamento

Abstração

Exemplo da hierarquia de classes:

Conteudo
   │
   ├── Curso
   └── Mentoria
Collections Framework

Utilização de estruturas de dados do Java:

Set

HashSet

LinkedHashSet

Essas estruturas são usadas para:

armazenar conteúdos

evitar duplicidade

manter ordem de inserção

Streams API

Utilização de Streams para cálculo de XP:

this.conteudosConcluidos.stream()
    .mapToDouble(Conteudo::calcularXP)
    .sum();
Optional

Uso de Optional para evitar NullPointerException:

Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
 Estrutura do Projeto
src
 └── org.example
      ├── Main.java
      └── dominio
            ├── BootCamp.java
            ├── Conteudo.java
            ├── Curso.java
            ├── Mentoria.java
            └── Dev.java
