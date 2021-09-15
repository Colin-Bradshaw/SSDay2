/*
* Author: Colin Bradshaw
*/
public class Circle implements Shape{
	Integer diameter;
	Circle(Integer diam){
		diameter = diam;
	}
	
	public Double calculateArea(){
		return Math.PI * diameter;
	}
}