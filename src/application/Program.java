package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		/*
			-> pilha de chamada dos métodos agora:

				1. chessMatch() cria um Board(i, j) que cria uma matriz de Pieces[i][j] que cria para cada elemento da
				matriz uma Piece com o Board desta partida e com a position inicial = null
				2. após essa pilha o construtor chessMatch() chama initialSetup(), que chama placePiece() da classe Board
				para quantas peças eu determinar na classe Board.
				3. cada vez que eu chamar placePiece() eu vou alterar a matriz do Board da partida, pieces que veio com
				Piece[i][j], alterando de acordo com os parâmetros que eu passar, uma determinada peça especifica, e uma
				determinada posição à ser levada, como por ex: placePiece(Rook, position)
		*/
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}
