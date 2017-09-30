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
	
	/**
	 * find the smallest number in an array after the index supplied as minPos
	 * @param arr array to locate smallest number in
	 * @param minPos index to begin searching at
	 * @return index of smallest element of the array
	 */
	public static int minPos(int[] arr, int minPos) {
		int smallest=arr[minPos];
		int lowIndex=minPos;
		for (int i = minPos;i<arr.length;i++) {
			if (arr[i]<smallest) {
				smallest=arr[i];
				lowIndex=i;
			}
		}
		return lowIndex;
	}
	/**
	 * swap two elements of an array
	 * @param arr array to swap elements in
	 * @param to index to place from at
	 * @param from index to place to at
	 */
	public static void swap(int[] arr, int to, int from) {
		int temp = arr[to];
		arr[to]=arr[from];
		arr[from]=temp;
	}
	/**
	 * sort an array in ascending order
	 * @param args array to be sorted
	 */
	public static void sort(int[] args) {

		for (int i=0;i<args.length;i++) {
			swap(args, i, minPos(args, i));
		}
		//System.out.println(Arrays.toString(test));
	}
	/**
	 * create an array of random integers
	 * @param size size of the array
	 * @param lowerLimit lowest integer to place in the array
	 * @param upperLimit highest integer to place in the array
	 * @return
	 */
	public static int[] randomArray(int size, int lowerLimit, int upperLimit) {
		
		int [] randos=new int[size];
		for (int i=0;i<randos.length;i++) {
			randos[i]=(int)(Math.random()*(upperLimit-lowerLimit));
		}
		return randos;
	}
	
}//end class


