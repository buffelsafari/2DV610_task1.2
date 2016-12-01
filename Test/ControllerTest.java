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
	
	@Test
	public void play_shouldcallShowEndMessage() 
	{
		Mockito.when(game.isGameOver()).thenReturn(true);  // else we get stuck in a loop later
		sut.play(game, view, computer);
		Mockito.verify(view, Mockito.times(1)).showEndMessage();		
	}
	
	@Test
	public void play_shouldcallShowYouMove()
	{
		Mockito.when(game.isGameOver()).thenReturn(false).thenReturn(true);  // enter loop and exit the next test
		Mockito.when(view.input()).thenReturn(true);  // good input
		Mockito.when(game.remove(view.getHeap(), view.getNumber())).thenReturn(true);  // valid remove
		sut.play(game, view, computer);
		Mockito.verify(view, Mockito.times(1)).showYouMove(game.getLastHeap(), game.getLastNum());
	}
}
