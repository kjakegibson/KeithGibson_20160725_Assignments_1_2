package com.tiy.ptboat;

public class PTBoatGame {

	private static PTBoat[] boats = new PTBoat[6];
	private static int numberOfBoats = 0;

	public void addboat(int location) {
		boats[numberOfBoats] = new PTBoat(location);
		numberOfBoats++;
	}

	public boolean Guess(int location) {
		for (int i = 0; i < boats.length; i++)
		{
			if (boats[i].location == location) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args)

	{
		PTBoatGame game1 = new PTBoatGame();
		game1.addboat(4);
		
		if(game1.Guess(3))
		{
		System.out.println("Hit");
		}
		
		else
		{
			System.out.println("Miss");
		}
	}
}
