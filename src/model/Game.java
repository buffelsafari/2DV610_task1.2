package model;

// Nim
// 2 spelare turas om att dra valfritt antal stickor ur en av 3 h�gar,
// den som drar den sista stickan vinner.

public class Game 
{
	private int heapA;
	// initierar dessa 3 h�gar med konstruktorn, negativa tal inte till�tna	
	public Game(int heapA, int heapB, int heapC)
	{
		this.heapA=heapA;
	}

	public int getHeapA()
	{
		return heapA;
	}
}
