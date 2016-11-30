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
	
	@Test
	public void constructor_shouldReturnNumberViaGetHeapA3() 
	{
		model.Game sut=new model.Game(0, 7, 3);
		int actual=sut.getHeapA();
		int expected=0;
		assertEquals(actual, expected);		
	}
	
	@Test 
	public void constructor_shouldReturnNumberViaGetHeapB3()
	{
		model.Game sut=new model.Game(0, 0, 0);
		int actual=sut.getHeapB();
		int expected=0;
		assertEquals(actual, expected);
	}
	
	@Test
	public void constructor_shouldReturnNumberViaGetHeapC3()
	{
		model.Game sut=new model.Game(0, 7, 0);
		int actual=sut.getHeapC();
		int expected=0;
		assertEquals(actual, expected);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constructor_shouldThrowIllegalArgumentExeption1()
	{
		model.Game sut=new model.Game(-1, 3, 5);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constructor_shouldThrowIllegalArgumentExeption2()
	{
		model.Game sut=new model.Game(3, -1, 5);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constructor_shouldThrowIllegalArgumentExeption3()
	{
		model.Game sut=new model.Game(3, 7, -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constructor_shouldThrowIllegalArgumentExeption4()
	{
		model.Game sut=new model.Game(-1, 3, -3);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constructor_shouldThrowIllegalArgumentExeption5()
	{
		model.Game sut=new model.Game(3, -1, -2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constructor_shouldThrowIllegalArgumentExeption6()
	{
		model.Game sut=new model.Game(-5, -3, -1);
	}
	
	// tries all the branches
	@Test
	public void isGameOver_viaConstructor_shouldReturnTrue()
	{
		model.Game sut=new model.Game(0, 0, 0);
		assertTrue(sut.isGameOver());
	}
	
	@Test
	public void isGameOver_viaConstructor_shouldReturnFalse1()
	{
		model.Game sut=new model.Game(1, 0, 0);
		assertFalse(sut.isGameOver());
	}
	
	@Test
	public void isGameOver_viaConstructor_shouldReturnFalse2()
	{
		model.Game sut=new model.Game(0, 1, 0);
		assertFalse(sut.isGameOver());
	}
	
	@Test
	public void isGameOver_viaConstructor_shouldReturnFalse3()
	{
		model.Game sut=new model.Game(0, 0, 1);
		assertFalse(sut.isGameOver());
	}
	
	@Test
	public void isGameOver_viaConstructor_shouldReturnFalse4()
	{
		model.Game sut=new model.Game(1, 1, 0);
		assertFalse(sut.isGameOver());
	}
	
	@Test
	public void isGameOver_viaConstructor_shouldReturnFalse5()
	{
		model.Game sut=new model.Game(1, 0, 1);
		assertFalse(sut.isGameOver());
	}
	
	@Test
	public void isGameOver_viaConstructor_shouldReturnFalse6()
	{
		model.Game sut=new model.Game(1, 1, 1);
		assertFalse(sut.isGameOver());
	}
	
	@Test
	public void remove_shouldReturnHeapSizeViaGetHeapA()
	{
		model.Game sut=new model.Game(3, 5, 7);
		sut.remove("a", 1);
		int actual=sut.getHeapA();
		int expected=2;
		assertEquals(actual, expected);
	}
	
	@Test
	public void remove_shouldNotAlterTheAHeap()
	{
		model.Game sut=new model.Game(3, 5, 7);
		sut.remove("b", 1);
		int actual=sut.getHeapA();
		int expected=3;
		assertEquals(actual, expected);
	}
	
	@Test
	public void remove_shouldReturnHeapSizeViaGetHeapB()
	{
		model.Game sut=new model.Game(3, 5, 7);
		sut.remove("b", 1);
		int actual=sut.getHeapB();
		int expected=4;     // last git was wrong
		assertEquals(actual, expected);
	}
	
	@Test
	public void remove_shouldNotAlterTheBHeap()
	{
		model.Game sut=new model.Game(3, 5, 7);
		sut.remove("a", 1);
		int actual=sut.getHeapB();
		int expected=5;
		assertEquals(actual, expected);
	}
	
	@Test
	public void remove_shouldReturnHeapSizeViaGetHeapC()
	{
		model.Game sut=new model.Game(3, 5, 7);
		sut.remove("c", 1);
		int actual=sut.getHeapC();
		int expected=6;     // last git was wrong
		assertEquals(actual, expected);
	}
	
	@Test
	public void remove_shouldNotAlterTheCHeap()
	{
		model.Game sut=new model.Game(3, 5, 7);
		sut.remove("b", 1);
		int actual=sut.getHeapC();
		int expected=7;
		assertEquals(actual, expected);
	}
	
	@Test
	public void remove_shouldReturnTrue1()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertTrue(sut.remove("a",3));
	}
	
	@Test
	public void remove_shouldReturnFalse1()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertFalse(sut.remove("a",4));
	}
	
	@Test
	public void remove_shouldReturnTrue2()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertTrue(sut.remove("b",5));
	}
	
	@Test
	public void remove_shouldReturnFalse2()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertFalse(sut.remove("b",6));
	}
	
	@Test
	public void remove_shouldReturnTrue3()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertTrue(sut.remove("c",7));
	}
	
	@Test
	public void remove_shouldReturnFalse3()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertFalse(sut.remove("c",8));
	}
	
	@Test
	public void remove_shouldReturnTrue4()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertTrue(sut.remove("a",2));
	}
	
	@Test
	public void remove_shouldReturnTrue5()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertTrue(sut.remove("b",2));
	}
	
	@Test
	public void remove_shouldReturnTrue6()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertTrue(sut.remove("c",2));
	}
	
	@Test
	public void remove_shouldReturnFalse4()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertFalse(sut.remove("d",1));
	}
	
	@Test
	public void remove_shouldReturnFalse5()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertFalse(sut.remove("a",0));
	}
	
	@Test
	public void remove_shouldReturnFalse6()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertFalse(sut.remove("b",0));
	}
	
	@Test
	public void remove_shouldReturnFalse7()
	{
		model.Game sut=new model.Game(3, 5, 7);
		assertFalse(sut.remove("c",0));
	}
	
}
