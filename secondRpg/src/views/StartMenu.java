package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import rpg.Character;
import rpg.SaveLoad;

import java.awt.Color;
import java.awt.Font;

public class StartMenu extends JFrame{

	private JPanel contentPane;
	private JFrame frmMenusTart;
	private JTextField txtChooseOption;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartMenu frame = new StartMenu();
					frame.frmMenusTart.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public StartMenu() {
		frmMenusTart = new JFrame();
		frmMenusTart.setTitle("Menu Start");
		frmMenusTart.setBounds(100, 100, 1280, 720);
		frmMenusTart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenusTart.getContentPane().setLayout(null);
		
		txtChooseOption = new JTextField();
		txtChooseOption.setBackground(Color.GRAY);
		txtChooseOption.setFont(new Font("Times New Roman", Font.BOLD, 29));
		txtChooseOption.setForeground(Color.BLUE);
		txtChooseOption.setHorizontalAlignment(SwingConstants.CENTER);
		txtChooseOption.setText("Choose option");
		txtChooseOption.setBounds(390, 100, 500, 60);
		frmMenusTart.getContentPane().add(txtChooseOption);
		txtChooseOption.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New Game");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Old English Text MT", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Character.setHeroName();
				frmMenusTart.dispose();
			}

		});
		btnNewButton_1.setBounds(515, 250, 250, 60);
		frmMenusTart.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Load Game");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Old English Text MT", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rpg.SaveLoad.load();
				//otwarcie g³ownego menu
				frmMenusTart.dispose();
			}
		});
		btnNewButton.setBounds(515, 400, 250, 60);
		frmMenusTart.getContentPane().add(btnNewButton);
		
		
	}
}
