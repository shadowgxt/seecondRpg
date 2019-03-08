package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooseName extends JFrame {
	String newHeroName;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseName frame = new ChooseName();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChooseName() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		
		
		JButton btnChangeName = new JButton("CHANGE NAME");
		btnChangeName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rpg.Character.setHeroName(newHeroName);
				System.out.println(textField.getText());
				WhichHeroClaass.main();
				dispose();
				
			}
		});
		contentPane.setLayout(null);
		btnChangeName.setBounds(565, 335, 150, 50);
		contentPane.add(btnChangeName);
		
		textField = new JTextField();
		textField.setBounds(569, 272, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
