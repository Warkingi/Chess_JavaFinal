package pack.Core;

import pack.Pawn;

public class Main {

	
	public static void main(String args[]){
		
		Pawn pawn = new Pawn((short)2, (short)2);
		
		System.out.println(pawn.getType() + " " + pawn.getPosition()[0] + " , " + pawn.getPosition()[1]);
		
	}
	
	
}
