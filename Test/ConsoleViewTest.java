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
	
	@Before
	public void setup()
	{
		printStream=Mockito.mock(PrintStream.class);
		inputStream=Mockito.mock(InputStream.class);		
		sut=new view.ConsoleView(printStream, inputStream);
	}
	
	
	@Test
	public void test() 
	{
		sut.showWelcomeMessage();		
		Mockito.verify(printStream).println(welcomeString);
		
	}

}
