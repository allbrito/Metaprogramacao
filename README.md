# 💻 METAPROGRAMAÇÃO

---

## 🎯 Objetivo
Repositório destinado a elaboração de uma situação problema que justifique o uso de um padrão de projeto previamente escolhido: Template Method, bem como a sua evolução utilizando Reflexão e Anotação para reduzir o acoplamento.

## 📌 Descrição
Esse projeto foi desenvolvido em três etapas, nas quais consiste em uma evolução gradual de um código. 

Foi-se pensado em uma situação real do cotidiano (envio de pedidos, tomando como base a empresa Correios), e trazido para o código. 

Primerio foi feito o código sem nenhum padrão de projeto nem desenvolvimento avançado. Logo após foi aplicado ao mesmo código o padrão de projeto Template Method. Por fim, foi utilizado metaprogramação (reclexão e anotação), para reduzir o acoplamento.

## 🛠️  Método utilizado
Cada etapa está em uma das branchs:
- Main:
Destinada ao código completo, com o código utilizando o padrão Template Method, Reflexão e Anotações.
- Second:
Destinada ao código sem a Metaprogramação, somente com o uso do padrão escolhido
- Third:
Destinada ao código primário, sem o uso de padrão de Desing Patterns, Anotação e Reflexão

---

## ✨ O que é o Template Method
O Template Method é um padrão de projeto comportamental. Ele permite que você mantenha a estrutura de um processo intacta, dando a liberdade para que outras partes do código mudem apenas etapas específicas desse processo, sem precisar reescrevê-lo do zero.

---

## 📖 Representação da solução final em UML

<img width="2178" height="1577" alt="Diagrama etapa 3" src="https://github.com/user-attachments/assets/c33799a6-5dfc-4bae-8cbe-45cf47bf5d23" />

---

## ▶️ Como Executar
### Pré-requisitos:
- Java 11 ou superior
- Maven 3.6+
  
### Passo a passo
1. Clone o repositório
```bash
git clone https://github.com/<seu-usuario>/<nome-do-repositorio>.git
```
2. Acesse a pasta do projeto
```bash
cd <nome-do-repositorio>
```
3. Escolha a branch desejada
```bash
# Código completo (Template Method + Reflexão + Anotações)
git checkout main

# Somente Template Method
git checkout second

# Código sem padrões
git checkout third
```
4. Instale as dependências
```bash
mvn install
```
5. Execute o projeto
```bash
mvn exec:java -Dexec.mainClass="Main"
```
## Executando pela IntelliJ IDEA
- Abra o projeto pela opção File > Open e selecione a pasta raiz
- Aguarde o Maven baixar as dependências automaticamente
- Localize o arquivo `Main.java` e clique no botão ▶️ ao lado do método `main`

Saída esperada:
```
Enviando Email...
Valor do Frete: 20.0
Código de Rastreio: Gerando código PAC

Enviando Email...
Valor do Frete: 21.4
Código de Rastreio: Gerando código Sedex

Enviando Email...
Valor do Frete: 24.0
Código de Rastreio: Gerando código Internacional
```
