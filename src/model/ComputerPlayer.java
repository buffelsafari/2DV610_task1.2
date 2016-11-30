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
