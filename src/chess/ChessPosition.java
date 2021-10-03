package chess;

import boardgame.Position;

public class ChessPosition {
    // as posições para o xadrez são no formato letra-numero
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        // verificando se a linha e a coluna estão dentro das coordenadas usadas no tabuleiro
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition: Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    // não quero que linhas e colunas possam ser alteradas
    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    /*
        -> convertendo a ChessPosition para o Position normal
        -> lógica implementada
            para converter linhas:
                matrix_row = 8 - chess_row
            para converter colunas:
                'a' - 'a' = 0
                'b' - 'a' = 1
                matrix_column = chess_column - 'a'
    */
    protected Position toPosition() {
        return new Position(8 - this.row, this.column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        // fazendo a operação reversa
        return new ChessPosition( (char) ('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + this.column + this.row;
    }
}
