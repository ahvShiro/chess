package chess;

import board.Position;

public class ChessPosition {
    private final char column;
    private final int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error in ChessPosition Instance: Invalid row or column input");
        }
        this.column = column;
        this.row = row;
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    @Override
    public String toString() {
        return "" + column + row;
    }

}
