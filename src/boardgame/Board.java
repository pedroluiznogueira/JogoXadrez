package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) throws BoardException {
		// não faz sentido eu criar um tabuleiro com 0 ou menos lihas/colunas, tem que ter pelo menos 1
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be as least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	// vericiando se a posição existe realmente no tabuleiro antes de prosseguir com a execução das funções que à usa
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position doesn't exists on the board");
		}
		return pieces[row][column];
	}

	// vericiando se a posição existe realmente no tabuleiro antes de prosseguir com a execução das funções que à usa
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position doesn't exists on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	/*
		vericiando se a posição existe realmente no tabuleiro antes de prosseguir com a execução das funções que à usa,
		e verificando se a posição que estou querendo mover uma peça já tem uma peça nela, porém delegando essa segunda
		verificação dentro do método thereIsAPiece, já que ele também usa a mesma posição
	*/
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("This position already has a piece on it");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	// auxiliar para hora que em positionExists for mais fácil testar pela linha e pela coluna
	private boolean positionExists(int row, int column) {
		// lógica referindo se a posição passada existe no tabuleiro, referente à sua quantidade de linhas e colunas
		return row >= 0 && row < this.rows && column >= 0 && column < this.columns;
	}

	// verificando se a posição existe
	public boolean positionExists(Position position) {
		// se os atributos de position são uma linha e uma coluna, fica mais fácil passá-los como parâmetro para o método auxiliar
		return positionExists(position.getRow(), position.getColumn());
	}

	// verificando se há uma peça em determinada posição
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position doesn't exists on the board");
		}
		// testo se a peça que está na posição é igual a null ou não, se for significa que não tem peça lá
		return this.piece(position) != null;

	}
}
