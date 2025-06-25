# Jogo de Xadrez em Java

Um jogo de xadrez completo desenvolvido em Java, com todas as regras padrão e movimentos especiais, implementado com interface de console.

![Screenshot do Jogo de Xadrez](caminho-para-imagem)

## Funcionalidades

- Implementação completa de todas as regras do xadrez
- Interface de console colorida com caracteres Unicode
- Destaque de movimentos possíveis
- Acompanhamento do estado do jogo (turnos, xeque, xeque-mate)
- Movimentos especiais:
    - Roque (Pequeno e Grande)
    - Captura en passant
    - Promoção de peão
- Exibição de peças capturadas
- Tratamento de erros para movimentos inválidos

## Capturas de Tela

### Tabuleiro
![Tabuleiro](caminho-para-imagem-tabuleiro)

### Destaque de Movimentos
![Destaque de Movimentos](caminho-para-imagem-destaque)

### Situação de Xeque
![Xeque](caminho-para-imagem-xeque)

### Xeque-mate
![Xeque-mate](caminho-para-imagem-xeque-mate)

### Movimentos Especiais
![Roque](caminho-para-imagem-roque) ![En Passant](caminho-para-imagem-enpassant) ![Promoção](caminho-para-imagem-promocao)

## Como Jogar

1. Execute a aplicação
2. O jogo começa com as peças brancas
3. Digite suas jogadas usando notação algébrica:
     - Primeiro, digite a posição de origem (ex: e2)
     - Em seguida, digite a posição de destino (ex: e4)
4. O destaque azul mostra os movimentos possíveis para a peça selecionada
5. Se ocorrer uma promoção de peão, você será solicitado a escolher uma peça (Q, R, B ou N)
6. O jogo termina quando ocorre um xeque-mate

## Controles e Notação

- As posições do tabuleiro usam notação algébrica (a1 até h8)
- As peças são representadas como:
    - Rei (K)
    - Rainha (Q)
    - Torre (R)
    - Bispo (B)
    - Cavalo (N)
    - Peão (P)
- Peças brancas são exibidas em branco, peças pretas em amarelo
- Mensagens de erro aparecem se um movimento inválido for tentado

## Detalhes Técnicos

### Estrutura de Pacotes

```
application/
        Program.java      - Ponto de entrada da aplicação
        UI.java           - Interface com o usuário
board/
        Board.java        - Representação do tabuleiro
        BoardException.java
        Piece.java        - Classe abstrata de peça
        Position.java     - Posições do tabuleiro
chess/
        ChessException.java
        ChessMatch.java   - Mecânica principal do jogo
        ChessPiece.java   - Abstração de peça específica de xadrez
        ChessPosition.java - Tratamento de notação algébrica
        Color.java        - Enum de cor das peças
        pieces/           - Implementações de peças individuais
                Bishop.java
                King.java
                Knight.java
                Pawn.java
                Queen.java
                Rook.java
```

### Implementação de Movimentos Especiais

- **Roque**: Implementado na classe King com validação para rei e torre não movidos
- **En Passant**: Captura especial quando o peão do oponente avança duas casas
- **Promoção de Peão**: Promoção automática com opção de escolher o tipo da nova peça

## Requisitos

- Java Development Kit (JDK) 11 ou superior
- Console/terminal que suporte códigos de cores ANSI

## Compilação e Execução

```bash
# Compilar o projeto
javac -d out src/application/Program.java

# Executar o jogo
java -cp out application.Program
```

## Melhorias Futuras

- Controle de tempo
- Histórico/notação de movimentos
- Funcionalidade de salvar/carregar jogo
- Implementação de interface gráfica
