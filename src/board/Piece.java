package board;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMove();

    public boolean isThereAnyPossibleMove() {
        boolean[][] matrix = possibleMove();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
