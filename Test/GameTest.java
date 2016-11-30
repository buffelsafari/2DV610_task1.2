import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest 
{

	@Test
	public void constructor_shouldReturnNumberViaGetHeapA1() 
	{
		model.Game sut=new model.Game(3, 5, 7);
		int actual=sut.getHeapA();
		int expected=3;
		assertEquals(actual, expected);		
	}
	
	@Test 
	public void constructor_shouldReturnNumberViaGetHeapB1()
	{
		model.Game sut=new model.Game(3, 5, 7);
		int actual=sut.getHeapB();
		int expected=5;
		assertEquals(actual, expected);
	}
	
	@Test
	public void constructor_shouldReturnNumberViaGetHeapC1()
	{
		model.Game sut=new model.Game(3, 5, 7);
		int actual=sut.getHeapC();
		int expected=7;
		assertEquals(actual, expected);
	}
	
	// fler test med olika parametrar
	@Test
	public void constructor_shouldReturnNumberViaGetHeapA2() 
	{
		model.Game sut=new model.Game(5, 7, 3);
		int actual=sut.getHeapA();
		int expected=5;
		assertEquals(actual, expected);		
	}
	
	@Test 
	public void constructor_shouldReturnNumberViaGetHeapB2()
	{
		model.Game sut=new model.Game(5, 7, 3);
		int actual=sut.getHeapB();
		int expected=7;
		assertEquals(actual, expected);
	}
	
	@Test
	public void constructor_shouldReturnNumberViaGetHeapC2()
	{
		model.Game sut=new model.Game(5, 7, 3);
		int actual=sut.getHeapC();
		int expected=3;
		assertEquals(actual, expected);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constructor_shouldThrowIllegalArgumentExeption()
	{
		model.Game sut=new model.Game(-1, 3, 5);
	}
}
