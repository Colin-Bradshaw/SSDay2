/*
* Author: Colin Bradshaw
*/
import java.util.Arrays;
import java.math.BigDecimal;
import java.lang.Math;
public class TwoDArray{
	public static void main(String[] args){
		if(args.length > 0){
			// take root of number of arguments and round up, use to make a square 2d array
			int dimensions = (int)Math.ceil(Math.pow(args.length, 0.5));
			BigDecimal[][] numArr =  new BigDecimal[dimensions][dimensions];
			// largePosition will hold the position of the largest number in the 2d array
			int[] largePosition =  new int[2];
			// counter to keep track of position in 2d array
			int pos = 0;
			BigDecimal answer = null;
			// for each entry in args, assign into 2d array if valid, in order or rows by columns
			for(String s: args){
				BigDecimal newNum = null;
				try {
					newNum = new BigDecimal(s);
				} catch (NumberFormatException e){
							System.out.println("Invalid input: '" + s + "' will not be included in array");
							continue;
				}
				int i = pos / dimensions;
				int j = pos % dimensions;
				pos++;
				// if input is a valid number,assign into 2D array while keeping track of largest number
				numArr[i][j] = newNum;
				if(answer == null){
					//assign value to answer on first run through
					answer = newNum;
					largePosition[0] = i;
					largePosition[1] = j;
				} else{
					// if answer is less than the newNumber, assign newNumber to answer
					if (answer == answer.min(newNum)){
						answer = newNum;
						largePosition[0] = i;
						largePosition[1] = j;
					} else {
						// otherwise do nothing
					}
				}
			}
			// print answer
			System.out.println("The largest number entered was: " + answer.toString());
			System.out.println("Its position in the array is: " + largePosition[0] + "," + largePosition[1]);
			for(int i = 0; i < dimensions; i++){
				System.out.println(Arrays.toString(numArr[i]));
			}
			//System.out.println(Arrays.deepToString(numArr));
		} else {
			System.out.println("Program requires command line arguments, enter at least one.");
		}
	}
}