package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		// instanciando uma partida de xadrez e imprimindo seu tabuleiro
		ChessMatch chessMatch = new ChessMatch();
		// vou ter um método responsável por determinar como a matriz de peças da partida será mostrada como interface
		UI.printBoard(chessMatch.getPieces());

	}
}
