package inputs;

public class Strings {

	/**
	 * Replaces a character at a given index with a specified String
	 * @param orig is original String
	 * @param index is at index to remove character
	 * @param replaceWith the String to replace the character with
	 * @return Original String with new String replacing character at supplied index
	 * if index is out of bounds the original String will be returned.
	 */
	public static String replaceAtIndex(String orig, int index, String replaceWith) {
		
		if (index<orig.length()&&index>=0) {
			String output = orig.substring(0,index)+replaceWith+orig.substring(index+1);
			return output;
		}else {return orig;}	
	}
	/**
	 * Finds the nth occurence of a character in a String
	 * @param str String to be parsed
	 * @param ch character to be parsed for must be lower case
	 * @param n nth number to report
	 * @return int--the index of the nth character in the string or -1 if n exceeds the
	 * number of character instances in the String or if n is 0.
	 */
	
	public static int findOccurence(String str, char ch, int n) {
		int pos=0, count=0;
		String lowStr = str.toLowerCase();
		for (int i=0;i<str.length();i++) {
			if (lowStr.charAt(i)==ch) {
				count ++;
				if (count==n&&n>0) {
					pos=i;
				}
			}
		}
		if (count<n||n<=0) {
			return -1;
		}else {
			return pos;
		}
	}
	
	
	/**
	 * Takes a String and replaces every instance of a character in it with another String
	 * @param original String- The original String to be altered.
	 * @param toBeReplaced char- The char to replace in the String must be lower case
	 * @param toReplaceWith String- the String to replace the char with
	 * @return A string with each char of the entered type replaced by the String
	 * depends on findOccurence and replaceAtIndex methods from Strings package
	 */
	public static String searchAndReplace(String original, char toBeReplaced, String toReplaceWith ) {
		
		String replaced=original;
		for (int i=0;i<original.length();i++) {
			
			int output = Strings.findOccurence(original, toBeReplaced, i);
			if (output!=-1) {
				replaced = Strings.replaceAtIndex(replaced, output, toReplaceWith);
			}
		}
		return replaced;
	}
	public static String reverseString(String input) {
		
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			output += input.charAt(i);
		}
		return output;
	}
}//class
