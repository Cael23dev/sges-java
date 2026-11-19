# SGES — Sistema de Gestão

Projeto desenvolvido em Java com o objetivo de aplicar conceitos de Programação Orientada a Objetos (POO), organização de código, validação de dados e tratamento de exceções.

O SGES é um projeto educacional que simula uma estrutura inicial de cadastro de clientes e funcionários.

## Tecnologias utilizadas

- Java 27
- IntelliJ IDEA
- Java Time API (`LocalDate`)

## Funcionalidades implementadas

- Modelagem de pessoas utilizando classe abstrata.
- Cadastro de clientes e funcionários.
- Herança e reutilização de atributos e comportamentos.
- Encapsulamento com atributos privados e getters.
- Polimorfismo por meio de métodos sobrescritos.
- Validação de dados obrigatórios.
- Validação de data de nascimento.
- Exceções personalizadas.
- Tratamento de exceções com `try` e `catch`.

## Estrutura do projeto

```text
src/
└── br/com/sges/
    ├── app/
    │   └── Main.java
    ├── exceptions/
    │   └── InvalidPersonData.java
    └── model/
        ├── Person.java
        ├── Client.java
        └── Employee.java
```

## Como executar

1. Tenha o JDK 27 instalado.
2. Clone este repositório.
3. Abra a pasta do projeto no IntelliJ IDEA.
4. Configure o JDK 27 como Project SDK.
5. Execute a classe `Main.java`, localizada no pacote `br.com.sges.app`.

## Conceitos praticados

O desenvolvimento deste projeto busca consolidar os fundamentos de Java e Programação Orientada a Objetos, incluindo:

- Classes e objetos.
- Abstração.
- Herança.
- Encapsulamento.
- Polimorfismo.
- Construtores e `super()`.
- Tratamento e criação de exceções.

## Próximos passos

- [ ] Implementar operações completas de cadastro.
- [ ] Trabalhar com coleções e armazenamento em memória.
- [ ] Desenvolver uma API REST utilizando Spring Boot.
- [ ] Integrar banco de dados.
- [ ] Implementar testes automatizados.

## Status

Em desenvolvimento — projeto de aprendizado e prática de Java.
