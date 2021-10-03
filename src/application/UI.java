package application;

import boardgame.Piece;
import chess.ChessPiece;

public class UI {

    // criando o método que msotrar o tabuleiro na interface
    public static void printBoard(ChessPiece[][] pieces) {
        // matriz quadrada, então para cada linha
        for (int i = 0; i < pieces.length; i++) {
            // mostro o número de cada linha em ordem decrescente
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++) {
                // para cada linha vou percorrer todas as colunas da matriz e chamar a função que printa algo para CADA peça
                printPiece(pieces[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("  a b c d e f g h");
    }

    // método auxiliar que imprime uma peça
    private static void printPiece(ChessPiece piece) {
        // imprimindo cada peça sendo um traço e entre elas tendo espaço
        if (piece == null) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
