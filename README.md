# 📒 CadernoFiado

## 📖 Sobre o Projeto

O CadernoFiado é uma aplicação desenvolvida em Java com o objetivo de simular o controle de crédito(fiados) utilizado por pequenos comércios.

O sistema permite cadastrar clientes, armazenar valores em aberto, consultar registros por CPF, listar todos os clientes cadastrados e remover registros quando necessário.

Este projeto foi criado com foco no aprendizado de Programação Orientada a Objetos (POO), manipulação de coleções utilizando ArrayList e implementação de operações CRUD em memória.

---

## 🚀 Funcionalidades

### ✔️ Cadastro de Clientes

Permite registrar:

- Nome
- CPF
- Valor do crédito (fiado)

Os dados são armazenados em memória utilizando uma lista dinâmica (`ArrayList`).

---

### ✔️ Listagem de Clientes

Exibe todos os clientes cadastrados no sistema juntamente com suas informações.

---

### ✔️ Filtro por CPF

Permite localizar um cliente específico através do CPF informado pelo usuário.

A busca é realizada utilizando Stream API:

```java
Cliente clienteEncon = clientes.stream()
        .filter(c -> c.getCpf().equals(cpfDigitado))
        .findFirst().orElse(null);
```

Retornando o primeiro resultado encontrado.

---

### ✔️ Remoção de Clientes

Permite excluir um cliente através do CPF informado.

Após a remoção, o sistema exibe a lista atualizada.

---

## 🏗️ Estrutura do Projeto

### Program.java

Classe principal responsável por iniciar a aplicação.

```java
CadastroFiado cadastroFiado = new CadastroFiado();
cadastroFiado.Menu();
```

---

### CadastroFiado.java

Classe responsável por toda a lógica do sistema.

Contém:

| Método | Função |
|----------|----------|
| Menu() | Exibe o menu principal e controla a navegação |
| CadastraCreditario() | Realiza o cadastro de um novo cliente |
| ListaDeCreditarios() | Lista todos os clientes cadastrados |
| FiltrarCreditario() | Busca um cliente pelo CPF |
| RemoverCreditario() | Remove um cliente pelo CPF |

Também possui:

```java
private ArrayList<Cliente> clientes
```

Responsável pelo armazenamento dos registros.

---

### Cliente.java

Classe que representa uma entidade Cliente.

Atributos:

```java
private final String name;
private final String cpf;
private final double creditario;
```

Possui:

- Construtor
- Getters
- Método `toString()` para exibição formatada dos dados

---

## 💻 Como Executar

### 1. Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

### 2. Abra o projeto em sua IDE Java (IntelliJ, Eclipse ou VS Code).

### 3. Execute a classe:

```java
Program.java
```

### 4. Utilize o menu interativo pelo terminal.

---

## 📚 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Classes e Objetos
- Construtores
- ArrayList
- Stream API
- CRUD
- Organização em pacotes
- Pensamento Computacional

---

## 🔮 Próximas Implementações

Conforme meu aprendizado evoluir, pretendo expandir o projeto com novas tecnologias e recursos, incluindo:

- Integração com banco de dados MySQL
- Persistência de dados
- API Web utilizando Spring Boot
- Validação de CPF
- Atualização de registros
- Interface gráfica ou aplicação web
- Tratamento de exceções mais robusto

---

## 🎯 Objetivo

Este projeto foi desenvolvido como prática dos conceitos estudados em Java, simulando um cenário real de gerenciamento de crédito informal e servindo como base para futuras implementações mais avançadas.

---

Desenvolvido por mim durante meus estudos de Java ☕
