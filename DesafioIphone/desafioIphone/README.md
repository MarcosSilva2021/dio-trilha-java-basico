# 📱 Diagramação de classes do iPhone

Neste repositório, foi implementado  um desafio de modelagem de software que tem como objetivo representar as funcionalidades de um iPhone. 
Este projeto utiliza princípios de programação orientada a objetos e técnicas de modelagem UML.

## 📊 Diagrama UML

Este é um diagrama UML que representa a estrutura de classes e interfaces para um sistema que inclui a modelagem do iPhone, um dispositivo que incorpora funcionalidades de um reprodutor de música, um telefone e um navegador de internet.

<p align="center">
  <img src="docs/desafio Iphone.PNG" alt="Diagrama de Classes">
</p>

## 📋 Descrição ds interfaces e classes

### `iPhone`

A classe `iPhone` é a classe principal que representa o dispositivo como um todo. Ela implementa as interfaces `ReprodutorMusical`, `Telefone` e `NavegadorInternet`. Isso permite que o iPhone desempenhe os papéis de reprodutor musical, aparelho telefônico e navegador na Internet.

### `Telefone`

A interface `Telefone` define os métodos para realizar chamadas telefônicas e enviar mensagens, incluindo `ligar()`, `atender()` e `iniciarCorreioVoz()`. As classes que implementam essa interface podem funcionar como dispositivos telefônicos.

### `ReprodutorMusical`

A interface `ReprodutorMusical` define os métodos necessários para controlar a reprodução de música, como `tocar()`, `pausar()` e `selecionarMusica()`. As classes que implementam essa interface são capazes de reproduzir músicas.


### `NavegadorInternet`

A interface `NavegadorInternet` define métodos para a navegação na web, como `exibirPagina()`, `adicionarPagina()` e `atualizarPagina()`. As classes que implementam essa interface podem atuar como navegadores da Internet.