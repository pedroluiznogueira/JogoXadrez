package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;


public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

	// método que vai colocar as peças no tabuleiro ao iniciar a partida
	private void initialSetup() {
		/*
			 perante o tabuleiro da partida, vou chamar placePiece que vai precisar de uma peça e uma posição à ser levada
			 lembrando que por conta do toString dessas peças mais específicas, o board da partida vai colocá-lo na matriz de
			 Piece[][] da Board, então por conta de mexermos no Piece[][], quando o getPieces for passar a matriz do tabuleiro
			 que é Piece[][] para ChessPiece, ela já vai vir posicionada com a peça específica e ao serem imprimidos, por conta
			 do toString no console sairá o seu prefixo
		*/
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}
