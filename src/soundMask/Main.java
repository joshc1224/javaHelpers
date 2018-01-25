package soundMask;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class Main {

	public void run(double iterations) {
		//instantiate a file object to point to the location of the sounds
		File f = new File("C:\\Users\\j\\eclipse-workspace\\workCode\\voices");
		
		//grab every file in the directory and put it in the fileList
		ArrayList<File> filesList = new ArrayList<File>(Arrays.asList(f.listFiles()));
		
		//uncomment below to preview the files in the list
		/*int counter =0;//counter used for testing only
		for(File x:filesList) {
			System.out.println(counter+" "+x);
			counter++;
		}*/
		for (int i=0;i<iterations+1;i++) {
			Sounder2.sounder(filesList);
		}	
	}//end run()
	
	public void start(double iterations) {
		this.run(iterations);
	}	
}//end class()
