import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest 
{

	@Test
	public void constructor_shouldReturnNumberViaGetHeapA() 
	{
		model.Game sut=new model.Game(3, 5, 7);
		int actual=sut.getHeapA();
		int expected=3;
		assertEquals(actual, expected);		
	}
	
	@Test 
	public void constructor_shouldReturnNumberViaGetHeapB()
	{
		model.Game sut=new model.Game(3, 5, 7);
		int actual=sut.getHeapB();
		int expected=5;
		assertEquals(actual, expected);
	}
	
	@Test
	public void constructor_shouldReturnNumberViaGetHeapC()
	{
		model.Game sut=new model.Game(3, 5, 7);
		int actual=sut.getHeapC();
		int expected=7;
		assertEquals(actual, expected);
	}

}
