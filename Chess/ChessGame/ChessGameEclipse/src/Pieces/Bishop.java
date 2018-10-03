package Pieces;

public class Bishop extends ChessPiece {
    
    public Bishop(int _x, int _y, int _playerNum) {
        super(_x, _y, _playerNum);
    }
    
    @Override
    protected boolean canMoveTo(int _newX, int _newY, int _playerTurn) {
        //Get the mangitude of the difference between the current location and the new location
        if(playerNum == _playerTurn)
        {
             int deltaX = Math.abs(_newX - x);
             int deltaY = Math.abs(_newY - y);
        
            return (deltaX == deltaY);
        }
        else
            return false;
       
    }

    @Override
    public int getPieceType() {
        return 4;
    }

    @Override
    public String getName() {
        String name = "b" + playerNum;
        return name;
    }

    @Override
    protected void Died() {
        
    }
    
}
