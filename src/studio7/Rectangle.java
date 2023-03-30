package studio7;

import java.util.Scanner;

public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle (int initlength, int initwidth) {
		length = initlength;
		width = initwidth;
	}
	
	public int area() {
		return length * width;
	}
	
	public int perimeter() {
		return (2 * length) + (2 * width);
	}
	
	public int compare(Rectangle Rectangle1) {
		int area2 = this.area();
		int area1 = Rectangle1.area();
		if (area2 > area1) { // 1 is smaller
			return 1;
		}
		else if (area2 < area1) { // 2 is smaller
			return 2;
		}
		else if (area2 == area1){ //equal area
			return 3;
		}
		return 4;
		}

	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input a width:");
		int width = in.nextInt();
		System.out.println("Input a length:");
		int length = in.nextInt();
		Rectangle Rectangle1 = new Rectangle (length, width);
		System.out.println("The area is " + Rectangle1.area() + "!");
		System.out.println("The perimeter is " + Rectangle1.perimeter() + "!");
		
		System.out.println("Input a width:");
		width = in.nextInt();
		System.out.println("Input a length:");
		length = in.nextInt();
		Rectangle Rectangle2 = new Rectangle (length, width);
		System.out.println("The area is " + Rectangle2.area() + "!");
		System.out.println("The perimeter is " + Rectangle2.perimeter() + "!");
		System.out.println(Rectangle2.compare(Rectangle1));
	}
}
