package dvr;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DirWindow {
	
	ArrayList<JLabel> labels = new ArrayList<>();
	
	public DirWindow() {
	JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame frame = new JFrame();
	frame.setSize(500,500);
	frame.setLocationRelativeTo(null);
	//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	ExecuteShellCommand com = new ExecuteShellCommand();
	ArrayList<String> input = com.Execute(DirWindow.class.getResource("hello_world.bat").toString().substring(6));
	
	JPanel main = new JPanel();
	JScrollPane scroller = new JScrollPane(main);
	main.setAutoscrolls(true);
	main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
	main.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	for(String x:input) {
		System.out.println(x);
	}
	String labeler ="";
	for (String x:input) {
		labels.add(new JLabel(x));
	}
	
	for (JLabel x:labels) {
		main.add(x);
		
	}
	frame.add(scroller);
	frame.setVisible(true);
	
	}
}
