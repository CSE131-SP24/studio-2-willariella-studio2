package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input starting amount of money:");
		double startAmount = in.nextDouble();
		System.out.println("Input win chance:");
		double winChance = in.nextDouble();
		System.out.println("Input your win limit:");
		double winLimit = in.nextDouble();
		int totalSimulation = 0;
		while (startAmount < winLimit && startAmount > 0)
		{
			double randomNumber = Math.random();
			if (randomNumber <= winChance)
		{
			System.out.println("You gained $1");
			startAmount++;
			System.out.println("Current Amount:" + startAmount);
			totalSimulation++;
		}
		else
		{
			System.out.println("You lost $1");
			startAmount--;
			System.out.println("Current Amount:" + startAmount);
			totalSimulation++;
		}
		}
		if (startAmount == winLimit)
		{
			System.out.println("This day ended in a success.");
		}
		else
		{
			System.out.println("This day is a ruin.");
		}
		System.out.println("Total number of simulation: " + totalSimulation);
	}

}
