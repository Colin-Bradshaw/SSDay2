/*
* Author: Colin Bradshaw
*/
public class Triangle implements Shape{
	Integer sideA, sideB, sideC;
	
	Triangle(Integer a, Integer b, Integer c){
		sideA = a;
		sideB = b;
		sideC = c;
	}
	
	public Double calculateArea(){
		Double s = (sideA+sideB+sideC) / 2.0;
				// Heron's formula
		return Math.pow((s*(s-sideA)*(s-sideB)*(s-sideC)), 0.5);
	}
}