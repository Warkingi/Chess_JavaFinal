
import Pieces.ChessPiece;

public class GameBoard {

    ChessPiece[][] gameboard;
    
    public GameBoard(ChessPiece[] _player1, ChessPiece[] _player2) {
        
        gameboard = new ChessPiece[8][8];
        for(int i = 0; i < _player1.length; i++)
        {
            gameboard[_player1[i].getPosition()[0]][_player1[i].getPosition()[1]] = _player1[i];
            gameboard[_player2[i].getPosition()[0]][_player2[i].getPosition()[1]] = _player2[i];
        }
    }
    
    public void PrintBoard()
    {
        System.out.println("    0    1    2    3    4    5    6    7");
        System.out.println("  |---------------------------------------|");
        
        for(int i = 7; i > -1; i--)
        {
            System.out.print(i + " ");
            for(int j = 0; j < 8; j++) {
                if(gameboard[j][i] != null)
                {
                    System.out.print("| " + gameboard[j][i].getName() + " ");
                }
                else
                    System.out.print("|    ");
            }
            System.out.println("| " +i);
            System.out.println("  |---------------------------------------|");
        }
        
        System.out.println("    0    1    2    3    4    5    6    7");
       
    } 
}
