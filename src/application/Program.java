package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		/*
		  	-> instanciando uma partida de xadrez e imprimindo seu tabuleiro
			-> vou ter um método responsável por determinar como a matriz de peças da partida será mostrada como interface
			-> a pilha de chamada aqui fica:
				Chessmatch() chama =>  Board(8, 8) que chama => Piece[8][8]
				agora será chamado o getPieces() que cria uma matriz ChessPiece[8][8]
				que depende da quantidade de linhas e colunas que o tabuleiro desta
				partida recebeu, que foi feito em Board(8, 8) e apartir disso o método
				traz cada peça do tabuleiro para ChessPiece[8][8] que será passado
				como parâmetro para printBoard(ChessPiece[8][8]) que percorrerá e printará-lo
				no console
		*/
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}
