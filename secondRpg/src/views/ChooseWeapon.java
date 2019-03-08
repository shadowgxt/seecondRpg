package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooseWeapon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseWeapon frame = new ChooseWeapon();
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
	public ChooseWeapon() {
		rpg.Item itemName = rpg.Character.geteWeapon();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextField weaponName = new JTextField();
		
		weaponName.setEditable(false);
		weaponName.setBounds(70, 20, 450, 60);
		weaponName.setText("Equiped weapon: " + rpg.Character.geteWeapon());
		weaponName.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		contentPane.add(weaponName);
		
		JComboBox chooseWeapon = new JComboBox();
		chooseWeapon.setBounds(600, 20, 450, 60);
		contentPane.add(chooseWeapon);
		
		JTextArea eWeaponInfo = new JTextArea();
		eWeaponInfo.setEditable(false);
		eWeaponInfo.setBounds(70, 90, 450, 450);
		eWeaponInfo.setText(itemName + " stats: \n" +
		"LVL: " + itemName.LVL + "\n" +
		" HP: " + itemName.HP + "\n" +
		" MP: " + itemName.MP + "\n" +
		" S: " + itemName.S + "\n" +
		" A: " + itemName.A + "\n" +
		" I: " + itemName.I + "\n" +
		" L: " + itemName.L + "\n" +
		" Sell price: " + itemName.gold + " gold coins\n" +
		" Rarity: " + itemName.raritys + "\n" +
		" Typ: " + itemName.itemTypes + "\n" +
		" Class: " + itemName.itemClaass + "\n");
		eWeaponInfo.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		contentPane.add(eWeaponInfo);
		
		JFormattedTextField newWeaponInfo = new JFormattedTextField();
		newWeaponInfo.setEditable(false);
		newWeaponInfo.setBounds(600, 90, 450, 450);
		contentPane.add(newWeaponInfo);
		
		JButton showChanges = new JButton("Show changes");
		showChanges.setBounds(725, 556, 200, 30);
		contentPane.add(showChanges);
		
		JButton changeWeapon = new JButton("CHANGE WEAPON");
		changeWeapon.setBounds(1043, 618, 200, 30);
		contentPane.add(changeWeapon);
		
		
	}
}
