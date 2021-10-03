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
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		// passando uma peça e a posição à levá-la como parâmetro, sendo que a peça será atribuida à uma peça nesta posição da matriz de pieces do tabuleiro
		pieces[position.getRow()][position.getColumn()] = piece;
		// pense que antes essa peça estava numa posição nula, se agora eu movi ela para uma posição, ela tem a position atual, position é protected
		piece.position = position;
	}
}
