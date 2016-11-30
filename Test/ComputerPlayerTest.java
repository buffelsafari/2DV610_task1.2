import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class ComputerPlayerTest 
{

	@Test
	public void ComputerPlayer_makeMove_shouldCallGetHeapA() 
	{
		model.Game mockGame=Mockito.mock(model.Game.class);
		model.ComputerPlayer sut=new model.ComputerPlayer();
		sut.MakeMove(mockGame);
		
		Mockito.verify(mockGame).getHeapA();
	}

}
