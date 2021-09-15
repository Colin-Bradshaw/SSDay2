/*
* Author: Colin Bradshaw
*/
import java.math.BigDecimal;

public class AddValues{
	public static void main(String[] args){
		AddValues av = new AddValues();
		BigDecimal answer = new BigDecimal(0);
		for(String s: args){
			answer = answer.add(av.getNumericValue(s));
		}
		System.out.println("\nSum of valid numerical inputs is : " + answer.toString());
	}
	
	// BigDecimal is able to be constructed from a string, and is able to repreresent all values for numeric primitives
	public BigDecimal getNumericValue(String s){
		try{
			BigDecimal num = new BigDecimal(s);
			return num;
		} catch (NumberFormatException e){
			System.out.println("Invalid input: '" + s + "' will not be included in sum");
			return new BigDecimal(0);
		}
	}
}