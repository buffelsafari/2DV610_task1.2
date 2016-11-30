package view;

import java.io.InputStream;
import java.io.PrintStream;


public class ConsoleView 
{
	PrintStream out;
	// should display stuff on the console and get inputs from keyboard
	public ConsoleView(PrintStream out, InputStream in)
	{
		this.out=out;
	}
	
	// should show a welcomemessage and instructions
	public void showWelcomeMessage()
	{
		out.println("Welcome to Dr. Nim's strategy game.\n"
				+"Pick any number of sticks from one of the heaps.\n"
				+"The player who picks the last stick win.\n"
				+"type a1 to remove 1 stick from heap A...\n");
	}
}
