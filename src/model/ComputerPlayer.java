package model;

public class ComputerPlayer 
{
	// should remove atleast one stick from one of the heaps
	// Should try to make a winning move if possible
	// If the player get the heaps to a zero nimSum, the player will win(if no mistakes are made)
	// nimSum is a^b^c
	// 
	public void MakeMove(Game game)
	{
		int a=game.getHeapA();
		int b=game.getHeapB();
		int c=game.getHeapC();
		
		int numA=findZeroSumA(a,b,c);
		int numB=findZeroSumA(b,c,a);
		int numC=findZeroSumA(c,b,a);
		
		// make some winning move
		if(numA>0)
		{
			game.remove("a", numA);
			return;
		}
		
		if(numB>0)
		{
			game.remove("b", numB);
			return;
		}
		
		if(numC>0)
		{
			game.remove("c", numC);
			return;
		}	
		
		// make loser move, maybe it should be random for a better game.
		if(a>0)
		{
			game.remove("a", 1);
			return;
		}
		if(b>0)
		{
			game.remove("b", 1);
			return;
		}
		// c>0 can never happen att this point, if a=b=c=0 then game over
		
	}
	
	// finds the nimZeroSum 
	// is commutative, so it can be used for all zeroSums
	private int findZeroSumA(int A, int b, int c)
	{
		for(int counter=1;(A-counter)>=0;counter++)
		{
			if(((A-counter)^b^c)==0)
			{
				return counter;
			}
		}
		return -1;
	}		

}
