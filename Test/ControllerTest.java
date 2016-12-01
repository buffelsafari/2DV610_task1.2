import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ControllerTest 
{

	controller.Controller sut;
	model.Game game;
	view.ConsoleView view;
	model.ComputerPlayer computer;
	
	@Before
	public void setup()
	{
		sut=new controller.Controller();
		game=Mockito.mock(model.Game.class);
		view=Mockito.mock(view.ConsoleView.class);
		computer=Mockito.mock(model.ComputerPlayer.class);
	}
	
	@Test
	public void play_shouldcallShowWelcomeMessage() 
	{
		Mockito.when(game.isGameOver()).thenReturn(true);  // else we get stuck in a loop later
		sut.play(game, view, computer);
		Mockito.verify(view, Mockito.times(1)).showWelcomeMessage();		
	}
	
	@Test
	public void play_shouldcallShowHeaps() 
	{
		Mockito.when(game.isGameOver()).thenReturn(true);  // else we get stuck in a loop later
		sut.play(game, view, computer);
		Mockito.verify(view, Mockito.times(1)).showHeaps(game.getHeapA(), game.getHeapB(), game.getHeapC());		
	}
}
