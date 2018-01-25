package qNapWalkthrough;
import javax.swing.*;
import java.io.*;

public class CheckExtHD {
	
	private final String TITLE = "TOIE-Ware";
	//public static void main(String[] args) {
	//	CheckExtHD first = new CheckExtHD();
	//	first.run();
	//}
	public CheckExtHD(String fLoc) {
		this.run(fLoc);
	}

	private void run(String fLoc) {
		this.OpenWindow();
		File file = new File(fLoc);
		if (file.exists()) {
			//System.out.println("Its here");
			this.successWindow();
			//System.exit(-1);
			System.out.println(file.isDirectory());
			System.out.println(file.getUsableSpace()/1024/1024);
				
		}else {this.failWindow();}//System.out.println("Its Not");}
	}
		
	private void OpenWindow() {
		String message = "Please ensure the hard drive\n"
						+ "is firmly seated in the white\n"
						+ "Hard Drive Dock(toaster)\n"
						+ "and the power is on.\n"
						+ "**********************************\n"
						+ "Allow approximately one minute \n"
						+ "before continuing with this program";
		JOptionPane.showMessageDialog(null, message, TITLE, 2);
	}
	
	private void successWindow() {
		//final ImageIcon icon = new ImageIcon("/home/pi/Pictures/thumbs-up-smiley-hi.png");
		final ImageIcon icon = new ImageIcon("C:\\Users\\j\\Desktop\\HDCHECKER\\thumbs-up-smiley-hi.png");
		JOptionPane.showMessageDialog(null, "<html><span style='font-size:4em'>Your Hard Drive is loaded correctly", TITLE, JOptionPane.INFORMATION_MESSAGE, icon);
	}
	private void failWindow() {
		String message = "<html><span style='font-size:2em'>Your hard drive has failed to load.\n"
						+ "Please complete the following steps:\n"
						+ "1. Turn off the white hard drive dock(toaster)\n"
						+ "2. Remove the hard drive\n"
						+ "3. Re-seat the hard drive and push down firmly\n"
						+ "4. Turn on the white hard drive dock\n"
						+ "5. Pay close attention to the light at the bottom\n"
						+ "   it should flash twice, wait a few seconds, then\n"
						+ "   flash again.  (It may flash more than once)\n"
						+ "6. Exit this window, and run the program again.\n"
						+ "*************************************************************************\n"
						+ "IF YOU HAVE SEEN THIS MESSAGE MORE THAN ONCE CONTACT \n"
						+ "JOSH AT 253-330-0023.";
		//final ImageIcon icon = new ImageIcon("/home/pi/Pictures/th.jpg");
		final ImageIcon icon = new ImageIcon("C:\\Users\\j\\Desktop\\HDCHECKER\\th.jpg");
		JOptionPane.showMessageDialog(null, message, TITLE, JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
}
