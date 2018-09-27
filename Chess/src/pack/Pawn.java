package pack;

public class Pawn extends ChessPiece{

	//The Pawn can move only forward one tile per turn with the exception of it's first turn.
	//Pawn can also only attack other pieces on the diagonal axis.
	
	public Pawn(short _x, short _y){
		
		x = _x;
		y = _y;
		
	}
	
}
