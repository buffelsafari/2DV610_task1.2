package view;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleView 
{
	private PrintStream out;
	private Scanner scanner;
	String heapInput;
	
	// should display stuff on the console and get inputs from keyboard
	public ConsoleView(PrintStream out, InputStream in)
	{
		this.out=out;
		scanner=new Scanner(in);
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
		out.println("\nDr. Nim removed "+n+" sticks from heap "+heap.toUpperCase());			
	}
	
	// should show info about the human move
	public void showYouMove(String heap, int n) 
	{
		out.println("You removed "+n+" sticks from heap "+heap.toUpperCase());		
	}
	
	// take a input from the keyboard, should return true if input is valid
	// the heap string and the num int should be available to read from separate methods after 
	public boolean input() 
	{
		String str=scanner.nextLine();
		if(str.length()<2)
		{
			return false;
		}
		
		heapInput=str.substring(0, 1).toLowerCase();
		if(!(heapInput.equals("a") || heapInput.equals("b") || heapInput.equals("c")))
		{
			return false;
		}		
		
		String num=str.substring(1).trim();
		
		int i=-1;
		try
		{
			i = Integer.parseInt(num);
		}
		catch (NumberFormatException e) 
		{
			return false;
		}
		
		if(i<1)
		{
			return false;
		}		
		
		return true;		
		
	}
	
	// should return a string with the heap choosen in input 'a' || 'b' || 'c'
	public String getHeap() 
	{
		return heapInput;
	}
}
