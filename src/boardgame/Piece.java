package boardgame;

public class Piece {
	// essa não é a posição do xadrez, é uma posição só visível para o tabuleiro
	protected Position position;
	// cada posição sabe o seu tabuleiro onde está, assim como o tabuleiro tem associação com suas peças
	private Board board;

	// a peça começa com uma posição nula, que seria o padrão, mas é bom enfatizar
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// não quero que a camada de xadrez possa acessar o tabuleiro
	protected Board getBoard() {
		return board;
	}
}
