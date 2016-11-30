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
		
		
		
		for(int counter=1;a-counter>=0;counter++)
		{
			if(((a-counter)^b^c)==0)
			{
				game.remove("a", counter);
				break;
			}
		}
		
		
	}

}
