package pack;

import pack.interfaces.ChessPieceInterface;

public class ChessPiece implements ChessPieceInterface{

	public short x = 0, y = 0;
	
	@Override
	public Object getType() {
		
		//Return the class as the object and it's location in memory.
		return this;
	}

	@Override
	public short getPosition()[] {
		
		short[] _position = new short[2];
			_position[0] = x;
			_position[1] = y;
		
		return _position;
	}
	
	@Override
	public void moveTo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDead() {
		// TODO Auto-generated method stub
		return false;
	}

}
