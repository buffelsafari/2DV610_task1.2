import static org.junit.Assert.*;

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

}
