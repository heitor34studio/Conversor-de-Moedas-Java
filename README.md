![Conversor de Moedas](https://github.com/heitor34studio/Conversor-de-Moedas-Java/assets/72997122/452e94b2-dbab-4218-8c84-a16776693a62)

# Conversor de Moedas
![Java Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![Gson Badge](https://img.shields.io/badge/Gson-232F3E?style=for-the-badge&logo=Gson&logoColor=white)

O projeto Conversor de Moedas é uma ferramenta que permite ao usuário converter valores entre diferentes moedas utilizando a API de taxas de câmbio. O usuário pode selecionar as moedas de origem e destino e informar a quantidade a ser convertida.

## Índice 

* [Título, Descrição e Imagem de capa](#conversor-de-moedas)
* [Índice](#índice)
* [Funcionalidades do Projeto](#-funcionalidades-do-projeto)
* [Tecnologias Utilizadas](#%EF%B8%8F-técnicas-e-tecnologias-utilizadas)
* [Acesso ao Projeto](#-acesso-ao-projeto)
* [Abrir e Rodar o Projeto](#%EF%B8%8F-abrir-e-rodar-o-projeto)

## 🔨 Funcionalidades do projeto

O Conversor de Moedas oferece as seguintes funcionalidades:

- Seleção de moedas de origem e destino.
- Inserção da quantidade a ser convertida.
- Exibição do resultado da conversão utilizando a API de taxas de câmbio.
- Validação de entradas para garantir que as moedas selecionadas são diferentes e estão na lista suportada.

## ✔️ Técnicas e tecnologias utilizadas

- `Java`: Linguagem principal utilizada no desenvolvimento do projeto.
- `HttpClient`: Utilizado para fazer requisições HTTP à API de taxas de câmbio.
- `Gson`: Biblioteca utilizada para fazer o parse dos dados JSON retornados pela API.
- `Map.of()`: Utilizado para inicializar o mapa de moedas de forma concisa.

## 📁 Acesso ao projeto

Você pode acessar o código fonte do projeto [aqui](https://github.com/heitor34studio/Conversor-de-Moedas-Java).

## 🛠️ Abrir e rodar o projeto

Para abrir e rodar o projeto, siga os seguintes passos:

1. Clone o repositório para o seu ambiente local:
    ```sh
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```

2. Navegue até o diretório do projeto:
    ```sh
    cd seu-repositorio
    ```

3. Compile o projeto:
    ```sh
    javac src/main/Main.java
    ```

4. Execute o projeto:
    ```sh
    java src.main.Main
    ```

### Detalhamento do código Java:

#### ConsultaMoeda.java
Responsável por realizar a consulta à API de taxas de câmbio utilizando `HttpClient` e `Gson` para deserializar a resposta JSON.

#### ListaMoedas.java
Gerencia a lista de moedas disponíveis e oferece um método para retornar o código da moeda baseado em um número de entrada.

#### DuplaDeMoedas.java
Uma classe de registro que mantém os dados das duas moedas (origem e destino) e a quantidade a ser convertida.

#### Main.java
Contém a lógica principal de interação com o usuário, incluindo a coleta de entradas, validação e exibição dos resultados da conversão.

### Exemplo de Uso
Ao iniciar o programa, o usuário é saudado com uma lista de opções de moedas. Ele deve escolher a moeda de origem e destino, bem como a quantidade a ser convertida. O programa então faz a consulta à API e exibe o resultado da conversão.


https://github.com/heitor34studio/Conversor-de-Moedas-Java/assets/72997122/e3f5e449-272b-4910-a607-43e16c3c138c



---

Este é o README para o projeto Conversor de Moedas. Ele fornece uma visão geral do projeto, suas funcionalidades, tecnologias utilizadas, e como acessar e rodar o projeto. Para mais detalhes, você pode explorar os arquivos do código fonte mencionados.
