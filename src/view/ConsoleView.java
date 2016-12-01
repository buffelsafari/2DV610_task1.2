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
	
	// should show a welcome message and instructions
	public void showWelcomeMessage()
	{
		out.println("Welcome to Dr. Nim's strategy game.\n"
				+"Pick any number of sticks from one of the heaps.\n"
				+"The player who picks the last stick win.\n"
				+"type a1 to remove 1 stick from heap A...\n");
	}
	
	// should show a bye message
	public void showEndMessage()
	{
		out.println("Thank you for playing.");
	}
	
	// should show information about the heaps
	public void showHeaps(int a, int b, int c) 
	{
		out.println("heaps\tA\tB\tC\n     \t"+a+"\t"+b+"\t"+c);		
	}
	
	// should show a win message
	public void showYouWin()
	{
		out.println("You win!");		
	}
	
	// should show a lose message
	public void showYouLose() 
	{
		out.println("You lose!");		
	}
	
	// should show info about the computer move
	public void showComputerMove(String heap, int n)
	{
				
	}
}
