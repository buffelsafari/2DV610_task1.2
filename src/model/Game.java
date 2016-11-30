package model;

// Nim
// 2 spelare turas om att dra valfritt antal stickor ur en av 3 högar,
// den som drar den sista stickan vinner.

public class Game 
{
	private int heapA;
	private int heapB;
	private int heapC;
		
	public Game(int heapA, int heapB, int heapC)
	{
		// negative numbers not allowed
		if(heapA<0 || heapB<0)
		{
			throw new IllegalArgumentException();
		}
						
		this.heapA=heapA;
		this.heapB=heapB;
		this.heapC=heapC;
	}

	public int getHeapA()
	{
		return heapA;
	}
	
	public int getHeapB()
	{
		return heapB;
	}
	
	public int getHeapC()
	{
		return heapC;
	}
}
