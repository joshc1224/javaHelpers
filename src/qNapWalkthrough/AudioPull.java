package qNapWalkthrough;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
public class AudioPull {

	private String fileLoc = "";
	
	public AudioPull() {
		this.run();
	}
	
	private void run() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setTitle("TOIE-Wizard");
		frame.setResizable(false);
		
		JPanel instruct = new JPanel();
		JLabel instructions = new JLabel("Choose the hard drive to validate:");
		
		
		
		String[] choices = {"Linux Default USB", "Windows Default C:", "Other"};
		JList<String> list = new JList(choices);
		list.setBackground(Color.green);
		list.setAlignmentX(0.5f);
		
		
		JButton go = new JButton("Go");
		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent pEvent) {
				checkChoice(list.getSelectedIndex());
			}
		});
		
		instruct.add(instructions);
		instruct.add(list);
		instruct.add(go);
		
		JPanel wizard = new JPanel();
		Icon icon = new ImageIcon("HD.png");
		JLabel wiz = new JLabel(icon);
		wizard.add(wiz);
		
		frame.setLayout(new BorderLayout());
		frame.add(instruct, BorderLayout.SOUTH);
		frame.add(wizard);
		frame.setVisible(true);
	}
	
	public void checkChoice(int choice) {
		switch (choice) {
		case 0:
			CheckExtHD go = new CheckExtHD("/media/pi/UNTITLED");
			break;
		case 1:
			CheckExtHD go2 = new CheckExtHD("C:\\");
			break;
		case 2:
			String test = JOptionPane.showInputDialog("Enter the absolute path to the hard drive.");
			CheckExtHD go3 = new CheckExtHD(test);
		
		}
	}
	
}
