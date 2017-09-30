package inputs;

import java.util.Scanner;

public class ValidateInt {
	/**
	 * validate integer input and continue to ask until you get one.
	 * @return
	 */
	public static int getAnInt() {
		
		Scanner sc = new Scanner(System.in);
		int a=0;
		boolean choosing = true;
		System.out.println("...");
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