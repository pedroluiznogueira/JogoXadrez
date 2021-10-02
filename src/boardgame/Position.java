package boardgame;

public class Position {
	// essa classe define as posições do tabuleiro
	private int row;
	private int column;

	// será possível passar a linha e a coluna no construtor do objeto
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
