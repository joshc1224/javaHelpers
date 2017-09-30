package inputs;

public class TestEmp {

	
	public static void main(String[] args) {
		
		//System.out.println(Strings.reverseString("poop"));
		
		String input="poop", output="";
		
		if(input.equals(Strings.reverseString(input))) {
			System.out.println("This is a palindrome.");
		}else {
			System.out.println("It's not.");
		}
		
	}
}
