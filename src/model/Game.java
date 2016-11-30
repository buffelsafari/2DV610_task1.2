package model;

// Nim
// 2 spelare turas om att dra valfritt antal stickor ur en av 3 högar,
// den som drar den sista stickan vinner.

public class Game 
{
	private int heapA;
	// initierar dessa 3 högar med konstruktorn, negativa tal inte tillåtna	
	public Game(int heapA, int heapB, int heapC)
	{
		this.heapA=heapA;
	}

	public int getHeapA()
	{
		return heapA;
	}
}
