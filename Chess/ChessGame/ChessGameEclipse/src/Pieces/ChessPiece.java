package Pieces;

public abstract class ChessPiece {
	
	protected int x = 0, y = 0;
    
    protected int playerNum;
    
    public ChessPiece(int _x, int _y, int _playerNum) {
        x = _x;
        y = _y;
        playerNum = _playerNum;
    }
    
    protected abstract boolean canMoveTo(int x, int y, int playerTurn);
    
    public abstract String getName();
    
    public abstract int getPieceType();
    
    protected abstract void Died();
    
    //Abstract class's method for moving
    public void moveTo(int _newX, int _newY)
    {
        x = _newX;
        y = _newY;
    }
    
    //Abstract class's method for getting the position of the piece
    public int getPosition()[] {
        int[] position = new int[2];
        position[0] = x;
        position[1] = y;
        return position;
    }
    
    public int getXLocation()
    {
        return x;
    }
    public int getYLocation()
    {
        return y;
    }
    
}
