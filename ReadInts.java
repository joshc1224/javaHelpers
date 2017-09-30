package inputs;
import java.util.Scanner;
/**
 * class for reading ints
 * @author j
 *
 */
public class ReadInts {
	/**
	 * validate integer input and continue to ask until you get one.
	 * @return
	 */
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
	/**
	 * Given and integer between -9999 and 9999 returns that number spelled out
	 * @param input- integer to be converted
	 * @return String- number spelled out or a String("-1") if number is out of bounds
	 */
	public static String numToStr(int input) {
		String result="";
		int cutter = input;
		if (cutter<0) {
			result = result +"Negative";
			cutter = Math.abs(cutter);
		}
		if (input>9999||input<-9999) {
			return "-1";
		}
		if (cutter>=1000) {
			int temp=0;
			temp=cutter/1000;
			
			switch (temp) {
			
			case 1:
				result = result +"One Thousand ";
				break;
			case 2:
				result = result +"Two Thousand ";
				break;
			case 3:
				result = result +"Three Thousand ";
				break;
			case 4:
				result = result +"Four Thousand ";
				break;
			case 5:
				result = result +"Five Thousand ";
				break;
			case 6:
				result = result +"Six Thousand ";
				break;
			case 7:
				result = result +"Seven Thousand ";
				break;
			case 8:
				result = result +"Eight Thousand ";
				break;
			case 9:
				result = result +"Nine Thousand ";
				break;
			default:
				System.out.println("This shouldn't happen thousands");
				break;
			
			}//end switch
		cutter = cutter-temp*1000;
		//System.out.println(cutter);
		//return result;			
		}//end if>1k
		
		if (cutter>=100) {
			int temp=0;
			temp=cutter/100;
			
			switch (temp) {
			
			case 1:
				result = result + "One Hundred ";
				break;
			case 2:
				result = result + "Two Hundred ";
				break;
			case 3:
				result = result + "Three Hundred ";
				break;
			case 4:
				result = result + "Four Hundred ";
				break;
			case 5:
				result = result + "Five Hundred ";
				break;
			case 6:
				result = result + "Six Hundred ";
				break;
			case 7:
				result = result + "Seven Hundred ";
				break;
			case 8:
				result = result + "Eight Hundred ";
				break;
			case 9:
				result = result + "Nine Hundred ";
				break;
			default:
				System.out.println("This shouldn't happen hundreds");
				break;
			
			}//end switch
		cutter = cutter-temp*100;
		
		}//end hundreds
		if (cutter>=20) {
			int temp=0;
			temp=cutter/10;

			switch (temp) {
			
			case 1:
				result = result + " There should be no ones in this case";
				break;
			case 2:
				result = result + "Twenty ";
				break;
			case 3:
				result = result + "Thirty ";
				break;
			case 4:
				result = result + "Fourty ";
				break;
			case 5:
				result = result + "Fifty ";
				break;
			case 6:
				result = result + "Sixty ";
				break;
			case 7:
				result = result + "Seventy ";
				break;
			case 8:
				result = result + "Eighty ";
				break;
			case 9:
				result = result + "Ninety ";
				break;
			default:
				System.out.println("This shouldn't happen tens");
				break;
			
			}//end switch
		cutter = cutter-temp*10;
		
		}//end tens above twenty
		
		if (cutter>=10) {
			int temp=0;
			temp=cutter;

			switch (temp) {
			
			case 10:
				result = result + "Ten ";
				break;
			case 11:
				result = result + "Eleven ";
				break;
			case 12:
				result = result + "Twelve ";
				break;
			case 13:
				result = result + "Thirteen ";
				break;
			case 14:
				result = result + "Fourteen ";
				break;
			case 15:
				result = result + "Fifteen ";
				break;
			case 16:
				result = result + "Sixteen ";
				break;
			case 17:
				result = result + "Seventeen ";
				break;
			case 18:
				result = result + "Eighteen ";
				break;
			case 19:
				result = result + "Nineteen ";
			default:
				System.out.println("This shouldn't happen tens");
				break;
			
			}//end switch
		cutter = cutter-temp;
		}//end teens
		
		if (cutter>=1) {
			int temp=0;
			temp=cutter;

			switch (temp) {
			
			case 1:
				result = result + "One ";
				break;
			case 2:
				result = result + "Two ";
				break;
			case 3:
				result = result + "Three ";
				break;
			case 4:
				result = result + "Four ";
				break;
			case 5:
				result = result + "Five ";
				break;
			case 6:
				result = result + "Six ";
				break;
			case 7:
				result = result + "Seven ";
				break;
			case 8:
				result = result + "Eight ";
				break;
			case 9:
				result = result + "Nine ";
				break;
			default:
				System.out.println("This shouldn't happen tens");
				break;
			}//end switch
		cutter = cutter-temp;
		}//end teens
		
	//System.out.println(cutter);
	return result;	
	}//end method
	public static boolean isLeapYear(int year) {
		if (year%4==0&&year<=1582) {//if prior to 1582, every year divisible by 4 was a leap year without exception
			
			return true;
		}else if (year%4==0&&year>1582) {//if after 1582 most years divisible by 4 are a leap year with the following exceptions
			if (year%400==0) {//if they are divisible by 400 they are a leap year
				
				return true;
			}else if (year%100==0) {//if they are not divisible by 400, but are divisible by 100 they are not a leap year
				
				return false;
			}else {//other wise they are divisible by four and are a leap year
				
				return true;
			}
		}else {//if not divisible by four, add a question asked, and return false
			
			return false;
		}
	}//end leapYear
	
public static double getADouble() {
		
		Scanner sc = new Scanner(System.in);
		double a=0;
		boolean choosing = true;
		//System.out.println("...");
		while (choosing) {
			
			if(sc.hasNextDouble()) {
				a=sc.nextDouble();
				choosing = false;
			}else {
				System.out.print("Please enter a double value: ");
				sc.next();
			}
		}return a;
	}//end get a double
}//end class	
	
