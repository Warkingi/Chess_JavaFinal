package Pieces;

public class Pawn extends ChessPiece {

    //The pawn can do a unique move on it's first turn, therefore save a boolean to determine if it is it's first turn
    boolean firstTurn = true;
    int compareY = 0;
    
    //Default constructor, needs an x and a y
    public Pawn(int _x, int _y, int _playerNum) {
        super(_x, _y, _playerNum);
        
        switch(_playerNum) {
            case 1:
                //If it is player1's pawn, then the deltaY comparison must be positive
                compareY = 1;
                break;
            case 2:
                //If it is player2's pawn, then the deltaY comparison must be negative
                compareY = -1;
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }

    @Override
    protected boolean canMoveTo(int _newX, int _newY, int _playerTurn) {
        if(playerNum == _playerTurn)
        {
            int deltaY = _newY - y;
        
            //if it is player 1's turn, then the different between the new Y and old one has to be positive
        
            //if it is the first turn, then the pawn could move forward 1 or 2 spots
            if(firstTurn)
                return (x == _newX && deltaY == (compareY * 1) || x == _newX && deltaY == (compareY * 2));
        
            //If it is not the first turn, then only allow the pawn to move forward 1 spot
            else
                return (x == _newX && deltaY == (compareY * 1));
        }
        else
            return false;
    }

    @Override
    public String getName() {
        String name = "p" + playerNum;
        return name;
    }
    
    @Override
    public int getPieceType() {
        return 1;
    }
    
    @Override
    protected void Died() {
        
    }
    
}

