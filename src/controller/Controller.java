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
		
		// should start a game loop and loop until game.isGameOver
		while(!game.isGameOver())
		{
				
		// 	1. human player move
		//		a. input- loop until good input
			view.showInputError();
			
			view.showYouMove(game.getLastHeap(), game.getLastNum());
		//		c. show heaps
		
		//	2. test for win(is game over)
		//  3. computerMove
		// 	4. test for win(is game over)
		
		}
				
		view.showEndMessage();
	}
}
