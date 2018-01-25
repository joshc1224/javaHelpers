package soundMask;

import java.awt.event.*;
import javax.swing.*;

public class View implements ActionListener{

	private Main main = new Main();
	private JButton startButton, stopButton;
	private JTextField textF;
	private JLabel iterations, boxLabel;
	public View() {
		
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 100);
		frame.setLocationRelativeTo(null);
		
		JPanel text = new JPanel();
		textF = new JTextField(5);
		text.add(textF);
		
		JPanel button = new JPanel();
		startButton = new JButton("Start");
		startButton.addActionListener(this);
		
		stopButton = new JButton("Stop");
		stopButton.addActionListener(this);
		
		button.add(startButton);
		button.add(stopButton);
		
		boxLabel = new JLabel("Enter the time in Minutes to Run: ");
		iterations = new JLabel("");
		JPanel main = new JPanel();
		main.add(boxLabel);
		main.add(textF);
		main.add(button);
		main.add(iterations);
		
		frame.add(main);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String temp = event.getActionCommand();
		if(temp.equals("Start")) {
			String temps = textF.getText();
			double nums = Double.parseDouble(temps);
			main.start(nums*60);
		}
		if(temp.equals("Stop")) {
			//main.stop();
		}
		
	}
	
	
}
