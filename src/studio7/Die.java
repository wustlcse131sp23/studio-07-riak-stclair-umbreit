package studio7;

import java.util.Scanner;

public class Die {

	private int numSides;

	public Die (int initnumSides) {
		numSides = initnumSides;
	}

	public int Roll() {
		return (int) (Math.random() * numSides + 1);
	}
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("How many sides?");
	int n = in.nextInt();
	Die Die2 = new Die(n);
	System.out.println("You rolled a " + Die2.Roll() + "! lol");
	}
}