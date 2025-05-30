package chess;

import board.Board;
import board.Piece;
import board.Position;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int moveCount;
    private ChessPosition chessPosition;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public ChessPosition getChessPosition() {
        return chessPosition;
    }


    public abstract boolean[][] possibleMoves();

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
