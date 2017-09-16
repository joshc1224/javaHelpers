package inputs;

public class MyArrays {
	/**
	 * Returns the index of the lowest number in a double array. If lowest is a tie, returns the last instance of lowest
	 * @param input- double array to return smallest index
	 * @return- int index of lowest number/last occurrence if a tie.
	 */
	public static int findLowest(double[] input) {
		
		int pos = 0;
		double smallest=input[0];
		for (int i = 0;i<input.length;i++) {
			
			if (input[i]<smallest) {
				smallest = input[i];
				pos=i;
			}
		}
	return pos;
	}//end findLowest
	/**
	 * Returns the index of the highest number in a double array. If highest is a tie, returns the first instance of highest
	 * @param input- double array to return highest index
	 * @return- int index of highest number/first occurrence if a tie.
	 */
	
	public static int findHighest(double[] input) {
		
		int pos = 0;
		double highest=input[0];
		for (int i = 0;i<input.length;i++) {
			
			if (input[i]>highest) {
				highest = input[i];
				pos=i;
			}
		}
	return pos;
	}//end findLowest
	
	public static double[] removeAtIndex(double[] input, int indexToRemove) {
		
		double[] returnIndex= input;
		for (int i = indexToRemove+1;i<input.length;i++) {
			
			returnIndex[i-1]=returnIndex[i];
			
		}
		return returnIndex;
	}
	
}//end class


