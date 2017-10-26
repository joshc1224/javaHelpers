import java.util.*;

public class GameCounter {

	public static void main(String[] args) {
		
		String[] words= {"FLAMES", "HOPE", "CANDLE"};
		System.out.print("Please enter the number: ");
		int number=getAnInt();
		for(String x:words) {
			System.out.println(findLetter(x, number));
		}
	}
	
	private static char findLetter(String word, int number) {
		String check = word;
		while (check.length()<number) {
			check+=word;
			System.out.println(check);
		}
		if(number>0) {
			return check.charAt(number-1);
		}else {
			return check.charAt(number);
		}
		
	}
	
	public static int getAnInt() {
			
			Scanner sc = new Scanner(System.in);
			int a=0;
			boolean choosing = true;
			//System.out.println("...");
			while (choosing) {
				
				if(sc.hasNextInt()) {
					a=sc.nextInt();
					choosing = false;
				}else {
					System.out.print("Please enter an integer: ");
					sc.next();
				}
			}return a;
		}
}
