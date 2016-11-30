import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ComputerPlayerTest 
{
	private model.ComputerPlayer sut;
	private model.Game mockGame;
	
	@Before
	public void setup()
	{
		mockGame=Mockito.mock(model.Game.class);
		sut=new model.ComputerPlayer();
	}
	
	@Test
	public void makeMove_shouldCallGetHeapA() 
	{
		sut.MakeMove(mockGame);		
		Mockito.verify(mockGame).getHeapA();
	}
	
	@Test
	public void makeMove_shouldCallGetHeapB() 
	{
		sut.MakeMove(mockGame);		
		Mockito.verify(mockGame).getHeapB();
	}
	
	@Test
	public void makeMove_shouldCallGetHeapC() 
	{
		sut.MakeMove(mockGame);		
		Mockito.verify(mockGame).getHeapC();
	}
	
	@Test
	public void MakeMove_shouldCallRemove1() // changed the test in the last commit, calculated wrong
	{
		Mockito.when(mockGame.getHeapA()).thenReturn(7);
		Mockito.when(mockGame.getHeapB()).thenReturn(5);
		Mockito.when(mockGame.getHeapC()).thenReturn(1);
		sut.MakeMove(mockGame);
		
		Mockito.verify(mockGame).remove("a", 3);
	}
	
	@Test
	public void MakeMove_shouldCallRemove2()
	{
		Mockito.when(mockGame.getHeapA()).thenReturn(5);
		Mockito.when(mockGame.getHeapB()).thenReturn(7);
		Mockito.when(mockGame.getHeapC()).thenReturn(1);
		sut.MakeMove(mockGame);
		
		Mockito.verify(mockGame).remove("b", 3);
	}

}
