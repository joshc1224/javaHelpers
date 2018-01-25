package dvr;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class View implements ActionListener{

	ArrayList<JLabel> labels = new ArrayList<>();
	ArrayList<JButton> buttons = new ArrayList<>();
	public View() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.setLocationRelativeTo(null);
		JPanel main = new JPanel();
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		
		String instructions = "These are the instructions for this window. ";
		String instructions2 = "Make a selection from the buttons below";
		
		JPanel Instructions = new JPanel();
		labels.add(new JLabel(instructions));
		labels.add(new JLabel(instructions2));
		Instructions.add(labels.get(0));
		Instructions.add(labels.get(1));
		
		
		JPanel buttPanel = new JPanel();
		buttPanel.setLayout(new GridLayout(3,2));
		
		buttons.add(new JButton("Dir Window"));
		buttons.add(new JButton("2"));
		buttons.add(new JButton("3"));
		buttons.add(new JButton("4"));
		buttons.add(new JButton("5"));
		buttons.add(new JButton("6"));
		
		for(JButton x:buttons) {
			x.addActionListener(this);
			buttPanel.add(x);
		}
		
		main.add(Instructions);
		main.add(buttPanel);
		frame.add(main);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		
		switch (e.getActionCommand()){
		case "Dir Window":
			DirWindow dir = new DirWindow();
			//System.out.println(getClass().getResource("/resources/hello_world.bat"));
		}
	}
}
