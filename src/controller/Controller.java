package controller;

import model.ComputerPlayer;
import model.Game;
import view.ConsoleView;


public class Controller 
{

	// starts the game
	public void play(Game game, ConsoleView view, ComputerPlayer computer)
	{
		view.showWelcomeMessage();
		view.showHeaps(game.getHeapA(), game.getHeapB(), game.getHeapC());
		
		while(!game.isGameOver())
		{
			while(!(view.input() && game.remove(view.getHeap(), view.getNumber())))
			{
				view.showInputError();
			}
			view.showYouMove(game.getLastHeap(), game.getLastNum());
			view.showHeaps(game.getHeapA(), game.getHeapB(), game.getHeapC());
			
			view.showYouWin();
			//	2. test for win(is game over)
			//  3. computerMove
			// 	4. test for win(is game over)
		
		}
				
		view.showEndMessage();
	}
}
