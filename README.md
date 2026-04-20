# 🧠 Neurônio Artificial - Porta Lógica NAND

Este projeto implementa um neurônio artificial simples em Java utilizando a **Regra Delta (Adaline)** para aprender o comportamento da porta lógica **NAND**.


## 📖 Descrição

O sistema simula o treinamento de um neurônio artificial capaz de aprender uma função lógica a partir de dados de entrada.

A rede:
- Recebe duas entradas (0 ou 1)
- Aprende por meio de ajuste de pesos
- Utiliza erro quadrático para treinamento
- Aplica função de ativação degrau para saída final


## ⚙️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)


## 🧩 Estrutura do Projeto

```

📁 projeto
┣ 📄 Main.java
┗ 📄 Neuronio.java

````

### 🔹 `Neuronio.java`
Responsável por:
- Inicializar pesos aleatórios
- Calcular a saída (combinação linear)
- Ajustar pesos e bias (Regra Delta)

### 🔹 `Main.java`
Responsável por:
- Definir o conjunto de dados (NAND)
- Treinar o neurônio
- Exibir resultados
- Testar a rede treinada


## 🧠 Funcionamento

A função aprendida é a porta lógica NAND:

| Entrada 1 | Entrada 2 | Saída |
|----------|----------|------|
| 0        | 0        | 1    |
| 0        | 1        | 1    |
| 1        | 0        | 1    |
| 1        | 1        | 0    |


## 📉 Treinamento

O treinamento ocorre até:
- O erro ser menor que um valor mínimo (`0.001`), ou
- Atingir o número máximo de épocas (`1000`)


## ▶️ Como executar

1. Compile os arquivos:
```bash
javac Main.java Neuronio.java
````

2. Execute:

```bash
java Main
```


## 📊 Exemplo de saída

```
Resultados:
Épocas: 120
Erro final: 0.0009

Pesos Ajustados:
Peso w1: ...
Peso w2: ...
Bias: ...

Teste da Rede (NAND):
0 NAND 0 = 1
0 NAND 1 = 1
1 NAND 0 = 1
1 NAND 1 = 0
```


## 📌 Conceitos envolvidos

* Neurônio artificial
* Regra Delta (Adaline)
* Aprendizado supervisionado
* Funções de ativação
* Portas lógicas


## 🚀 Possíveis melhorias

* Implementar função de ativação sigmoide
* Adicionar interface gráfica
* Suporte a outras portas lógicas (AND, OR, XOR)
* Visualização do erro por época


## 👨‍💻 Autor

Projeto desenvolvido para fins acadêmicos.
