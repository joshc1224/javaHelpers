package inputs;
import java.util.*;
/**
 * A program to take 10 lines of input as Strings, determine which lines begin and end with a vowel,
 * then return an array with only those lines.
 * @author j
 *
 */
public class ArrayForVowels {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] names = new String[10];
		int count=0;
		
		while(count<names.length) {
			System.out.print("Enter a name:");
			names[count]=sc.nextLine();
			count ++;
			int remaining = names.length-count;
			System.out.println("You have "+remaining+" names left to enter.");
		}
		sc.close();
		int[] positions = findVowelNames(names);
		String[] vowelNames = finalizeArray(names, positions);
		System.out.println("The names in your list that contain vowels are: "+Arrays.toString(vowelNames));
		
		//end while
		/*String[] names = {"Joe", "John", "ada", "Ada"};
		int[] positions = findVowelNames(names);
		String[] vowelNames= finalizeArray(names, positions);
		System.out.println(Arrays.toString(vowelNames));
		*/
		
	}//end main
	/**
	 * takes a String array and returns the index(s) if any of words that begin and end with a vowel
	 * @param input String array to be parsed
	 * @return int array with index of words that begin and end with a vowel
	 */
	public static int[] findVowelNames(String[] input) {
		
		int count =0;
		int[] positions = new int[10];
		String vowels = "aeiouyAEIOUY";
		
		
		for(int i = 0; i<input.length; i++) {
			
			int length = input[i].length()-1;
			char b = input[i].charAt(0);
			char e = input[i].charAt(length);
			
			for (int j = 0;j<vowels.length();j++) {
				
				if (b==vowels.charAt(j)) {
					
					for (int k =0; k<vowels.length();k++) {
						
						if (e==vowels.charAt(k)) {
							positions[count]=i;
							count++;
						}
					}
				}
			}
		}
		positions=Arrays.copyOf(positions, count);
		return positions;
	}
	/**
	 * takes a String array and an int array of positions inside the array to extract elements and  place in another array, returns the third array
	 * @param input String array to copy elements from 
	 * @param positions int array of indexes to copy
	 * @return String array with elements of the string array copied from indexes at the int array
	 */
	public static String[] finalizeArray(String[] input, int[] positions) {
		
		String[] finalArray = new String[positions.length];
		int count=0;
		for(int pos : positions) {
			finalArray[count]=input[pos];
			count++;
		}
		return finalArray;
	}
}
