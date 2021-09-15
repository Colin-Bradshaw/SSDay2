/*
* Author: Colin Bradshaw
*/
public interface Shape{
	public Double calculateArea();
	
	default void display(){
		System.out.println("The area of this shape is " + calculateArea());
	}
}