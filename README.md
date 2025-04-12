# 💻 Challenge: Oracle One Next Education

Projeto desenvolvido como parte do programa **Oracle Next Education**, com o objetivo de aplicar na prática os conhecimentos adquiridos em Java, Spring Boot e consumo de APIs externas.

---

## 📌 Descrição

Esta é uma **API RESTful** para **conversão de moedas** utilizando a [ExchangeRate-API](https://www.exchangerate-api.com/).
A aplicação recebe como parâmetros a moeda de origem, moeda de destino e o valor a ser convertido, retornando o valor 
convertido com base na taxa de câmbio mais recente.


---

## 🚀 Tecnologias Utilizadas

- Java 21+
- Spring Boot
- Spring Web
- RestTemplate (para consumo de API externa)
- ExchangeRate-API
- Maven
- Postman (para testes)

---

## 🧠 Conceitos Aplicados

- Criação de endpoints REST
- Consumo de API externa com `RestTemplate`
- Uso de `DTO` com `record`
- Boas práticas de injeção de dependência
- Manipulação de JSON com Java
- Tratamento de exceções e validações
- Uso da anotação `@ResponseStatus` para controle do status HTTP

---

## 📂 Estrutura do Projeto

---

## 📌 Exemplo de Uso

### Requisição:

GET /api/v1/currency/convert?from=USD&to=BRL&amount=100

### Resposta:

```json
521.43

![CM1](https://github.com/user-attachments/assets/1fd3fafb-83b9-41bd-a2db-01a6bc6e3f03)
![cm3](https://github.com/user-attachments/assets/2f780e4d-de21-4b84-95b6-1fc49b80a32f)
