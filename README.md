# 🎯 Jogo de Adivinhação

Um jogo simples de adivinhação de números em Java, onde o jogador escolhe um nível de dificuldade e tenta adivinhar um número gerado aleatoriamente dentro de um limite determinado.

## 🚀 Funcionalidades

- Escolha entre **três níveis de dificuldade**:
  - **Fácil**: Número entre 1 e 50 (12 tentativas)
  - **Médio**: Número entre 1 e 500 (10 tentativas)
  - **Difícil**: Número entre 1 e 5000 (8 tentativas)
- O jogo oferece **dicas** ao jogador após metade das tentativas:
  - Se o número é **par ou ímpar** (Fácil)
  - Se é **divisível por um número específico** ou **primo** (Médio)
  - Se é **um quadrado perfeito, primo ou a soma dos seus dígitos** (Difícil)
- Tratamento de erros para entrada inválida do usuário
- Opção de **jogar novamente** após o término

## 📌 Como Jogar

Siga os passos abaixo para rodar o jogo no seu computador:

1. **Clone o repositório**:
   - Para obter uma cópia do repositório no seu computador, abra o terminal ou prompt de comando e execute o seguinte comando:
     ```bash
     git clone https://github.com/seuusuario/JogoAdivinhacao.java.git
     ```
   - Substitua `seuusuario` pelo seu nome de usuário no GitHub.

2. **Instale o Java** (caso não tenha instalado):
   - Se você não tem o Java instalado, baixe e instale o **JDK** (Java Development Kit) [aqui](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   - Verifique se o Java foi instalado corretamente no seu sistema, executando no terminal:
     ```bash
     java -version
     ```
   - Se aparecer a versão do Java, significa que está instalado corretamente.

3. **Abra o projeto no seu terminal**:
   - Navegue até a pasta onde o repositório foi clonado. Por exemplo, se você o clonou na área de trabalho, use:
     ```bash
     cd ~/Desktop/JogoAdivinhacao.java
     ```

4. **Compile e execute o programa**:
   - Para compilar o código Java, execute o seguinte comando:
     ```bash
     javac JogoAdivinhacao.java
     ```
   - Para rodar o jogo, use:
     ```bash
     java JogoAdivinhacao
     ```

5. **Jogue!**:
   - Após executar o comando acima, o jogo será iniciado no seu terminal. Você verá as opções de dificuldade e poderá seguir as instruções para adivinhar o número gerado pelo programa.

## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 8+)
- **IntelliJ IDEA** 
- **Git/GitHub** para controle de versão

## 🏆 Melhorias Futuras

- Adicionar um **modo multiplayer**
- Implementar uma **interface gráfica (GUI)**
- Salvar **estatísticas do jogador** em um arquivo

## 📄 Licença

Este projeto é de código aberto e pode ser usado para aprendizado e melhorias. 🚀
