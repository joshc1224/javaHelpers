package inputs;

public class numToStrDriver {
	
	public static void main(String[] args) {
		boolean running = true;
		String output = "";
		do {
			System.out.println("Enter an integer and I will spell it out: ");
			int input = ReadInts.getAnInt();
			output = ReadInts.numToStr(input);
			if (!output.equals("-1"))
				running = false;
			else
				System.out.println("ERROR! Out of bounds");
		}while (running);
	System.out.println(output);	
	}

}
