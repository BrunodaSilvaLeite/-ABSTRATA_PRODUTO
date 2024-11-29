# Controle de Produtos 🛒

## 🚀 Sobre o Projeto

Este projeto tem como objetivo criar uma aplicação para gerenciar diferentes tipos de produtos utilizando o paradigma da orientação a objetos e persistência de dados em um banco de dados relacional. Ele implementa as classes:

1. **Produto** (classe base abstrata com atributos e método concreto `calcularLucro`).
2. **ProdutoAlimenticio** (classe derivada com atributos `dataValidade` e `informacoesNutricionais`).
3. **ProdutoVestuario** (classe derivada com atributos `tamanho`, `cor` e `material`).

A aplicação permite salvar, atualizar, listar e deletar registros no banco de dados utilizando **JPA**.


## 📋 Pré-requisitos

- **Java 8** ou superior
- **IntelliJ IDEA** (ou outra IDE de sua preferência)
- **Banco de Dados MySQL** ou **SQL Server**
- Dependências do Maven:
  - `javax.persistence`
  - `hibernate-core`
  - `mysql-connector-java` (ou outro conector para SQL Server)


## 🧑‍💻 Como Rodar o Projeto
Clone o repositório:

bash
Copiar código
git clone https://github.com/seu-usuario/controle_produtos.git
cd controle_produtos
Configure o banco de dados:

Altere as credenciais no arquivo persistence.xml localizado em src/main/resources/META-INF.
xml
<properties>
    <property name="hibernate.connection.url" value="jdbc:mysql://localhost:3306/controle_produtos"/>
    <property name="hibernate.connection.username" value="seu_usuario"/>
    <property name="hibernate.connection.password" value="sua_senha"/>
    <property name="hibernate.hbm2ddl.auto" value="update"/>
</properties>

## Compile e execute o projeto:
bash <br>
mvn clean install<br>
mvn exec:java<br>

## 📊 Imagens do Projeto

Criar Produto<br>
![image](https://github.com/user-attachments/assets/ab2fe8fc-2850-48c8-80d9-d39f5f9cffbf)
![image](https://github.com/user-attachments/assets/3d9d9313-0ca7-4c51-8c05-a99a8d88d402)

Listar Todos Produto<br>
![image](https://github.com/user-attachments/assets/21925350-7ff7-4c15-b997-9914633afa74)
![image](https://github.com/user-attachments/assets/1a10b61e-d242-455c-af54-2f1e110baec3)

Listar Produto por ID<br>
![image](https://github.com/user-attachments/assets/64abcbf3-e133-442d-b6cd-7c7e64763d4e)
![image](https://github.com/user-attachments/assets/465188c5-1a1e-44ba-b4f4-8f66edace23a)

Atulizar Produto<br>
![image](https://github.com/user-attachments/assets/515db4b8-d95a-4a78-8f64-bd0d5d98f4ed)
![image](https://github.com/user-attachments/assets/1b9f3d6b-7bce-4ffd-99e1-6ee8a9705708)
![image](https://github.com/user-attachments/assets/2f2a3f0d-af93-44b8-a727-464fd8484a75)

Deletar Produto<br>
![image](https://github.com/user-attachments/assets/eed2782a-9f01-4cb1-a28c-98a9e66359de)
![image](https://github.com/user-attachments/assets/b531e62c-fbfb-488f-80a5-bba267743497)


---
## ✒️ Autor
Bruno
Atividade individual - Lista de Exercícios AC2 - Classe Abstrata (2/2)
