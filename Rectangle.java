/*
* Author: Colin Bradshaw
*/
public class Rectangle implements Shape{
	Integer length, width;
	Rectangle(Integer len, Integer wid){
		length = len;
		width = wid;
	}
	
	public Double calculateArea(){
		return (length * width) / 1.0;
	}
}