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
		if(heapA<0 || heapB<0 || heapC<0)
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
	
	// should be true if all heaps are empty
	public boolean isGameOver()
	{
		if(heapA==0 && heapB==0 && heapC==0)
		{
			return true;
		}
		return false;
	}
	
	// should remove num sticks from heap, where num is a positive int bigger then 0
	// and less or equal to the heapSize
	// heap argument can be 'a' or 'b' or 'c'
	// returns true if a valid remove is made
	// returns false if invalid remove, and the heaps remain unchanged
	public boolean remove(String heap, int num)
	{
		if(heap.equals("a") && num<=heapA)
		{
			heapA-=num;
			return true;
		}
		
		if(heap.equals("b") && num<=heapB)
		{
			heapB-=num;
			return true;
		}
		
		if(heap.equals("c") && num<=heapC)
		{
			heapC-=num;
			return true;
		}
		
		return false;
	}
}
