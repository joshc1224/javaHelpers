package inputs;

import java.util.*;

public class ArraysTester {
	
	public static void main(String[] args) {
		int count =7;
		double[] myArray = {4, 2, 3, 1, 5, 6, 7};
		double[] newArray = MyArrays.removeAtIndex(myArray, MyArrays.findHighest(myArray));
		count --;
		newArray=Arrays.copyOf(newArray, count);
		System.out.println(Arrays.toString(newArray));
		
	}

}
