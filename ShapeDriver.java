/*
* Author: Colin Bradshaw
*/
import java.util.Scanner;

// simple driver for shapes, not particularly robust, no error checking
public class ShapeDriver{
	public static void main(String[] args){
		ShapeDriver sd = new ShapeDriver();
		Scanner input = new Scanner(System.in);
		String[] sides;
		
		System.out.print("Enter the length and width for a rectangle in integer values, seperated by a space: ");
		sides = input.nextLine().split(" ");
		Rectangle rect = new Rectangle(Integer.parseInt(sides[0]), Integer.parseInt(sides[1]));
		rect.display();
		
		System.out.print("Enter the diameter of a circle as an integer, seperated by a space: ");
		sides = input.nextLine().split(" ");
		Circle circ = new Circle(Integer.parseInt(sides[0]));
		circ.display();
		
		System.out.print("Enter the three sides of a triangle as integers, seperated by a space: ");
		sides = input.nextLine().split(" ");
		Triangle tri = new Triangle(Integer.parseInt(sides[0]), Integer.parseInt(sides[1]), Integer.parseInt(sides[2]));
		tri.display();
	}
}