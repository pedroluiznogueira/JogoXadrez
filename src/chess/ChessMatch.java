package chess;

import boardgame.Board;
import boardgame.Piece;

// aqui quero ter as regras do jogo
public class ChessMatch {
    private Board board;

    public ChessMatch() {
        // quem tem que saber as dimensões do tabuleiro é a partida, pois aqui são ditadas as regras
        this.board = new Board(8, 8);
    }

    /*
        retorna a matriz das peças de xadrez referente à uma determinada partida
        preciso que meu programa tenha uma ChessPiece (camada chess) e não uma Piece (camada boardgame) que está em Board
    */
    public Piece[][] getPieces() {
        Piece[][] mat  = new ChessPiece[board.getRows()][board.getColumns()];
        return mat;
    }
}
