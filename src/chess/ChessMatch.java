package chess;

import board.Board;
import board.Piece;
import board.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
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

    public ChessPiece performChessMove(ChessPosition sourcePos, ChessPosition targetPos) {
        Position source = sourcePos.toPosition();
        Position target = targetPos.toPosition();

        validateSourcePosition(source);

        Piece capturedPiece = makeMove(source, target);
        return (ChessPiece)capturedPiece;
    }

    private Piece makeMove(Position source, Position target) {
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);
        return capturedPiece;
    }

    private void validateSourcePosition(Position position) {
        if (!board.thereIsAPiece(position)) {
            throw new ChessException("There is no piece on source position");
        }
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        // ==== WHITE ====================================
        // KING
        placeNewPiece('e', 1, new King(board, Color.WHITE));

        // QUEEN
//        placeNewPiece('d', 1, new Queen(board, Color.BLACK));

        // THE ROOOOOOOOOOOOOOOOOOOOK
        placeNewPiece('a', 1, new Rook(board, Color.WHITE));
        placeNewPiece('h', 1, new Rook(board, Color.WHITE));

        // KNIGHT
//        placeNewPiece('b', 1, new Knight(board, Color.WHITE));
//        placeNewPiece('g', 1, new Knight(board, Color.WHITE));

        // BISHOP
//        placeNewPiece('c', 1, new Bishop(board, Color.WHITE));
//        placeNewPiece('f', 1, new Knight(board, Color.WHITE));

        // PAWNS
//        for (int i = 0; i < board.getRows(); i++) {
//            placeNewPiece((char)('a' + i), 2, new Pawn(board, Color.WHITE));
//        }

        // ==== BLACK ====================================
        // KING
        placeNewPiece('e', 8, new King(board, Color.BLACK));

        // QUEEN
//        placeNewPiece('d', 8, new Queen(board, Color.BLACK));

        // THE ROOOOOOOOOOOOOOOOOOOOK
        placeNewPiece('a', 8, new Rook(board, Color.BLACK));
        placeNewPiece('h', 8, new Rook(board, Color.BLACK));

        // KNIGHT
//        placeNewPiece('b', 8, new Knight(board, Color.BLACK));
//        placeNewPiece('g', 8, new Knight(board, Color.BLACK));

        // BISHOP
//        placeNewPiece('c', 8, new Bishop(board, Color.BLACK));
//        placeNewPiece('f', 8, new Knight(board, Color.BLACK));

        // PAWNS
//        for (int i = 0; i < board.getRows(); i++) {
//            placeNewPiece((char)('a' + i), 7, new Pawn(board, Color.BLACK));
//        }

    }
}
