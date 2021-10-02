package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	// retornar uma peça dado uma linha e uma coluna
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	// sobre carregando o método, para agora retornar a peça pela posição e não mais dado uma linha e uma coluna
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
