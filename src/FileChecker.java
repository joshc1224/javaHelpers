import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;



public class FileChecker {

	public static void main(String[] args) {
		
		File folder = new File("C:\\Users\\j\\eclipse-workspace\\workCode\\sounds");
		
		File[] listOfFiles = folder.listFiles();
		
		for(int i=0;i<listOfFiles.length;i++) {
			if(listOfFiles[i].isFile()) {
				System.out.println("IN");
				File f = new File("C:\\Users\\j\\eclipse-workspace\\workCode\\sounds\\"+listOfFiles[i].getName());
				
				f.renameTo(new File("C:\\Users\\j\\eclipse-workspace\\workCode\\sounds\\out\\"+i+".wav"));
			}
		}
	
	System.out.println("DONZO");
	}
	
	
}
