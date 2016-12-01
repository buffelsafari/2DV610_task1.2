import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import view.ConsoleView;

public class ConsoleViewTest 
{
	PrintStream printStream;
	InputStream inputStream;		
	ConsoleView sut;
	
	private final static String welcomeString="Welcome to Dr. Nim's strategy game.\n"
			+"Pick any number of sticks from one of the heaps.\n"
			+"The player who picks the last stick win.\n"
			+"type a1 to remove 1 stick from heap A...\n";
	private final static String endString="Thank you for playing.";	
	private final static String heapHeadString="heaps\tA\tB\tC\n";
	private final static String winString="You win!";
	private final static String loseString="You lose!";	
	private final static String nimRemoved1="\nDr. Nim removed 3 sticks from heap A";
	private final static String nimRemoved2="\nDr. Nim removed 7 sticks from heap B";	
	private final static String youRemoved1="You removed 1 sticks from heap C";
	private final static String youRemoved2="You removed 3 sticks from heap A";
		
	@Before
	public void setup()
	{
		printStream=Mockito.mock(PrintStream.class);
		inputStream=Mockito.mock(InputStream.class);		
		sut=new view.ConsoleView(printStream, inputStream);
	}	
	
	@Test
	public void showWelcomeMessage_shouldOutputStringToPrintStream() 
	{
		sut.showWelcomeMessage();		
		Mockito.verify(printStream).println(welcomeString);		
	}
	
	@Test
	public void showEndMessage_shouldOutputStringToPrintStream() 
	{
		sut.showEndMessage();		
		Mockito.verify(printStream).println(endString);		
	}
	
	@Test
	public void showHeaps_shouldOutputStringToPrintStream1()
	{
		sut.showHeaps(3, 5, 7);
		Mockito.verify(printStream).println(heapHeadString+"     \t3\t5\t7");
	}
	
	@Test
	public void showHeaps_shouldOutputStringToPrintStream2()
	{
		sut.showHeaps(1, 7, 3);
		Mockito.verify(printStream).println(heapHeadString+"     \t1\t7\t3");
	}
	
	@Test
	public void showHeaps_shouldOutputStringToPrintStream3()
	{
		sut.showHeaps(1, 0, 5);
		Mockito.verify(printStream).println(heapHeadString+"     \t1\t0\t5");
	}
	
	@Test
	public void showYouWin_shouldOutputStringToPrintStream()
	{
		sut.showYouWin();
		Mockito.verify(printStream).println(winString);
	}
	
	@Test
	public void showYouLose_shouldOutputStringToPrintStream()
	{
		sut.showYouLose();
		Mockito.verify(printStream).println(loseString);
	}
	
	@Test
	public void showComputerMove_shouldOutputStringToPrintStream1()
	{
		sut.showComputerMove("a", 3);
		Mockito.verify(printStream).println(nimRemoved1);
	}
	
	@Test
	public void showComputerMove_shouldOutputStringToPrintStream2()
	{
		sut.showComputerMove("b", 7);
		Mockito.verify(printStream).println(nimRemoved2);
	}
	
	@Test
	public void showYouMove_shouldOutputStringToPrintStream1()
	{
		sut.showYouMove("c", 1);
		Mockito.verify(printStream).println(youRemoved1);
	}
	
	@Test
	public void showYouMove_shouldOutputStringToPrintStream2()
	{
		sut.showYouMove("a", 3);
		Mockito.verify(printStream).println(youRemoved2);
	}
	
	@Test
	public void input_shouldReturnTrue1()
	{
		inputStream=new ByteArrayInputStream("a1".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		assertTrue(sut.input());
	}
	
	@Test
	public void input_shouldReturnTrue2()
	{
		inputStream=new ByteArrayInputStream("b1".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		assertTrue(sut.input());
	}
	
	@Test
	public void input_shouldReturnTrue3()
	{
		inputStream=new ByteArrayInputStream("c1".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		assertTrue(sut.input());
	}
	
	@Test
	public void input_shouldReturnFalse1()
	{
		inputStream=new ByteArrayInputStream("d1".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		assertFalse(sut.input());
	}
	
	@Test
	public void input_shouldReturnFalse2()
	{
		inputStream=new ByteArrayInputStream("aa".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		assertFalse(sut.input());
	}
	
	@Test
	public void input_shouldReturnFalse3()
	{
		inputStream=new ByteArrayInputStream("1a".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		assertFalse(sut.input());
	}
	
	@Test
	public void input_shouldReturnTrue4()
	{
		inputStream=new ByteArrayInputStream("B1".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		assertTrue(sut.input());
	}
	
	@Test
	public void input_shouldReturnTrue5()
	{
		inputStream=new ByteArrayInputStream("C3".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		assertTrue(sut.input());
	}
	
	@Test
	public void input_shouldReturnFalse4()
	{
		inputStream=new ByteArrayInputStream("a0".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		assertFalse(sut.input());
	}
	
	@Test
	public void input_shouldReturnFalse5()
	{
		inputStream=new ByteArrayInputStream("a-1".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		assertFalse(sut.input());
	}
	
	@Test
	public void input_shouldReturnFalse6()
	{
		inputStream=new ByteArrayInputStream("\n".getBytes());  // did not work with ""
		sut=new view.ConsoleView(printStream, inputStream);
		assertFalse(sut.input());
	}	
	
	@Test
	public void input_shouldReturnFalse7()
	{
		inputStream=new ByteArrayInputStream("a".getBytes());  
		sut=new view.ConsoleView(printStream, inputStream);
		assertFalse(sut.input());
	}	
	
	@Test
	public void input_shouldReturnTrue6()
	{
		inputStream=new ByteArrayInputStream("a 1".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		assertTrue(sut.input());
	}
	
	@Test
	public void getHeap_shouldReturnAString1()
	{
		inputStream=new ByteArrayInputStream("a1".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		sut.input();  // forgot this
		String actual=sut.getHeap();
		String expected="a";
		assertEquals(actual, expected);
	}
	
	@Test
	public void getHeap_shouldReturnAString2()
	{
		inputStream=new ByteArrayInputStream("b4".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		sut.input();  // forgot this
		String actual=sut.getHeap();
		String expected="b";
		assertEquals(actual, expected);
	}
	
	@Test
	public void getHeap_shouldReturnAString3()
	{
		inputStream=new ByteArrayInputStream("C 1".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		sut.input();  // forgot this
		String actual=sut.getHeap();
		String expected="c";
		assertEquals(actual, expected);
	}

	@Test
	public void getHeap_shouldReturnANumber1()
	{
		inputStream=new ByteArrayInputStream("a1".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		sut.input();  // forgot this
		int actual=sut.getNumber();
		int expected=1;
		assertEquals(actual, expected);
	}
	
	@Test
	public void getHeap_shouldReturnANumber2()
	{
		inputStream=new ByteArrayInputStream("a3".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		sut.input();  // forgot this
		int actual=sut.getNumber();
		int expected=3;
		assertEquals(actual, expected);
	}
	
	@Test
	public void getHeap_shouldReturnANumber3()
	{
		inputStream=new ByteArrayInputStream("B 5".getBytes());
		sut=new view.ConsoleView(printStream, inputStream);
		sut.input();  // forgot this
		int actual=sut.getNumber();
		int expected=5;
		assertEquals(actual, expected);
	}
	
}
