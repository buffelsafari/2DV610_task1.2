package controller;
import model.ComputerPlayer;
import model.Game;
import view.ConsoleView;

public class Controller 
{
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
			if(game.isGameOver())
			{
				view.showYouWin();
				break;
			}			
			computer.MakeMove(game);
			
			view.showYouLose();
			// 	4. test for win(is game over)
		
		}
				
		view.showEndMessage();
	}
}
