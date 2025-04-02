# Controle de Carro

## Sobre o Projeto
Este projeto implementa um sistema de controle para um carro, permitindo a realização de diversas ações como ligar, desligar, acelerar e trocar de marcha, respeitando regras específicas para simular um funcionamento realista.

## Funcionalidades
O carro possui as seguintes operações:

- **Ligar o carro** 🚗
- **Desligar o carro** ⛔
- **Acelerar** 🔼 (+1 km/h por vez, até no máximo 120 km/h)
- **Diminuir a velocidade** 🔽 (-1 km/h por vez, até no mínimo 0 km/h)
- **Virar para esquerda/direita** ↩️➡️ (apenas entre 1 km/h e 40 km/h)
- **Verificar velocidade** 📊
- **Trocar de marcha** ⚙️ (seguindo a progressão correta)

## Regras de Implementação
- O carro inicia **desligado**, em **ponto morto (marcha 0)** e com **velocidade 0 km/h**.
- O carro **desligado** não pode executar nenhuma ação.
- A velocidade do carro **aumenta em 1 km/h** por aceleração e **reduz em 1 km/h** por desaceleração.
- A velocidade máxima é **120 km/h**, e a mínima **0 km/h**.
- O carro possui **6 marchas** e **não pode pular marchas**.
- A velocidade permitida por marcha:
  - **Marcha 0 (ponto morto)** → 0 km/h (não pode acelerar)
  - **1ª marcha** → 0 km/h a 20 km/h
  - **2ª marcha** → 21 km/h a 40 km/h
  - **3ª marcha** → 41 km/h a 60 km/h
  - **4ª marcha** → 61 km/h a 80 km/h
  - **5ª marcha** → 81 km/h a 100 km/h
  - **6ª marcha** → 101 km/h a 120 km/h
- O carro **só pode ser desligado** se estiver em **ponto morto (marcha 0)** e **com velocidade 0 km/h**.
- O carro **só pode virar** para esquerda ou direita se estiver entre **1 km/h e 40 km/h**.

## Tecnologias Utilizadas
- **Java**
- **Programação Orientada a Objetos (POO)**

## Autor
Desenvolvido por **Jorginho Vigas**.

