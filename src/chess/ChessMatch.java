package chess;

import board.Board;
import board.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                matrix[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return matrix;
    }

    private void initialSetup() {
        // ==== WHITE ====================================
        // KING
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));

        // QUEEN
//        board.placePiece(new Queen(board, Color.BLACK), new Position(7, 3));

        // THE ROOOOOOOOOOOOOOOOOOOOK
        board.placePiece(new Rook(board, Color.WHITE), new Position(7, 0));
        board.placePiece(new Rook(board, Color.WHITE), new Position(7, 7));

        // KNIGHT
//        board.placePiece(new Knight(board, Color.WHITE), new Position(7, 1));
//        board.placePiece(new Knight(board, Color.WHITE), new Position(7, 6));

        // BISHOP
//        board.placePiece(new Bishop(board, Color.WHITE), new Position(7, 2));
//        board.placePiece(new Knight(board, Color.WHITE), new Position(7, 5));

        // PAWNS
//        for (int i = 0; i < board.getRows(); i++) {
//            board.placePiece(new Pawn(board, Color.WHITE), new Position(6, i));
//        }

        // ==== BLACK ====================================
        // KING
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));

        // QUEEN
//        board.placePiece(new Queen(board, Color.BLACK), new Position(0, 3));

        // THE ROOOOOOOOOOOOOOOOOOOOK
        board.placePiece(new Rook(board, Color.BLACK), new Position(0, 7));
        board.placePiece(new Rook(board, Color.BLACK), new Position(0, 0));

        // KNIGHT
//        board.placePiece(new Knight(board, Color.WHITE), new Position(0, 1));
//        board.placePiece(new Knight(board, Color.WHITE), new Position(0, 6));

        // BISHOP
//        board.placePiece(new Bishop(board, Color.WHITE), new Position(0, 2));
//        board.placePiece(new Knight(board, Color.WHITE), new Position(0, 5));

        // PAWNS
//        for (int i = 0; i < board.getRows(); i++) {
//            board.placePiece(new Pawn(board, Color.WHITE), new Position(1, i));
//        }
    }

}
