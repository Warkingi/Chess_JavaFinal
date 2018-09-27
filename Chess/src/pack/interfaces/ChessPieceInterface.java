package pack.interfaces;

public interface ChessPieceInterface {

	//What do chess pieces need to have?
	
	//We need to know what type of chess piece it is.
	public Object getType();
	
	//Trying to use less memory here because we don't really need to count that high with position. (This is mostly unnecessary)
	//getPosition will try and find the X and Y on the chess board.
	//This is done in an array of 2 where 0 is X and 1 is Y.
	public short getPosition()[];
	
	//This is clear as it is although it will be overridden for each chess piece.
	public void moveTo();
	
	public boolean isDead();
	
}
