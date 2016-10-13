package Game;

public class Shape {

	// Sets Shape Names
	enum Tetromiones { None, ZShape, SShape, Line,
						TShape, Square, LShape, OLShape};
	
	private Tetromiones pieceShape;
	private int coords[][];
	private int [][][] coordsTable;
	
	public Shape(){
		coords = new int [4][2];
		setShape(Tetromiones.None);
	}
	
	public void setShape(Tetromiones shape){
		
	}
}
