package qNapWalkthrough;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Main{

	public static void main(String[] args) {
		Main main = new Main(); 
		main.run();		
	}
	
	private void run() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("TOIE-Wizard");
		frame.setResizable(false);
		
		JPanel choices = panelOne();
		
		JPanel wizard = new JPanel();
		Icon icon = new ImageIcon("wizard-010.gif");
		JLabel wiz = new JLabel(icon);
		wizard.add(wiz);
		
		JPanel main = new JPanel();
		main.setBackground(Color.BLACK);
		main.setLayout(new BorderLayout());
		main.add(wizard, BorderLayout.CENTER);
		main.add(choices, BorderLayout.SOUTH);
		
		frame.add(main);
		frame.setVisible(true);
	}
	private JPanel panelOne() {
		JPanel one = new JPanel();
		String[] choices = {"Start a video download", "Recover Audio","Exit"};
		JList<String> list = new JList(choices);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBackground(Color.green);
		list.setSelectedIndex(1);
		
		JPanel instruction = new JPanel();
		instruction.setLayout(new GridLayout(2,1));
		JLabel instruct = new JLabel("Make a choice");
		JLabel instruct2 = new JLabel("Click Go to start");
		instruction.add(instruct);
		instruction.add(instruct2);
		
		JPanel buttonPan = new JPanel();
		JButton go = new JButton("Go");
		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent pEvent) {
				if (list.getSelectedValue().equals("Start a video download")) {
					System.out.println("VIDS");
				}else if (list.getSelectedValue().equals("Recover Audio")) {
					AudioPull top = new AudioPull();
				}else if(list.getSelectedValue().equals("Exit")) {
					System.exit(-1);
				}
			}
		});
		buttonPan.add(go);
		
		one.add(instruction);
		one.add(list);
		one.add(buttonPan);
		return one;
	}
	
	private static void audioPull() {
		System.out.println("AUDIO");
	}
	
}
