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

	// criando um método que vai usar o placePiece() já passando a posição como segundo parâmetro convertido, criando um ChessPosition no parâmetro e chamando o método toPosition
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		// agora chamando o método placeNewPiece, que poderei passar os parâmetros no sistema de coordenadas do xadrez e passando uma peça específica como último parâmetro
		this.placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		this.placeNewPiece('e', 8, new King(board, Color.BLACK));
		this.placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
}
