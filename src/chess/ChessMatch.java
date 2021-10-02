package chess;

import boardgame.Board;

// aqui quero ter as regras do jogo
public class ChessMatch {
    private Board board;

    public ChessMatch(Board board) {
        // quem tem que saber as dimensões do tabuleiro é a partida, pois aqui são ditadas as regras
        this.board = new Board(8, 8);
    }
    /*
        retorna a matriz das peças de xadrez referente à uma determinada partida
        preciso que meu programa tenha uma ChessPiece (camada chess) e não uma Piece (camada boardgame) que está em Board
    */
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat  = new ChessPiece[board.getRows()][board.getColumns()];

        // para cada linha, vou percorrer as colunas do tabuleiro
        for (int i = 0; i < board.getRows(); i++) {
            // percorrendo as colunas da linha da iteração
            for (int j = 0; j < board.getColumns(); j++) {
                // lembrar que o método piece retorna uma peça de determinada linha e coluna
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
