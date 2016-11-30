import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest 
{

	@Test
	public void Constructor_shouldReturnNumberViaGetHeapA() 
	{
		model.Game sut=new model.Game(3, 5, 7);
		int actual=sut.getHeapA();
		int expected=3;
		assertEquals(actual, expected);		
	}

}
