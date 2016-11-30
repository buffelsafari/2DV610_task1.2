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
	public void ComputerPlayer_makeMove_shouldCallGetHeapA() 
	{
		sut.MakeMove(mockGame);		
		Mockito.verify(mockGame).getHeapA();
	}
	
	@Test
	public void ComputerPlayer_makeMove_shouldCallGetHeapB() 
	{
		sut.MakeMove(mockGame);		
		Mockito.verify(mockGame).getHeapB();
	}

}
