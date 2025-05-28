package application;

import chess.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces) {

        // Linhas com as peças
        // 8 - = - = - = - =
        // 7 = - = - = - = -
        // 6 ...
        for (int i = 0; i < pieces.length; i++) {

            boolean isWhite = (i % 2 == 0);
            System.out.print((8 - i) + " ");

            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j], isWhite);
                isWhite = !isWhite;
            }

            System.out.println();
        }

        // Ultima linha
        // a b c d e...
        System.out.print("  ");

        char letter = 'a';
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((char)(letter + i));
            System.out.print(" ");
        }

    }

    private static void printPiece(ChessPiece piece, boolean isWhite) {
        if (piece == null) {
            System.out.print(isWhite ? "-" : "=");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
