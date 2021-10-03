package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    // para que quando o tabuleiro for impresso, onde estiver essa peça vai aparecer essa letra
    @Override
    public String toString() {
        return "R";
    }
}
